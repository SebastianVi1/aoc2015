import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three {

    public int solve(List<String> lines, int part){
        int[] santaActualCordenates = {0,0};
        int[] roboSantaActualCordenates = {0,0};

        HashSet<String> cordenates = new HashSet<String>();
        cordenates.add(Arrays.toString(santaActualCordenates));


        String chain = lines.toString();
        for (int i = 0; i < chain.length(); i++){
            char arrow = chain.charAt(i);
            if ((i+ 1) % 2 == 0 && arrow == '^') {
                santaActualCordenates[1] += 1;
            }
            else if ((i+1) % 2 == 0 && arrow == 'v'){
                santaActualCordenates[1] -= 1;
            } else if ((i+1) % 2 == 0 && arrow == '<') {
                santaActualCordenates[0] -= 1;
            } else if ((i+1) % 2 == 0 && arrow == '>') {
                santaActualCordenates[0] += 1;
            }

            if ((i+1) % 2 != 0 && arrow == '^') {
                roboSantaActualCordenates[1] += 1;
            }
            else if ((i+1) % 2 != 0 && arrow == 'v'){
                roboSantaActualCordenates[1] -= 1;
            } else if ((i+1) % 2 != 0 && arrow == '<') {
                roboSantaActualCordenates[0] -= 1;
            } else if ((i+1) % 2 != 0 && arrow == '>') {
                roboSantaActualCordenates[0] += 1;
            }

            cordenates.add(Arrays.toString(santaActualCordenates));
            cordenates.add(Arrays.toString(roboSantaActualCordenates));
        }

     return cordenates.size();
    }
}
