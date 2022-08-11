package Home9.Body;

import Home9.AddSystem.AddUtill;
import Home9.AddSystem.Utill;
import java.util.Arrays;

public class Bouqet implements Utill {
    public Flouwer[] flouwers;
    public Accesuars[] accesuars;

    public Bouqet() {
        this.flouwers = flouwers;
        this.accesuars = accesuars;
    }

    public void addFlouwer() {
        flouwers = (Flouwer[]) AddUtill.addIn(flouwers, new Flouwer());
    }

    public void addAccesuars() {
        accesuars = (Accesuars[]) AddUtill.addIn(accesuars, new Accesuars());
    }

    public int AllPrice() {
        int newPrice = 0;
        for (int i = 0; i < flouwers.length; i++) {
            Flouwer flouwer = flouwers[i];
            newPrice += flouwer.getPrice();
        }
        for (int i = 0; i < accesuars.length; i++) {
            Accesuars accesuar = accesuars[i];
            newPrice += accesuar.getPrice();
        }
        return newPrice;
    }

    public void findFlouwerByHight() {
        int min = getInt("Min- ");
        int max = getInt("Max- ");
        System.out.println(" ");
        System.out.println("Accepted: ");
        for (int i = 0; i < flouwers.length; i++) {
            Flouwer flouwer = flouwers[i];
            if (flouwer.getHight() >= min && flouwer.getHight() <= max) {
                System.out.println(flouwer);
            }
        }
    }

    public void sortByDaysExplorating() {
        // Arrays.sort(flouwers);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < flouwers.length - 1; i++) {
                if (flouwers[i].getDaysExploreting() < flouwers[i + 1].getDaysExploreting()) {
                    isSorted = false;
                    Flouwer count = flouwers[i];
                    flouwers[i] = flouwers[i + 1];
                    flouwers[i + 1] = count;
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "\nFlouwers:- \n";
        for (Flouwer flouwer : flouwers) {
            res += '\t' + flouwer.toString() + '\n';
        }
        res += "Accesuars:- \n";
        for (Accesuars accesuar : accesuars) {
            res += '\t' + accesuar.toString() + '\n';
        }
        return res;
    }


}
