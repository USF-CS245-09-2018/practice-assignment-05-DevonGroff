public class QuickSort implements SortingAlgorithm
{
	// Method to call sort -- implemented from SortingAlgorithm.
	public void sort(int[] a)
	{
		// Calls quicksort method.
		quickSort(a, 0, a.length - 1);
	}

	// Method to partition the array so that we can pivot at a point.
	int partition(int[] a, int left, int right)
	{
		// Data Members.
		int i = left;
		int j = right;
		int temp = 0;
		int pivotLocation = (left + right) / 2;
		int pivot = a[pivotLocation];

		// Loops until the two sides meet in the middle at the pivot point.
		while (i <= j)
		{
			// Loops through left side of pivot.
			while (a[i] < pivot)
			{
				// Increases i until i = pivot.
				i++;
			}

			// Loops through right side of pivot.
			while (a[j] > pivot)
			{
				// Increases j until j = pivot.
				j--;
			}

			// Conditional to swap the values being compared. 
			if (i <= j)
			{
				// Sets temp = the current value in a at index i.
				temp = a[i];

				// Swaps i for j.
				a[i] = a[j];

				// Sets j's value = the temporary value.
				a[j] = temp;

				// Increments i and decrements j.
				i++;
				j--;
			}
		}

		// Returns the index position to next be sorted.
		return i;
	}

	// Method to perform the quicksort.
	void quickSort(int[] a, int left, int right)
	{
		// Sets the index position to the return value from partition.
		int indexPosition = partition(a, left, right);

		// Conditional to perform quicksort if the left value is less than the index position.
		if (left < indexPosition - 1)
		{
			quickSort(a, left, indexPosition - 1);
		}

		// Conditional to perform quicksort if the right value is greater than the index position.
		if (indexPosition < right)
		{
			quickSort(a, indexPosition, right);
		}
	}
}