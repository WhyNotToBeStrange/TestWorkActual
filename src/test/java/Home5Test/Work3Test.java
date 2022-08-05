package Home5Test;

import Home5.Work3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Work3Test {
    @ParameterizedTest
    @MethodSource("numbers")
    void test(int[] arr, boolean expected) {
        Work3 tester = new Work3(arr);
        boolean res = tester.find(arr);
        Assertions.assertEquals(expected, res);
    }

    private static Stream<Arguments> nummbers() {
        return Stream.of(
                Arguments.of(new int[]{12, 13, 14, 15, 16}, true),
                Arguments.of(new int[]{11, 13, 14, 15, 16}, true)
        );
    }

}