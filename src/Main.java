import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] Alphabets={
            "Aa","Bb","Cc","Dd","Ee","Ff","Gg","Hh","Ii",
                "Jj","Kk","Ll","Mm","Nn","Oo","Pp","Qq","Rr","Ss",
                "Tt","Uu", "Vv","Ww","Xx","Yy","Zz",
                "1","2","3","4","5","6","7","8","9"};
        try {
            FileWriter fileWriter=new FileWriter("work");
            for (String alph:Alphabets) {
               fileWriter.write(alph+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileReader fileReader;
        try {
            fileReader = new FileReader("work");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner=new Scanner(fileReader);
        int joop= Alphabets.length;
        for (int i = 0; i < joop; i++) {
            System.out.println(i+1+": "+scanner.nextLine());

        }

    }
}