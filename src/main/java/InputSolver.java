import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputSolver {
    public static List<String> readInput() throws IOException {
        var Fis = new FileInputStream("threeInput.txt");
        var inputReader = new InputStreamReader(Fis);
        var reader = new BufferedReader(inputReader);
        List<String> inputList = new ArrayList<>();
        while ((reader.ready())){
            String line = reader.readLine();
            inputList.add(line);
        }
        return inputList;
    }
    public static void main(String[] args) throws IOException {
        var day = args[0];
        var part = Integer.parseInt(args[1]);

        int result = 0;
        var input = readInput();
        switch (day) {
            case "1":
                result= new One().solve(input, part);
            case "3":
                result = new Three().solve(input, part);

        }
        System.out.println(result);
    }
}
