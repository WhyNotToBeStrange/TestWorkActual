package Home9.Console;

import Home9.AddSystem.Utill;
import Home9.Body.Bouqet;
import Home9.Body.Shop;

public class Main implements Utill {
    private Shop shop;

    public Main(Shop shop) {
        this.shop = shop;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Main flouwerShop = new Main(shop);
        flouwerShop.begin();
    }

    private void BouquetWorks(Bouqet bouqet) {
        int choose = 0;

        while (choose != 6) {
            System.out.println(" ");
            System.out.println(" Add new flouwer-1");
            System.out.println(" Add new accesuar-2");
            System.out.println(" Show price-3");
            System.out.println(" Find by flowers hight-4");
            System.out.println(" Sort by days explorated-5");
            System.out.println(" Exit-6");

            choose = getInt("Your choice ");

            switch (choose) {
                case 1: {
                    bouqet.addFlouwer();
                }
                case 2: {
                    bouqet.addAccesuars();
                }
                case 3: {
                    System.out.println(" ");
                    System.out.println(" Price of this Bouqets " + bouqet.AllPrice());
                }
                case 4: {
                    bouqet.findFlouwerByHight();
                }
                case 5: {
                    bouqet.sortByDaysExplorating();
                    System.out.println(bouqet);
                }
            }
        }
    }

    private void Choice() {
        System.out.println(" ");
        System.out.println("  ");
        for (int i = 0; i < shop.getBouqet().length; i++) {
            System.out.println((i + 1) + " -> " + shop.getBouqet()[i].toString());
        }
        int choose = 0;
        while (true) {
            choose = getInt(" Your choose");
            if (choose - 1 < shop.getBouqet().length && choose - 1 >= 0) {
                BouquetWorks(shop.getBouqet()[choose - 1]);
                break;
            } else if (choose == 0) {
                break;
            } else {
                System.out.println("Write number of bouget to choose him ");
            }
        }
    }

    private Bouqet newBouquet() {
        int choose = 0;
        Bouqet bouqet = new Bouqet();

        while (choose != 3) {
            System.out.println(" ");
            System.out.println(" Add flower-1");
            System.out.println(" Add accessory-2");
            System.out.println(" Step Back-3");

            choose = getInt("Your choice- ");

            switch (choose) {
                case 1: {
                    bouqet.addFlouwer();
                }
                case 2: {
                    bouqet.addAccesuars();
                }
            }
        }
        return bouqet;
    }


    public void begin() {
        int choose = 0;
        while (choose != 4) {
            System.out.println("Print out Bouqet's-1 ");
            System.out.println("Make your new Bouqet-2 ");
            System.out.println("More with Bouqet ");
            System.out.println("Exit-4 ");
            choose = getInt("Your choice - ");
            switch (choose) {
                case 1: {
                    System.out.println(shop);
                }
                case 2: {
                    Bouqet bouqet;
                    bouqet = newBouquet();
                    shop.addBouqet(bouqet);
                    System.out.println(" ");
                    System.out.println("Set price of this bouqet" + bouqet.AllPrice());

                }
                case 3: {
                    Choice();
                }
            }
        }
    }
}


