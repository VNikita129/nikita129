package merge;

public class MergeSort {
	void merge(int Arr[], int start, int mid, int end) {

		// create a temp array
		int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start, j = mid+1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in temp 
		while(i <= mid && j <= end) {
			if(Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k += 1; i += 1;
			}
			else {
				temp[k] = Arr[j];
				k += 1; j += 1;
			}
		}

		// add elements left in the first interval 
		while(i <= mid) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}

		// add elements left in the second interval 
		while(j <= end) {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}

		// copy temp to original interval
		for(i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
	}

	// Arr is an array of integer type
	// start and end are the starting and ending index of current interval of Arr
	@SuppressWarnings("unused")
	private void Mergesort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
			
			if(start < end) {
				int mid = (start + end) / 2;
				Mergesort(arr, start, mid);
				Mergesort(arr, mid+1, end);
				merge(arr, start, mid, end);
			}
		}
	
	public static void main(String[] args)
	{
		int [] a = {23,67,98,25,34};
		
		MergeSort ms  = new MergeSort();
		ms.Mergesort(a, 0, a.length-1);
		
		System.out.println("After sort");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

		
	}



