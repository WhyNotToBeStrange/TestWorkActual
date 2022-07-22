import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Work4Test {
    @ParameterizedTest
    @MethodSource("matrixValue")
    void test(int k,int step, String expected) {
        Work4 tester = new Work4();

        String matrix = tester.Matrix(k,step);

        Assertions.assertEquals(expected, matrix);
    }

    private static Stream<Arguments> matrixValue() {
        return Stream.of(
                Arguments.of(4,2, "1 2 \n3 4 \n"),
                Arguments.of(7,3, "1 2 3 \n4 5 6 \n7 0 0 "),
                Arguments.of(9,3, "1 2 3 \n4 5 6 \n7 8 9 \n"),
                Arguments.of(21,5, "1 2 3 4 5 \n6 7 8 9 10 \n11 12 13 14 15 \n16 17 18 19 20 \n21 0 0 0 0 ")
        );
    }

}