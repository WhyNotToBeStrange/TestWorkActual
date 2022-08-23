package Home10.DattaStorage;

import java.util.Arrays;

public class Storage {
    private int[] simply;

    public Storage() {
        this.simply = new int[0];
    }
    synchronized public void addSimples(int[] toAdd){
        simply= Arrays.copyOf(simply, simply.length + toAdd.length);
        for (int i = toAdd.length - 1;  i >= 0; i--) {
            simply[simply.length - 1 - i] = toAdd[toAdd.length - i - 1];
        }

    }

    public int[] getSimply() {
        return simply;
    }

    public void setSimply(int[] simply) {
        this.simply = simply;
    }
}
