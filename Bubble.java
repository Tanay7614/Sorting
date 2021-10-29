package sample;

public class Bubble {
        public static void main(String[] args)
	{
		int[] arr= {5,99,26,45,10,1};
		bubblesort(arr);
	}

	private static void bubblesort(int[] arr)
	{
		int n=arr.length;
	        for(int i=0;i<arr.length;i++)	
		{
		    for(int j=0;j<n-1;j++) 
		    {
		    	 //put max element at last of each iteration
		    	 if(arr[j]>arr[j+1])
		    	 {
		    		 int temp=arr[j];
		    		 arr[j]=arr[j+1];
		    		 arr[j+1]=temp;
		    	 }
		    }
		    n=n-1;
		 }
		 for(int i=0;i<arr.length;i++)	
		 {
		      System.out.println(arr[i]);
		 }
			
		
	}
}
