package sample;

import java.util.Scanner;

public class BinarySearch {
         public static void main(String[] args)
	 {
	   	String words[]= {"apple","banana","cherry","guava","mango","watermelon"};
		int result=binarySearch(words);
		if(result==1)
		        {
				System.out.println("The word are available");
			}
			else
			{
				System.out.println("The word are not available");
			}
			
	}

		private static int binarySearch(String[] words)
		{
			System.out.println("Enter a word to be search");
			Scanner sc=new Scanner(System.in);
			String word=sc.nextLine();
			int str=0;
			int flag=0;
			int end=words.length-1;
			while(str<=end)
			{
				int mid=(str+end)/2;
				int res=word.compareTo(words[mid]);
			        if(res > 0)
				{
				    str=mid+1;
			        }
			        else if(res<0)
				{
				    end=mid-1;
				}
			        else if(res==0)
				{
				     flag= 1;
				     break;
				}
				  
			}
			return flag;
			
		}
}
