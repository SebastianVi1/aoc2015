import java.util.List;

public class Five {
    public int solve(List<String> lines, int part) {
        int niceWordCounter = 0;

        for (String input : lines) {
            int vowelCount = 0;
            var charArr = input.toCharArray();
            for (char letter : charArr){

                if("aeiou".indexOf(letter) >= 0){
                    vowelCount++;
                }

            }
            if (vowelCount < 3) {
                continue;
            }

            boolean containsDoubleLetter = false;
            for (int i = 0; i < charArr.length -1; i++) {
                if (charArr[i] == charArr[i+1]) {
                    containsDoubleLetter = true;
                    break;
                }
            }

            if (!containsDoubleLetter) {
                continue;
            }
            if (input.contains("ab") || input.contains("cd") || input.contains("pq") || input.contains("xy")) {
                continue;
            }
            niceWordCounter++;

        }
        return niceWordCounter;
    }

}

