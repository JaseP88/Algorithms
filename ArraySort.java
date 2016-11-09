import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) throws Exception {
		
		// create the random array with 100 elements
	
		int [] genArray = numGenerator(100);
	
		
		// create the file to store array data into
		java.io.File file = new java.io.File("numberOnePartA.txt");
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		// for loop to write data into the file
		for (int i = 0; i < genArray.length; i++) 
			output.println(genArray[i]);
		
		// closes the file
		output.close();
		
		
		int[] mainArray = readData();
		
		/* First print out the array (mainArray) before the sort.  Using another
		 * Array (sortingmethodArray) for each particular sorting methods (Using mainArray will change it's content).  
		 * Start timer, then call the sorting function,
		 * then stop timer, then get time
		*/
		
		// BUBBLE SORTING
		System.out.print("**************************The main array is*******************************");
		printArray(mainArray);
		System.out.println("\n");
		
		/* call the method readData which reads the data in the file and return it in an array.
		 * store the returned array as *bubbleArray* in line 43.  Then start timer, call the bubbleSort Method then end timer
		 * then print out time of execution by subtracting end time from start time.  The whole process is repeated for
		 * each Array sorting called.
		 */
		// Need to do this way because using same array name will result in changing the "unsorted array"
		int[] bubbleArray = readData();
		
		// call method
		bubbleSort(bubbleArray);
		
		// compute and print out time
		
		// SHAKER SORTING
		System.out.print("**************************The main array is*******************************");
		printArray(mainArray);
		System.out.println("\n");
		
		int[] shakerArray = readData();
	
		shakerSort(shakerArray);

		//SHELL SORT WITH GAP OF 25
		System.out.print("**************************The main array is*******************************");
		printArray(mainArray);
		System.out.println("\n");
		
		
		int[] shell25Array = readData();
	
		// This shell sort start with gap of 25 integers
		shellSort(shell25Array,25);
		
		//SHELL SORT WITH GAP OF 10
		System.out.print("**************************The main array is*******************************");
		printArray(mainArray);
		System.out.println("\n");
		
		int[] shell10Array = readData();
	
		// This shell sort start with gap of 10 
		shellSort(shell10Array,10);
	
	}
	
	// This method is to read the data from the files and put them into an array and return it as an array
	public static int [] readData () throws Exception {
		
		java.io.File file = new java.io.File("numberOnePartA.txt");
		
		// create scanner for the file
		Scanner input = new Scanner(file);
		
		int index = 0;
		int [] theArray = new int[100];				// UPDATE FOR DIFFERENT SIZE
		
		while (input.hasNext()) {
			theArray[index] = input.nextInt();
			index++;
		}
		
		input.close();
		return theArray;
	}
	
	
	// This method generates the random numbers and put them into an array of the argument size n then return it as an array
	public static int [] numGenerator (int n) {
		
		int [] numArray = new int[n];
		
		for (int x = 0; x < n; x++)
			numArray[x] = (int)(Math.random() *n);
		
		return numArray;
		
	}
	
	// This method goes through the array and print it's content.  Using if statement to get new line after every 10 numbers
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
	
	// This method is the Bubble Sorting Method with Swap counting
	public static void bubbleSort(int [] a) {
		
		System.out.println("Sorting by Bubble Sort");
		
		int iteration = 0;
		
		for (int i = 0; i < a.length; i++) {
			// declare and set swap counter to 0 with every increments of i
			int swapCount = 0;
		
			for (int j = a.length-1; j > i; j--) {
			
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					// everytime this if statement takes place increase swap counter
					swapCount++;	
				}
				
			}	
				iteration++;
				
				System.out.print("Iteration " + iteration + " , " + swapCount + " swaps");
				printArray(a);
				System.out.println();
				
				// if statement to end the bubble sort early if swap counter is 0 from the if statement on line 187
				if (swapCount == 0) {
					i = a.length;
					System.out.println("Done! no more swaps");	
				}
		}
	}
	
	// This method is the Shaker Sorting Method with Swap counting
	public static void shakerSort(int [] a) {
		
		System.out.println("Sorting by Shaker Sort");
		
		int iteration = 0;
		
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
			
		iteration++;
		
		System.out.print("Iteration " + iteration + " , " + swapCount + " swaps");
		printArray(a);
		System.out.println();
		
		if (swapCount == 0) {
			i = a.length;
			System.out.println("Done! no more swaps");	
		}
		}// closes main for loop in line 217
	}
	
	// This method is the Shell sorting Method
	public static void shellSort(int [] a, int n) {
		
		System.out.println("Sorting by shell sort and starting gap of " + n);
		
		int iteration = 0;
		
		do {
				
				for (int i = 0; i < a.length; i++) {
					// for loop to go through gap n.  Calling j as the 2nd element in the gap series
					for (int j = i+n; j < a.length; j+=n) {
					
						int key = a[j];
						int k = j-n;
				
						while (k >= 0 && a[k] > key) {
						
								int temp = a[k];
								a[k] = a[k+n];
								a[k+n] = temp;
								k = k-n;
						}
					}
					
					// this if statement breaks the for loop in line 259 if there is only 1 element in the gap series to compare
					if (i+n > a.length-1) {
							
							System.out.print("gap changed 1/2 gap is now " +n/2 + "\n");
							break;
					}
					
					else {
							iteration++;
							System.out.print("iteration " +iteration);
							printArray(a);
							System.out.println();
					}	
				}
				
				// reducing the gap after going through all series of i + gap
				n = n/2;
				
				// standard insertion
				if (n == 1) {
					
						iteration++;
						System.out.println("n is now 1");
						System.out.println("iteration "+iteration);
						for (int x = 1; x < a.length; x++) {
							
								int y = x-1;
								int key = a[x];
								while ( y >= 0 && a[y] > key ) {
									
										int temp = a[y];
										a[y] = a[y+1];
										a[y+1] = temp;
										y = y-1;
								}	
						}
						printArray(a);			
				}	
		}
		while (n != 1);
	}
		
}// algorithm class ending bracket	
	





/*
	public static void bubbleSortNoSwaps(int [] a) {
		
		int iteration = 0;
		System.out.println("This is no SWAPS");
		printArray(a);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length-1; j > i; j--) {
			
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}	
				iteration++;
				System.out.print("Iteration " + iteration);
				printArray(a);
				System.out.println();
			}
		}

	}
*/
