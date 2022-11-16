package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String input="we learn java basics as part of java sessions in java week1";
			
		char[] charArray = input.toCharArray();
			
		Set<Character>unique=new LinkedHashSet<Character>();
	
		for (int i = 0; i < charArray.length; i++) {
			if(!unique.add(charArray[i]))
			{
			
				unique.remove(charArray[i]);	
		}
		}
		System.out.println(unique);
			
	}

}
