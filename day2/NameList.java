package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NameList {
	public static void main(String[] args)
	{
		
		String[] name= {"Adam","Ben", "Zara","Adam"," Charlie", "James", "Ben"};
	List<String> lst=new ArrayList<String>(Arrays.asList(name));
	Collections.sort(lst);
	for(int i=0;i<lst.size()-1;i++)
	{
		if((lst.get(i)==lst.get(i+1)))
		{
			System.out.println(lst.get(i));
		}
	}

}
}
