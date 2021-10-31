package sample;

public class Merge {
	public  void mergeSort( int[] a,  int left, int right)
	{
		
		int c[]=new int[50];			
		if(left<right) {
			    int mid=(left+right)/2;
			    mergeSort(a,left,mid);
			    mergeSort(a,mid+1,right);
			    merge(a,left,mid,right);
			}
	}
		public void merge(int[] a, int left, int mid, int right) 
		{       int n=a.length;
		    	int i=left;
		    	int j=mid+1;
		    	int k=left;
		    	int b[]=new int[50];
		    	while(i<=mid && j<=right) {
		    		if(a[i]<a[j]) {
		    			b[k]=a[i];
		    			i++;
		    		}
		    		else {
		    			b[k]=a[j];
		    			j++;
		    		}
		    		k++;
		    	}
		    	if(i>mid) {
		    		while(j<=right) {
		    			b[k]=a[j];
		    			k++;
		    			j++;
		    		}
		    	}
		    	else {
		    		while(i<=mid) {
		    			b[k]=a[i];
		    			k++;
		    			i++;
		    		}
		    	}
		    	for(k=left;k<=right;k++) {
		    		a[k]=b[k];
		    	}
		    for(i=0;i<a.length;i++) {
		    	System.out.println(a[i]);
		    }
				
		    	
		}
	
	public static void main(String[] args) {
		int arr[]= {56,23,10,9,85,6};
		int l=0;
		int r=arr.length-1;
		Merge merge=new Merge();
		merge.mergeSort(arr,l,r);
	}

}
