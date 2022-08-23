package Home10.Run;

import Home10.DattaStorage.Storage;
import Home10.Threads.ThreadWorker;

public class Runner {
    private int minIndex;
    private int maxIndex;
    private int count;
    private Thread[] finder;
    private Storage storage;

    public Runner(int minIndex, int maxIndex, int count, Storage storage) {
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
        this.count = count;
        this.storage = storage;
        threadWork();
    }

    public void startForThreads() {
        for (Thread thread : finder) {
            thread.start();
        }
    }

    public void joinThreads() throws InterruptedException {
        for (Thread thread : finder) {
            thread.join();
        }
    }

    public void threadWork() {
        int part = (maxIndex - minIndex) / count;
        finder = new Thread[count];
        int newMin = minIndex;
        int newMax = minIndex;
        for (int i = 0; i < count; i++) {
            if (first(i)) {
                newMax += part;
            } else if (last(i)) {
                newMax = maxIndex;
                newMin += part;
            } else {
                newMax += part;
                newMin += part;
            }
            finder[i] = new Thread(new ThreadWorker(newMin + 1, newMax, storage));
        }
    }

    private boolean first(int num) {
        return num == 0;
    }

    private boolean last(int num) {
        return num == this.count - 1;
    }

    public int getMinIndex() {
        return minIndex;
    }

    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Thread[] getFinder() {
        return finder;
    }

    public void setFinder(Thread[] finder) {
        this.finder = finder;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
