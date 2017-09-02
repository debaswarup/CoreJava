
class Stack {

	int arr[] = new int[20];
	int index;	
	
	public void push(int elementToPush)
	{
		arr[index++] = elementToPush;
	}
	
	public int pop()
	{
		return arr[--index];
	}
	
	
}


public class StackTest
{
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(12);
		
		System.out.println(st.pop());
	}
}
