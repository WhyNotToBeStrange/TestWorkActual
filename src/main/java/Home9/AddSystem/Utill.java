package Home9.AddSystem;

import java.util.Scanner;

public interface Utill {
    default int getInt(String get) {
        int k;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(get);
                k = scanner.nextInt();
                if (k >= 0) {
                    return k;
                } else {
                    System.out.println("Error, write again.");
                }

                break;
            } catch (Exception exception) {
                System.out.println("Error, write again");
            }
        }
        return k;
    }

    default String getString(String get) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(get);
        return scanner.next();
    }
}
