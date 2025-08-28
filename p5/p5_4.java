package P5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class p5_4 {
    public static void main(String[] args) throws IOException {
        String filename = "C:/Practical 5/Modulus Questions.txt";

        FileWriter fw = new FileWriter(filename,true); 

        int random = (int) (Math.random()*100);
        int random1 = (int) (Math.random()*100);

        System.out.println("A new question added");
        System.out.print(" ");

        fw.write(random + " % " + random1 + " = ?" + "\r\n");
        fw.close();

    }
}

  
