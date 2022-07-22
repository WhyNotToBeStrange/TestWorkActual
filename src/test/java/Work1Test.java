import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Work1Test {
    @Test
    void test(){
        Work1 find = new Work1();
        int[] first={2,4,6,3,-1,1};
        int[] second={4,6,3};
        boolean res = find.sequence(first,second);
        Assertions.assertTrue(res);


    }

}