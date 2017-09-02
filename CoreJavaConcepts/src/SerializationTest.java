import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationTest {

	public static void main(String[] args) {
		Serialization1 st = new Serialization1();
		st.i = 17;
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File("SerializationSample.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			System.out.println(st);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
