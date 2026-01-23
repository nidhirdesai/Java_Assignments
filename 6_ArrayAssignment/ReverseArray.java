/*OUTPUT:
Reversed Array: 
50 40 30 20 10 */
  
public class ReverseArray {
	
	public static int[] reverseArray(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] reversed = reverseArray(arr);
		
		System.out.println("Reversed Array: ");
		
		for(int k : arr)
		{
			System.out.print(k+" ");
		}

	}

}
