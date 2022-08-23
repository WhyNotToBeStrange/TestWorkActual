package Home8And11.InputOutputServis;

import Home8And11.Body.Bus;
import Home8And11.Body.Car;
import Home8And11.Body.Transport;
import Home8And11.Body.Truck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class InputOutputFileData implements InputOutputStorage{
    private String inputFile;
    private String outputFile;

    public InputOutputFileData(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    public InputOutputFileData(String file){
        this(file,file);
    }

    @Override
    public Transport[] readTransports() {
        Transport[] transports = new Transport[]{};
        try(FileInputStream inputStream = new FileInputStream(inputFile)){
            String fileInfo = StringContentOf(inputStream);
            String[] carString = fileInfo.split(";\r\n");
            transports = new Transport[fileInfo.length()];
            for (int i = 0; i < carString.length; i++) {
            transports[i] = transportCreat(carString[i].split(","));
            }

        }catch (IOException e){
            System.err.println("Error with file!");
            e.printStackTrace();

        }

        return new Transport[0];
    }

    @Override
    public void writeTransports(Transport[] transports) {
        StringJoiner stringJoiner = new StringJoiner(";\r\n");
        for (Transport transport:transports) {
            stringJoiner.add(transport.toOut());
        }
            try{
                FileOutputStream outputStream = new FileOutputStream(outputFile);
                outputStream.write(stringJoiner.toString().getBytes());

            }catch (IOException e){
                System.err.println("Error file!");
                e.printStackTrace();
        }
    }
    private Transport transportCreat(String[] array){
        Transport transport = null;
        String transportCount = array[0];
        switch (transportCount){
            case "Car":
                transport = new Car(array);
                break;
            case "Truck":
                transport = new Truck(array);
                break;
            case "Bus":
                transport = new Bus(array);

        }
        return transport;
    }
    private String StringContentOf(FileInputStream inputStream) throws IOException{
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return new String(bytes);
    }
}
