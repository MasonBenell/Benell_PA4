import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;

public class Application 
{
   public static void main(String[] args) throws IOException 
   {
       DuplicateCounter test = new DuplicateCounter();
       
       test.count("problem2.txt");
       test.Write("unique_word_counts.txt");
   }
}