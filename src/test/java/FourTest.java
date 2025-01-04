import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class FourTest {

    @Test
    void solve() throws NoSuchAlgorithmException {
        Four problem = new Four();
        var result = problem.solve(List.of("yzbqklnj"), 1);
        Assertions.assertEquals(609043, result);
    }
}
