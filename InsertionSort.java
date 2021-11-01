package sample;

public class InsertionSort {
      public static void main(String[] args) {
    	 String words[]= {"guava","watermelon","cherry","apple","mango","banana"};
    	 String a[]= insrtionSort(words);
    	 for(int i=0;i<words.length;i++)
		 {
    		  System.out.println(words[i]);
    	 }
    	 
      }

	    private static String [] insrtionSort(String [] words)
	    {
		int n=words.length;
		
		int j;
		int i;
		
			for( j=1;j<n;j++)
			{
				
			String  k=words[j];
		    i=j-1;
			while( i>=0 && words[i].compareTo(k)>0) 
			   {
				 
				 words[i+1]=words[i];
				
				 i--;
			   }
			   words[i+1]=k;
		     }
			return words;
		 }
}
