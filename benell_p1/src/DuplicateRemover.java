import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DuplicateRemover 
{
   private Set<String> uniqueWords;
   
   
   public void remove(String dataFile) throws FileNotFoundException
   {
       String temp;
       uniqueWords = new HashSet<String>();
       Scanner in = new Scanner(new File(dataFile));
       while(in.hasNext())
       {
           temp=in.next();
           
           uniqueWords.add(temp);
       }
       
       in.close();  
   }
  
   
   public void Write(String outputFile) throws IOException
   {
	   File text;
	   FileWriter textWrite = null;
	   
	   text = new File(outputFile);

	   if(text.exists()) 
	   {
		   textWrite = new FileWriter(text, true);
		   Iterator check=uniqueWords.iterator();

		   while(check.hasNext() == true)
		   {
			   String str=(String)check.next();
			   textWrite.write(str+"\n");     
		   }
		   
		   textWrite.close();
	   }
	   
	   else
	   {
		   textWrite = new FileWriter(text, true);
		   Iterator check=uniqueWords.iterator();

		   while(check.hasNext())
		   {
			   String str=(String)check.next();
			   textWrite.write(str+"\n");     
		   }
		   
		   textWrite.close();
	   }
   	}
}