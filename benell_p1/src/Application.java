import java.io.IOException;

public class Application 
{
   public static void main(String[] args) throws IOException 
   {
       DuplicateRemover test = new DuplicateRemover();
       
       test.remove("problem1.txt");
       test.Write("unique_words.txt");
   }
}
