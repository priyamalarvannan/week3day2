package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(5);
		lst.add(3);
		lst.add(4);
		lst.add(6);
		lst.add(6);
		lst.add(8);
		//List<Integer> asList = Arrays.asList(1,5,3,4,6);
		
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		for(int i=0;i<lst.size()-1;i++)
			if(lst.get(i)+1 != lst.get(i+1))
			{
				
				System.out.println((lst.get(i)+1));
				break;
				
		
			}
		}
	}


