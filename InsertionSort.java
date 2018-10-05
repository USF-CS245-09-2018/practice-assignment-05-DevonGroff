public class InsertionSort implements SortingAlgorithm
{
	// Method to call sort -- implemented from SortingAlgorithm.
	public void sort(int[] a)
	{
		// Calls insertionSort method.
		insertionSort(a);
	}

	// Method to perform the insertion sort. 
	int [] insertionSort(int[] a)
	{
		// Data members
		int insert = 0;
		int j = 0;

		// For loop to run through array items.
        for (int i = 1; i < a.length; ++i)
        {
        	// Select insert value.
            insert = a[i];
            j = i - 1;

            // Loop to sort values. 
            while (j >= 0 && a[j] > insert)
            {
            	// Moves values.
                a[j + 1] = a[j];
                j = j - 1;
            }

            // Sets insert to new value. 
            a[j + 1] = insert;
        }

        // Returns sorted array.
		return a;
	}
}