import java.io.*;
import java.util.*;
public class Copy {
    public static void main(String[] args) {

        String sourceFile = args[0];
        String destinationFile = args[1];
        try(Scanner in = new Scanner(new File(sourceFile));
            PrintWriter out = new PrintWriter(new FileWriter(destinationFile))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println(line);
            }
            System.out.println("Source file copied to destination successfully.");
        }catch (IOException e){
            System.out.println("error : " + e.getMessage());
        }
    }
}
