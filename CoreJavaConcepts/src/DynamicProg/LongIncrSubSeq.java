package DynamicProg;

public class LongIncrSubSeq {
	
	public static void main(String[] args) {
		
		//int[] inputArr = {10,22,9,33,21,50,41,60,80};
		int[] inputArr = {50, 3, 10, 7, 40, 80};
		
		int[] outputArr = new int[inputArr.length];
		int max=0;
		int outputArrCount=0;
		
		for(int a : inputArr)
		{
			if(a>max)
			{
				max = a; //10,22,33,50,60,80
				outputArr[outputArrCount++] = a; //10,22,33,50,60,80
			}
		}
		
		for(int a: outputArr)
		{
			System.out.println(a);
		}
	}

}
