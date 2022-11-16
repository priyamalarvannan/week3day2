package week3.day2;

import java.util.HashSet;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) 
	{
	int arr1[]={3,2,11,4,6,7};
	int arr2[]={1,2,8,4,9,7};
	HashSet<Integer> set1=new HashSet<Integer>();
	for(int val:arr1)
	{
		set1.add(val);
	}
	for(int val:arr2)
	{
		if(set1.contains(val))
				{
			
			System.out.println(val);
				}
	
	}
		
	}
}
