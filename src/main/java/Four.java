import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Four {
    public int solve(List<String> lines, int part) throws NoSuchAlgorithmException {
        var secretKey = lines.getFirst();


        for (int i = 0;; i++) {
            String newKey = "%s%d".formatted(secretKey,i);
            var hex = DigestUtils.md5Hex(newKey);
            if (hex.startsWith("000000")){
                return i;
            }
        }
    }
}
