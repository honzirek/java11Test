import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Java11Test {

    @Test
    public void testVarKeyword() {
        var list = List.of("str1", "str2", "str3");

        Assertions.assertEquals(3, list.size());

        Assertions.assertThrows(java.lang.UnsupportedOperationException.class, () -> list.add("str4"));
    }
}
