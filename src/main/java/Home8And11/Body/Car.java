package Home8And11.Body;

public class Car extends Transport{
    public String collor;

    public Car(String name, double price, int maxSpeed,int hPower, double consumption, String collor) {
        super(name, price, maxSpeed,hPower, consumption);
        this.collor= collor;

    }

    public Car(String[] array) {
        this(array[0],Double.parseDouble(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),
                Integer.parseInt(array[4]),array[5]);
    }
    public String toOut(){
        return "Car:"+","+name+ ","+price+","+maxSpeed+","+hPower+","+consumption
                +","+collor ;

    }

    public String toString(){
      return "Car:"+" Name:"+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption
            +"his color"+collor ;

  }
    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }
}
