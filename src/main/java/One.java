import java.util.List;

public class One {
    public int solve(List<String> lines){
        int counter = 0;
        
        for (String line : lines) {
            for (char c : line.toCharArray()) {
                if (c == '(') {
                    counter++;

                } else if (c == ')') {
                    counter--;
                }
            }
        }
        return counter;
    }
}
