package sample;

import java.util.Scanner;

public class Anagram {
     public static void main(String[] args) {
    	 
		Scanner sc=new Scanner(System.in);
		String[] a1= {"t","s","r","a"};
		String[] a2= {"t","r","s","a","m"};
		int flag=0;
		if(a1.length==a2.length) 
		{
			
			for(int i=0;i<a1.length;i++)
			{
				for(int j=0;j<a1.length;j++)
				{
					  flag=0;
			          if(a2[i]==a1[j])
			          	{
			        	  flag=1;
			        	  break;
			          	}
			
		        }
				if(flag==0)
				{
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Sring are anagram");
			}
			else 
			{
				System.out.println("Sring are not anagram");
			}
		}
		else
		{
			System.out.println("Sring are not anagram");
		}
	}
}
