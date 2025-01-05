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

        if (part == 2) {
            niceWordCounter = 0;

            for (String input : lines) {
                char[] arrChar = input.toCharArray();
                boolean hasNoOverlappingPair = false;
                for (int i = 0; i < arrChar.length - 1; i++) {
                    String pair = "" + arrChar[i] + arrChar[i + 1];
                    for (int j = i + 2; j < arrChar.length - 1; j++) {
                        if (pair.equals("" + arrChar[j] + arrChar[j + 1])) {
                            hasNoOverlappingPair = true;
                            break;
                        }
                    }
                    if (hasNoOverlappingPair){ break;}
                }
                if (!hasNoOverlappingPair) continue;


                boolean hasRepeatingLetterWithGap = false;
                for (int i = 0; i < arrChar.length - 2; i++) {
                    if (arrChar[i] == arrChar[i + 2]) {
                        hasRepeatingLetterWithGap = true;
                        break;
                    }
                }
                if (!hasRepeatingLetterWithGap) continue;


                niceWordCounter++;
            }


        }
    return niceWordCounter;

    }

}

