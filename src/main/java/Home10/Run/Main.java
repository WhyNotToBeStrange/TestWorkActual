package Home10.Run;

import Home10.DattaStorage.Storage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min;
        int max;
        int threads;

        Storage storage = new Storage();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min number-");
        min = scanner.nextInt();
        System.out.println("Your min number= "+min);
        System.out.println("Enter max number-");
        max = scanner.nextInt();
        System.out.println("Your max number- "+max);
        System.out.println("Enter count of threads-");
        threads = scanner.nextInt();
        System.out.print("Your count of Threads- "+ threads + "\n");



        Runner runner = new Runner(min, max, threads, storage);
        runner.startForThreads();

        try{
        runner.joinThreads();
        }catch (InterruptedException e){
        }

        for (int num: storage.getSimply()) {
            System.out.println(num);
        }
    }

}
