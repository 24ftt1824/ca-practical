package P5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p5_5 {
     public static void main(String[] args) throws IOException {
        
        String filename = "C:/Practical 5/QReceipt.text";
        FileWriter fw = new FileWriter(filename,true); 

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Receipt generated. Thank you.");

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedLDT = ldt.format(dtf);
        fw.write(formattedLDT + "\n");
        

        fw.write("Hi," + name.toUpperCase() + "\r\n");
        int random = (int) (Math.random()*100);
        fw.write("your queue No is:" + random + "\r\n");
        
        fw.close();

    }
}
