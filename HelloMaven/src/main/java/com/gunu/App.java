package com.gunu;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        HashMap<Integer, String> rollNumberToNameMap = new HashMap<Integer, String>();
        
        rollNumberToNameMap.put(1, "Suhrita Pujari");
        //rollNumberToNameMap.put(1, "Suhrita Pujari");
        rollNumberToNameMap.put(2, "Amrita Pujari");
        rollNumberToNameMap.put(3, "Abhinash Pujari");
        rollNumberToNameMap.put(4, "Debaswarup Padhee");
        rollNumberToNameMap.put(5, "Animesh Barpanda");
        rollNumberToNameMap.put(6, "Sanket Panda");
        
        Set<Integer> rollNumbers = rollNumberToNameMap.keySet();
        for(Integer roll : rollNumbers)
        {
        	String nameForRollNumber = rollNumberToNameMap.get(roll);
        	System.out.println("Name for the roll number " + roll + " is " + nameForRollNumber);
        }      
        
        Set<Entry<Integer, String>> rollNumberToNameEntries = rollNumberToNameMap.entrySet();
        for(Entry<Integer, String> rollNumberToNameEntry : rollNumberToNameEntries)
        {
        	Integer key = rollNumberToNameEntry.getKey();
        	String value = rollNumberToNameEntry.getValue();
        	System.out.println("Name for the roll number " + key + " is " + value);
        }
    }
}
