import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTest {

@Test
    void solve() {
        One problem = new One();
        var result = problem.solve(List.of(")())())"));
    Assertions.assertEquals(-3, result);
    }
}