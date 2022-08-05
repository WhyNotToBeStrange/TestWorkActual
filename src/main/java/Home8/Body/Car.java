package Home8.Body;

public class Car extends Transport{
    public String collor;

    public Car(String name, double price, int maxSpeed,int hPower, double consumption, String collor) {
        super(name, price, maxSpeed,hPower, consumption);
        this.collor= collor;

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
