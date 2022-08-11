package Home9.Body;

public class Flouwer {
    public String kind;
    public int price;
    public int daysExploreting;
    public int hight;

    public Flouwer() {
        this.kind = kind;
        this.price = price;
        this.daysExploreting = daysExploreting;
        this.hight = hight;
    }

    public boolean sizeParemetrizeNorm(int min, int max) {
        if (getHight() >= min && getHight() <= max) {
            return true;
        } else {
            return false;
        }
    }

    public int dayCheck(Flouwer flouwerElse) {
        if (this.getDaysExploreting() < flouwerElse.getDaysExploreting()) {
            return -1;
        } else if (this.getDaysExploreting() > flouwerElse.getDaysExploreting()) {
            return 1;
        } else return 0;

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDaysExploreting() {
        return daysExploreting;
    }

    public void setDaysExploreting(int daysExploreting) {
        this.daysExploreting = daysExploreting;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String toString() {
        return kind + "his price" + price + " his Days Explorating" + daysExploreting + "his hight of stem" + hight;
    }
}
