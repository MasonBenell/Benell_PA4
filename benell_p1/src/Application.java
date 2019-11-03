import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Application 
{
   public static void main(String[] args) throws IOException 
   {
       DuplicateRemover test = new DuplicateRemover();
       
       test.remove("problem1.txt");
       test.Write("unique_words.txt");
   }
}