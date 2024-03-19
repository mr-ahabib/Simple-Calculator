import java.io.*;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) {
        File f1=new File("directory/input.txt");
        File f2=new File("directory/output.txt");

        try{
            Scanner sc=new Scanner(f1);
            FileWriter fw=new FileWriter(f2);
            PrintWriter pw=new PrintWriter(fw);
            int i=1,sum=0;
            String str,a,b;
            while (sc.hasNext()) {
                a=sc.nextLine();
                int x=Integer.parseInt(a);
                b=sc.nextLine();
                int y=Integer.parseInt(b);
                sum=x+y;
                str=String.valueOf(sum);  // int to string convert
                pw.println("Line"+" "+i+":"+str);
                i++;
            }
            sc.close();
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);;
        }
    }
}
