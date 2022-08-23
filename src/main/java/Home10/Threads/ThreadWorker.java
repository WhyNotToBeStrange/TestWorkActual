package Home10.Threads;

import Home10.DattaStorage.Storage;

import java.util.Arrays;

public class ThreadWorker implements Runnable{
    private int[] array;
    private int min;
    private int max;
    private Storage storage;

    public ThreadWorker(int min, int max, Storage storage) {
        this.array = new int[0];
        this.min = min;
        this.max = max;
        this.storage = storage;
    }

    public void run() {
        for (int i = min; i <= max; i++) {
            if(isSimply(i)){
                int old=array.length;
                array= Arrays.copyOf(array,old+1);
                array[old]=i;
            }
        }
        storage.addSimples(array);
    }

    public boolean isSimply(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

}
