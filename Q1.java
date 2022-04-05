 import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try {
            File file = new File("5-4-22/num1.txt");
            File file2=new File("5-4-22/num2.txt");
            FileReader reader = new FileReader(file);
            String data = "";
            boolean b=true;
            System.out.print("Previous data : ");
            while(b==true) {
                int value = reader.read();
                if(value == -1) {
                    b=false;
                    break;
                }
               char c=(char)value;
               data+=c;
            }
            System.out.println(data);
            
            reader.close();

            FileWriter writer = new FileWriter(file2);
            writer.append(data+" " );
            writer.close();
        } catch(Exception f) {
           f.printStackTrace();
        }
    }
}
    
}
