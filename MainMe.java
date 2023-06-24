import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class MainMe {
    public static void main(String args[]) {

        try {
            Scanner fileScanner = new Scanner(new File("file/myFile.txt"));

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());

            }
            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}