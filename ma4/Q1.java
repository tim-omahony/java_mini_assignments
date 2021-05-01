package ma4;
import java.util.Scanner;
import java.io.*;
public class Q1 {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the name of the file: ");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            input.close();
            File f = new File(name);
            if (!f.exists()) {
                System.out.println(name + " does not exist");
                System.exit(1);
            }
//          second scanner that reads from the file specified in the first scanner
            Scanner fileReader = new Scanner(f);

            int numLines = 0;
            int wordCount = 0;
            int charCount = 0;
//          while loop runs until the last line in the file
            while (fileReader.hasNext()) {
                numLines++;
                String line = fileReader.nextLine();
                charCount += line.length();
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            System.out.println(f.getName() + " has:");
            System.out.println(charCount+ " characters");
            System.out.println(wordCount + " words");
            System.out.println(numLines + " lines");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
