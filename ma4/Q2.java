package ma4;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
public class Q2 {
    public static void main(String[] args) throws IOException {
        Date today = new Date();
        String todayString = today.toString().replace(':', '-');
        System.out.print("Enter the name of the file: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        input.close();
//        assigning a new string variable with the current date appended.
        String newName = name + todayString;
        File f1 = new File(name);
//        creating a new file (f2) that f1 will be renamed to
        File f2 = new File(newName);

        try {
            Files.move(f1.toPath(), f2.toPath());
            System.out.println("File has been renamed to: " + "'" + f2 + "'" + " :)");
        }catch (IOException e){
            System.out.println("File: " + "'" + name + "'" + " does not exist :(");
            }
        }
    }
