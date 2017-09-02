
public class StringNumOfObject {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = s1 + "Ram";
		String s3 = s1.concat("Ram");
		String s4 = s1.replace('l', 'k');
		String s5 = "HelloRam";
		System.out.println(s3);
		System.out.println(s5);
		System.out.println(s2 == s5);
		System.out.println(s3 == s5);
		
	}

}
