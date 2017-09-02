import java.util.regex.Pattern;


public class RegExTest {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".a", "Ram")); //false //. means any char
		System.out.println(Pattern.matches(".a.", "Ram")); //true
		System.out.println(Pattern.matches(".a*", "Rameshwar"));//false
		System.out.println(Pattern.matches("[abc]", "a"));//true //[] used only to match one char from original string
		System.out.println(Pattern.matches("[abc]", "ab"));//false //since there are 2 chars in original string
		System.out.println(Pattern.matches("[ac][bd]", "ab"));//true
		System.out.println(Pattern.matches("[^abc]", "a"));//false //Anything except abc
		System.out.println(Pattern.matches("[^abc]", "d"));//true
		System.out.println(Pattern.matches("[a-d]", "c"));//true //Anything in the range a-d
		System.out.println(Pattern.matches("[a-d]", "d")); //true
		System.out.println(Pattern.matches("[a-d]", "e")); //false
		System.out.println(Pattern.matches("[a-d]", "A")); //false
		System.out.println(Pattern.matches("[a-dA-D]", "A"));//true
		System.out.println(Pattern.matches("[a-dA-D]", "aB"));//false since there are 2 char in original string
		System.out.println(Pattern.matches("[a-dk-n]", "m"));//true
		System.out.println(Pattern.matches("[a-dk-n]", "c"));//true
		System.out.println(Pattern.matches("[a-dk-n]", "p"));//false
		System.out.println(Pattern.matches("[a-z&&[^p-s]]", "q")); //false
		System.out.println(Pattern.matches("[a-z&&[^p-s]]", "t")); //true
		System.out.println(Pattern.matches("[a-z&&[^abc]]", "d")); //true
		System.out.println(Pattern.matches("[a-z&&[^abc]]", "c")); //false
		
		
		System.out.println(Pattern.matches("[akp]?", "ram"));//false // a OR k OR p only once
		System.out.println(Pattern.matches("[akp]?", "pk"));//false
		System.out.println(Pattern.matches("[akp]?", "k"));//false
		
		System.out.println(Pattern.matches("[akp]+", "kap")); //true // a or k or p can appear atleast once
		
		System.out.println(Pattern.matches("[akp]*", "def")); //false
		System.out.println(Pattern.matches("[akp]*", "pap")); //true
		
		//X{n}	X occurs n times only
		//X{n,}	X occurs n or more times
		//X{y,z}	X occurs at least y times but less than z times
		
		//http://www.javatpoint.com/java-regex
		

	}

}
