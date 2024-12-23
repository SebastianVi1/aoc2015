import java.util.ArrayList;
import java.util.List;

public class One {
    public int solve(List<String> lines, int part){
        int counter = 0;
        
        for (String line : lines) {
            var arr = line.toCharArray();
            for (int i = 0; i < line.length(); i++) {
                if (arr[i] == '(') {
                    counter++;
                } else if (arr[i] == ')') {
                    counter--;
                }
                if (part == 2 && counter < 0){
                    return i+ 1;
                }
            }
        }
        return counter;
    }
}
