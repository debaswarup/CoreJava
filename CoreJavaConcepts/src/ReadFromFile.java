import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFromFile {
	
	public static void main(String[] args) 
	{
		ReadFromFile rf = new ReadFromFile();
		//rf.readWithPath();
		rf.tryWithResource();
	}
	
	private void tryWithResource()
	{
		try(FileInputStream fis = new FileInputStream("InputFile.txt"))
		{
			byte[] contentInByte = fis.readAllBytes();
			System.out.println(new String(contentInByte));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readWithPath()
	{
		Path path = Paths.get("InputFile.txt");
		try {
			BufferedReader br = Files.newBufferedReader(path);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void readLegacyWay()
	{
		File f = new File("InputFile.txt");
		try {
			FileInputStream fis =  new FileInputStream(f);
			InputStreamReader reader = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(reader);
			String s;
			while((s = br.readLine())!=null)
			{
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
