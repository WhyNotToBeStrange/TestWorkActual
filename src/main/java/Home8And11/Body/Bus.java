package Home8And11.Body;

public class Bus extends Transport{
    public int capacity;
    public Bus(String name, double price, int maxSpeed, int hPower, double consumption,int capacity) {
        super(name, price, maxSpeed, hPower, consumption);
    this.capacity= capacity;
    }

    public Bus(String[] array) {
        this(array[0],Double.parseDouble(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),
                Integer.parseInt(array[4]),Integer.parseInt(array[5]));
    }
    public String toOut(){
        return "Bus:"+name+ ","+price+","+maxSpeed+","+hPower+","+consumption
                +","+capacity ;

    }

    public String toString(){
        return "Bus:"+" Name:"+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption
                +"his capacity"+capacity ;

    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
