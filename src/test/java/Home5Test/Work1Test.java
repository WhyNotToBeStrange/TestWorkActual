package Home5Test;

import Home5.Work1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Work1Test {
    @Test
    void test(){
        Work1 find = new Work1();
        int[] first={2,4,6,3,-1,1};
        int[] second={4,6,3};
        boolean res = find.sequence(first,second);
        Assertions.assertTrue(res);


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