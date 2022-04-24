import java.util.*;
import java.io.*;
public class RandomFileGenerator
{
     public static void main(String args[]) throws IOException{
         Random generator = new Random();
         PrintWriter randomFile;
         randomFile = new PrintWriter(new FileWriter("random2.txt"));
         for(int i=1; i<2001; i++)
         {
             randomFile.println(generator.nextInt(2001));
         }
         randomFile.close();
         
         PrintWriter orderedFile;
         orderedFile = new PrintWriter(new FileWriter("ordered.txt"));
         for(int i=1; i<2001; i++)
         {
             orderedFile.println(i);
         }
         orderedFile.close();
         
         PrintWriter reverseFile;
         reverseFile = new PrintWriter(new FileWriter("reverse.txt"));
         for(int i=2000; i>0; i--)
         {
             reverseFile.println(i);
         }
         reverseFile.close();
        }
}
