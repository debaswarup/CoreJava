import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DeseriazationTest {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("SerializationSample.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization1 st = (Serialization1)ois.readObject();
			System.out.println(st.i);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
