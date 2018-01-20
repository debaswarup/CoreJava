package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		Student s1 = new Student(1, 180);
		Student s2 = new Student(1, 190);
		Student s3 = new Student(1, 160);
		Student s4 = new Student(1, 120);
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4);
		
		students.forEach(s -> { s.print(); });
		
		System.out.println("=====================================");
		
		//Hashtable<K, V>
		
		Comparator<Student> c1 = new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				if(arg0.marks > arg1.marks)
					return 1;
				if(arg0.marks < arg1.marks)
					return -1;
				else
					return 0;
			}
		};
		
		Collections.sort(students, c1);
		students.forEach(s -> { s.print(); });
		
	}
	
	static class Student
	{
		int rollNum;
		int marks;
		
		public Student(int rollNum_, int marks_) {
			super();
			rollNum = rollNum_;
			marks = marks_;
		}
		
		void print()
		{
			System.out.println(rollNum + " ** " + marks);
		}
		
	}

}
