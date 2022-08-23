package Home10;

import Home10.DattaStorage.Storage;
import Home10.Run.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void corectWorkingTest() throws Exception {
        int first = 2;
        int last = 20;
        int threads = 3;
        Storage storage = new Storage();
        Runner runner = new Runner(first, last, threads, storage);
        runner.startForThreads();
        runner.joinThreads();
        int[][] expect = {{ 3, 5, 7}, {11, 13}, {17, 19}};
        int[] res = storage.getSimply();
        for (int[] subExpect:expect) {
            assertTrue(subsequenceCheck(res,subExpect));
        }
    }
    public boolean subsequenceCheck(int[] sequence, int[] subsequence) {
        boolean isSubsequence = false;
        if (sequence.length > subsequence.length) {
            for (int i = 0; i < sequence.length - subsequence.length + 1; i++) {
                if (isSubsequence) {
                    break;
                }
                int flag = i;
                for (int value : subsequence) {
                    if (value == sequence[flag]) {
                        isSubsequence = true;
                        ++flag;
                    } else {
                        isSubsequence = false;
                        break;
                    }
                }
            }
        } else {
            return false;
        }
        return isSubsequence;
    }
}