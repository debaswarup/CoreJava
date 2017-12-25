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
	
	public static void main(String[] args) {
		/*Path path = Paths.get("InputFile.txt");
		BufferedReader br = Files.newBufferedReader(path);*/
		
		
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
