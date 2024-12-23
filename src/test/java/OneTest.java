import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTest {

    @Test
    void solve() {
        One problem = new One();
        var result = problem.solve(List.of(")())())"), 1);
        Assertions.assertEquals(-3, result);
        result = problem.solve(List.of("()())"), 2);
        Assertions.assertEquals(5, result);
    }
}