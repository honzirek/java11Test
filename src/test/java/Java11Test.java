import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.LongStream;

public class Java11Test {

    @Test
    public void testVarKeyword() {
        var list = List.of("str1", "str2", "str3");

        Assertions.assertEquals(3, list.size());

        Assertions.assertThrows(java.lang.UnsupportedOperationException.class, () -> list.add("str4"));
    }

    UnaryOperator<Long> fact = x -> x == 0 ? 1 : x * this.fact.apply(x-1);

    @Test
    public void testRecursiveLambda() {
        System.out.println("fact: " + fact.apply(5000L));
    }

    @Test
    public void testStreamFactorial() {
        long fact = LongStream.rangeClosed(1, 100000).reduce(1, (x, y) -> x*y);
        System.out.println("stream fact: " + fact);
    }
}
