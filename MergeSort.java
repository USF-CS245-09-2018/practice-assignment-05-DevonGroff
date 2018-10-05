public class MergeSort implements SortingAlgorithm
{
    // Method to call sort -- implemented from SortingAlgorithm.
	public void sort(int[] a)
	{
		// Calls sort method with adjusted left and right values.
		sort(a, 0, a.length - 1);
	}
    
    // Overloaded method to sort by calling the merge method.
    void sort(int[] a, int left, int right) 
    { 
        if (left < right) 
        { 
            // Divides by two to find middle value. 
            int middle = (left + right) / 2; 
  
            // Sorts the first side.
            sort(a, left, middle); 

            // Sorts the second side.
            sort(a , middle + 1, right); 
  
            // Merges the two sorted sides of the array. 
            merge(a, left, middle, right); 
        } 
    } 

    // Method to merge the two sides of the array together.
	void merge(int[] a, int left, int middle, int right) 
    { 
        // Data Members
        int lSize = middle - left + 1; 
        int rSize = right - middle; 
        int leftArray[] = new int [lSize]; 
        int rightArray[] = new int [rSize]; 
        int i = 0;
        int j = 0;
        int mergeValue = left;
  
        // Copies data into temporary left array to hold values.
        for (i = 0; i < lSize; ++i) 
        {
            leftArray[i] = a[left + i]; 
        }

        // Resets i to be used later.
        i = 0;
        
        // Copies data into temporary right array to hold values.
        for (j = 0; j < rSize; ++j) 
        {
            rightArray[j] = a[middle + j + 1]; 
        }
        
        // Resets j to be used later.
        j = 0; 
        
        // Loops through and assigns values to be properly merged. 
        while (i < lSize && j < rSize) 
        { 
            if (leftArray[i] <= rightArray[j]) 
            { 
                a[mergeValue] = leftArray[i]; 
                i++; 
            } 

            else
            { 
                a[mergeValue] = rightArray[j]; 
                j++; 
            } 

            mergeValue++; 
        } 
  
        // Handles any remaining values on the left side of the array.
        while (i < lSize) 
        { 
            a[mergeValue] = leftArray[i]; 
            i++; 
            mergeValue++; 
        } 
  
        // Handles any remaining values on the right side of the array.
        while (j < rSize) 
        { 
            a[mergeValue] = rightArray[j]; 
            j++; 
            mergeValue++; 
        } 
    } 
}