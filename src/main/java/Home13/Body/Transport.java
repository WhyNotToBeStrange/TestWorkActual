package Home13.Body;

public abstract class Transport {
    public String name;
    public double price;
    public int maxSpeed;
    public int hPower;
    public double consumption;


    public Transport(String name, double price, int maxSpeed, int hPower, double consumption) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.hPower =hPower;
        this.consumption = consumption;
    }

    public Transport(String[] array) {
        this(array[0],Double.parseDouble(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),
                Integer.parseInt(array[4]));

    }
    public  String toOut(){
        return "Transport:"+","+name+ ","+price+","+maxSpeed+","+hPower+","+consumption;

    }

    public  String toString(){
        return "Transport:"+" Name:"+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int gethPower() {
        return hPower;
    }

    public void sethPower(int hPower) {
        this.hPower = hPower;
    }
}
