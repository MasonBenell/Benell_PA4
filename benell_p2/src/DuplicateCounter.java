import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;


public class DuplicateCounter 
{

	private Map<String,Integer> unique_word_counts;

	public void count(String dataFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File(dataFile));
		
		String temp;

		unique_word_counts = new HashMap<String,Integer>();


		while(in.hasNext())
		{
			temp = in.next();

			if (unique_word_counts.containsKey(temp)) 
			{
				unique_word_counts.put(temp, unique_word_counts.get(temp) + 1);
			}
			else 
			{ 
				unique_word_counts.put(temp, 1);
			}
		}

		in.close();
	}
	
	
	public void Write(String outputFile) throws IOException
	{
		FileWriter out = new FileWriter(outputFile);
		   
		for(Entry<String, Integer> entry : unique_word_counts.entrySet())
		{
			out.write(entry.getKey() + " " + entry.getValue() + "\n");
		}
		out.close();
	}
	
}
