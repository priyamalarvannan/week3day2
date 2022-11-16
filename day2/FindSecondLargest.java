package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) 
	{
		List<Integer> lst1=new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(8);
		lst1.add(11);
		lst1.add(4);
		lst1.add(5);
		lst1.add(7);
		System.out.println(lst1);
		Collections.sort(lst1);
		System.out.println(lst1);
		int n = lst1.size();
		System.out.println(lst1.get(4));	
		
	}
}
				
