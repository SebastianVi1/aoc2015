import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ThreeTest {
    @Test
    void solve() {
        Three problem = new Three();
        var result = problem.solve(List.of("<v>"), 1);
        Assertions.assertEquals(4, result);

    }
}
