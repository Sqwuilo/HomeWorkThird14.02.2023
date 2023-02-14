import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String line = " ";
        for (int i = a; i <= b; i++) {
            if (i * i <= b){
                line += i + " ";
            }
        }
        fileRead(line);

    }

    public static void fileRead(String line)  {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test1.txt");
            fileOutputStream.write(line.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e){

        }
    }

}