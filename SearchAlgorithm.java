import java.util.Scanner;

/* This program is to design a linear and binary search algorithm
 * Since I did not save the sorted array back into the file I implemented in PHAJ1A I included 
 * 1 sorting algorithm method to sort the array.  I use the shaker method
 * as it seemed like the fastest for theses many elements
 */
public class SearchAlgorithm {
	public static void main(String[] args) throws Exception {
		
		/*
		 * read data from the file in which I saved it under, then sort it with the method shakerSort.
		 * I then generate a random Key integer the use the linear and binary search method I created
		 */
		int[] array = readData(100, "numberOnePartA.txt");
		int randomKey = randomKey(100);
		shakerSort(array);
		System.out.println("The key is set as " + randomKey);
		printArray(array);
		int lS = linearSearch(array,randomKey);
		int bS = binarySearch(array,randomKey);
		if (lS == -1)
			System.out.println("Key " +randomKey + " was not found in the array by linear search");
		else
			System.out.println("Key is found at index " + lS + " by linear Search");
		
		if (bS == -1)
			System.out.println("Key " +randomKey + " was not found in the array by binary search");
		else 
			System.out.println("Key is found at index " +bS + " by binary Search");
		
	}
	
	/* 
	 * Create method to read the data from file created in 1A. It will take the arguments of n elements and the file name
	 * for 1A there will be 100 elements and the file name is numberOnePartA.txt.  After reading the through the file and storing
	 * it in an array return that array.
	 */
	public static int [] readData (int n , String s) throws Exception {
			
			java.io.File file = new java.io.File(s);
			
			// create scanner for the file
			Scanner input = new Scanner(file);
			
			int index = 0;
			int [] theArray = new int[n];				// UPDATE FOR DIFFERENT SIZE
			
			while (input.hasNext()) {
				theArray[index] = input.nextInt();
				index++;
			}
			
			input.close();
			return theArray;
	}

	/*
	 * Need a print method to print out the sorted array output
	 */
	public static void printArray(int [] a) {
		
		int n = 0;
	
		for (int index = 0; index < a.length; index++) {
			
			// if statement to make it into having only 10 columns
			if (index == n*10) {
				System.out.println();
				n++;
			}	
			
			System.out.print(+a[index] + "\t");
		}
		
		System.out.println();
			
	}
	
	/*
	 * Need one sorting method to sort the array
	 */
	public static void shakerSort(int [] a) {
		
		for (int i = 0; i < a.length; i++) {
			int swapCount = 0;
			
			for (int j = a.length-1; j > i; j--)
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					swapCount++;
				}
			
			// 2nd for loop to run the opposite direction
			for (int k = i+1; k < a.length-1; k++) 
				if (a[k] > a[k+1]) {
					int temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
					swapCount++;
				}
			
		if (swapCount == 0) {
			i = a.length;
		}
		}// closes main for loop in line 217
	}
	
	/* 
	 * Need to generate a random key between the integers 0 - n
	 */
	public static int randomKey (int n) {
		int key = (int)(Math.random() *n);
		return key;
	}
	
	/*
	 * The linear Search method.  Use for loop to run through array if the element is = to key return the index
	 */
	public static int linearSearch(int [] a, int k) {
		for (int i = 0; i < a.length; i++) {
			
			if (k == a[i]) 
				return i;	
		}
		return -1;
	}

	
	public static int binarySearch(int[] a, int k) {
		/*
		 * establish the index.  For java programming first array index is 0 based.  Use while loop with boolean factors 
		 * if high index is greater or equal to low index to keep loop going.  Search the middle index and compare it to key
		 * if it is equal return the index.  If the key is lesser than the index in the middle then replace the high index with the middle index - 1
		 * if key is greater then move no low Index to middle index + 1.  While loop will continue until highIndex >= lowIndex or the key is found
		 * as midIndex.  If loop runs and no key was found then return -1
		 */
		int lowIndex = 0;
		int highIndex = a.length-1;
		
		while (highIndex >= lowIndex) {
			int midIndex = (lowIndex + highIndex)/2;
			
			if (k < a[midIndex])
				highIndex = midIndex - 1;
			
			else if (k == a[midIndex]) {
				return midIndex;
			}	
			
			else
				lowIndex = midIndex + 1;
		}
		
		return -1;
		
	}
}
