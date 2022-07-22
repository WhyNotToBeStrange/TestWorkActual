import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Work2Test {
    @Test
    void test1()

    {

        int array[] = {-7, 111, 22, 333, 4, 88888, 777777, 666};
        Work2 finder = new Work2(array);
        int longest = finder.findLongest(array);
        int shortest = finder.findShortest(array);
        int longestLength = finder.findLongestLength(array);
        int shortestLength = finder.findShortestLength(array);
        Assertions.assertEquals(777777,longest);
        Assertions.assertEquals((-7),shortest);
        Assertions.assertEquals(6,longestLength);
        Assertions.assertEquals(1,shortestLength);
    }
}