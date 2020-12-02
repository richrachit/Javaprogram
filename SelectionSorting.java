package java2;
class SelectionSorting 
{

	 void SelectionSort(int arr[])
	{
		int len = arr.length;
		
		for(int i=0;i<len-1;i++)
		{
			int min = i;
			for(int j= i+1; j<len;j++)
			 if(arr[j]<arr[min])
				 min = j;
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		

	}

	 void printArr(int arr[])
	 {
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
	 }
	 
   public static void main(String args[])
   {
	   SelectionSorting obj = new SelectionSorting ();
	   int numarr[] = {101,5,18,11,80,67};
	   
	   System.out.print("Original array");
	   obj.printArr(numarr);
	   
	   obj.SelectionSort(numarr);
	   
	   System.out.print("Sorted array:");
	   obj.printArr(numarr);
   }
}  
