package Home9.Body;

import Home9.AddSystem.AddUtill;
import Home9.Body.Bouqet;

public class Shop {
    public Bouqet[] bouqets;

    public Shop() {
        this.bouqets = bouqets;
    }

    public void addBouqet(Bouqet newbouqet) {
        bouqets = (Bouqet[]) AddUtill.addIn(bouqets, newbouqet);

    }

    public String toString() {
        String bouqetRes = " ";
        for (int i = 0; i < bouqets.length; i++) {
            Bouqet bouqet = bouqets[i];
            bouqetRes += bouqet.toString() + '\n';
        }
        return bouqetRes;
    }


    public Bouqet[] getBouqet() {
        return bouqets;
    }

    public void setBouqet(Bouqet[] bouqet) {
        this.bouqets = bouqet;
    }
}
