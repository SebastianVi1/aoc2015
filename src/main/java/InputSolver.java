import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputSolver {
    public static List<String> readInput() throws IOException {
        var Fis = new FileInputStream("input.txt");
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
        var part = args[1];
        int result = 0;
        var input = readInput();
        switch (day) {
            case "1":
                result= new One().solve(input);
        }
        System.out.println(result);
    }
}
