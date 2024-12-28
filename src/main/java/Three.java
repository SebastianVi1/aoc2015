import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three {

    public int solve(List<String> lines, int part){
        int houseCounter = 1;
        int[] actualCordenates = {0,0};
        HashSet<String> cordenates = new HashSet<String>();
        cordenates.add(Arrays.toString(actualCordenates));
        String chain = lines.toString();
        for (int i = 0; i < chain.length(); i++){
            char arrow = chain.charAt(i);
            if (arrow == '^') {
                actualCordenates[1] += 1;
            }
            else if (arrow == 'v'){
                actualCordenates[1] -= 1;
            } else if (arrow == '<') {
                actualCordenates[0] -= 1;
            } else if (arrow == '>') {
                actualCordenates[0] += 1;
            }

            cordenates.add(Arrays.toString(actualCordenates));
        }

     return cordenates.size();
    }
}
