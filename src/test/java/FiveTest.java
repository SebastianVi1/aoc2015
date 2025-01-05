import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class FiveTest {
    @Test
    void solve() throws NoSuchAlgorithmException {
        Five problem = new Five();
        var result = problem.solve(List.of("qjhvhtzxzqqjkmpb"), 2);
        Assertions.assertEquals(1, result);
    }
}
