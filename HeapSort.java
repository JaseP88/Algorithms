import java.util.Scanner;

/* Jason Pham Project #2
 * PHAJC
 */
public class HeapSort {
	public static void main(String[] args) throws Exception {
	
		int [] testArray_50 = numGenerator(50);
		System.out.println("The array");
		printArray(testArray_50);
		heapSort_50(testArray_50);
		
		int [] testArray_1000 = numGenerator(50);
		heapSort_1000(testArray_1000);
	
		/* //Construction phase is higher for lower n terms
		int [] ranArr = {13,1,3,8,9,14,5,18,25,6,76,24,55,76,5,32,90,87,};
		heapSort(ranArr);
		 */
/*
//		Write the array into a file
		int [] rand_1000 = numGenerator(1000);			int [] rand_10000 = numGenerator(10000);
		writeData(rand_1000, "rand_1000");				writeData(rand_10000,"rand_10000");
		
		
		
		int [] rand_100000 = numGenerator(100000);			int [] rand_1000000 = numGenerator(1000000);
		writeData(rand_100000, "rand_100000");				writeData(rand_1000000, "rand_1000000");
		

//		Read data into a new array to use accordingly		
		int [] percentArray1_1000 = readData(1000, "rand_1000");						int [] timeArray1_1000 = readData(1000, "rand_1000");
		int [] percentArray2_1000 = readData(1000, "rand_1000");						int [] timeArray2_1000 = readData(1000, "rand_1000");
		int [] percentArray3_1000 = readData(1000, "rand_1000");						int [] timeArray3_1000 = readData(1000, "rand_1000");
		int [] percentArray4_1000 = readData(1000, "rand_1000");						int [] timeArray4_1000 = readData(1000, "rand_1000");
		int [] percentArray5_1000 = readData(1000, "rand_1000");						int [] timeArray5_1000 = readData(1000, "rand_1000");
		int [] percentArray6_1000 = readData(1000, "rand_1000");						int [] timeArray6_1000 = readData(1000, "rand_1000");
		int [] percentArray7_1000 = readData(1000, "rand_1000");						int [] timeArray7_1000 = readData(1000, "rand_1000");
		int [] percentArray8_1000 = readData(1000, "rand_1000");						int [] timeArray8_1000 = readData(1000, "rand_1000");
		int [] percentArray9_1000 = readData(1000, "rand_1000");						int [] timeArray9_1000 = readData(1000, "rand_1000");
		int [] percentArray0_1000 = readData(1000, "rand_1000");						int [] timeArray0_1000 = readData(1000, "rand_1000");
		
		int [] percentArray1_10000 = readData(10000, "rand_10000");						int [] timeArray1_10000 = readData(10000, "rand_10000");
		int [] percentArray2_10000 = readData(10000, "rand_10000");						int [] timeArray2_10000 = readData(10000, "rand_10000");
		int [] percentArray3_10000 = readData(10000, "rand_10000");						int [] timeArray3_10000 = readData(10000, "rand_10000");
		int [] percentArray4_10000 = readData(10000, "rand_10000");						int [] timeArray4_10000 = readData(10000, "rand_10000");
		int [] percentArray5_10000 = readData(10000, "rand_10000");						int [] timeArray5_10000 = readData(10000, "rand_10000");
		int [] percentArray6_10000 = readData(10000, "rand_10000");						int [] timeArray6_10000 = readData(10000, "rand_10000");
		int [] percentArray7_10000 = readData(10000, "rand_10000");						int [] timeArray7_10000 = readData(10000, "rand_10000");
		int [] percentArray8_10000 = readData(10000, "rand_10000");						int [] timeArray8_10000 = readData(10000, "rand_10000");
		int [] percentArray9_10000 = readData(10000, "rand_10000");						int [] timeArray9_10000 = readData(10000, "rand_10000");
		int [] percentArray0_10000 = readData(10000, "rand_10000");						int [] timeArray0_10000 = readData(10000, "rand_10000");
		
		int [] percentArray1_100000 = readData(100000, "rand_100000");						int [] timeArray1_100000 = readData(100000, "rand_100000");
		int [] percentArray2_100000 = readData(100000, "rand_100000");						int [] timeArray2_100000 = readData(100000, "rand_100000");
		int [] percentArray3_100000 = readData(100000, "rand_100000");						int [] timeArray3_100000 = readData(100000, "rand_100000");
		int [] percentArray4_100000 = readData(100000, "rand_100000");						int [] timeArray4_100000 = readData(100000, "rand_100000");
		int [] percentArray5_100000 = readData(100000, "rand_100000");						int [] timeArray5_100000 = readData(100000, "rand_100000");
		int [] percentArray6_100000 = readData(100000, "rand_100000");						int [] timeArray6_100000 = readData(100000, "rand_100000");
		int [] percentArray7_100000 = readData(100000, "rand_100000");						int [] timeArray7_100000 = readData(100000, "rand_100000");
		int [] percentArray8_100000 = readData(100000, "rand_100000");						int [] timeArray8_100000 = readData(100000, "rand_100000");
		int [] percentArray9_100000 = readData(100000, "rand_100000");						int [] timeArray9_100000 = readData(100000, "rand_100000");
		int [] percentArray0_100000 = readData(100000, "rand_100000");						int [] timeArray0_100000 = readData(100000, "rand_100000");
		
		int [] percentArray1_1000000 = readData(1000000, "rand_1000000");						int [] timeArray1_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray2_1000000 = readData(1000000, "rand_1000000");						int [] timeArray2_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray3_1000000 = readData(1000000, "rand_1000000");						int [] timeArray3_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray4_1000000 = readData(1000000, "rand_1000000");						int [] timeArray4_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray5_1000000 = readData(1000000, "rand_1000000");						int [] timeArray5_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray6_1000000 = readData(1000000, "rand_1000000");						int [] timeArray6_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray7_1000000 = readData(1000000, "rand_1000000");						int [] timeArray7_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray8_1000000 = readData(1000000, "rand_1000000");						int [] timeArray8_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray9_1000000 = readData(1000000, "rand_1000000");						int [] timeArray9_1000000 = readData(1000000, "rand_1000000");
		int [] percentArray0_1000000 = readData(1000000, "rand_1000000");						int [] timeArray0_1000000 = readData(1000000, "rand_1000000");

//		use method to compute the time 		
		long avgConstructionTime_1000 = runAllHeapSortTimeAnalysis(timeArray1_1000, timeArray2_1000, timeArray3_1000, timeArray4_1000, timeArray5_1000,
				timeArray6_1000, timeArray7_1000, timeArray8_1000, timeArray9_1000, timeArray0_1000);
		
		long avgConstructionTime_10000 = runAllHeapSortTimeAnalysis(timeArray1_10000, timeArray2_10000, timeArray3_10000, timeArray4_10000, timeArray5_10000,
				timeArray6_10000, timeArray7_10000, timeArray8_10000, timeArray9_10000, timeArray0_10000);
		
		long avgConstructionTime_100000 = runAllHeapSortTimeAnalysis(timeArray1_100000, timeArray2_100000, timeArray3_100000, timeArray4_100000, timeArray5_100000,
				timeArray6_100000, timeArray7_100000, timeArray8_100000, timeArray9_100000, timeArray0_100000);
		
		long avgConstructionTime_1000000 = runAllHeapSortTimeAnalysis(timeArray1_1000000, timeArray2_1000000, timeArray3_1000000, timeArray4_1000000, 
				timeArray5_1000000, timeArray6_1000000, timeArray7_1000000, timeArray8_1000000, timeArray9_1000000, timeArray0_1000000);
		
		
//		use method to compute the percentage
		double avgConstructionPercent_1000 = runAllHeapSortPercentageAnalysis(percentArray1_1000, percentArray2_1000, percentArray3_1000, 
				percentArray4_1000, percentArray5_1000, percentArray6_1000, percentArray7_1000, percentArray8_1000, percentArray9_1000, percentArray0_1000);
		
		double avgConstructionPercent_10000 = runAllHeapSortPercentageAnalysis(percentArray1_10000, percentArray2_10000, percentArray3_10000, 
				percentArray4_10000, percentArray5_10000, percentArray6_10000, percentArray7_10000, percentArray8_10000, percentArray9_10000, percentArray0_10000);
		
		double avgConstructionPercent_100000 = runAllHeapSortPercentageAnalysis(percentArray1_100000, percentArray2_100000, percentArray3_100000, 
				percentArray4_100000, percentArray5_100000, percentArray6_100000, percentArray7_100000, percentArray8_100000, percentArray9_100000, percentArray0_100000);
		
		double avgConstructionPercent_1000000 = runAllHeapSortPercentageAnalysis(percentArray1_1000000, percentArray2_1000000, percentArray3_1000000, 
				percentArray4_1000000, percentArray5_1000000, percentArray6_1000000, percentArray7_1000000, percentArray8_1000000, percentArray9_1000000, percentArray0_1000000);
		
	
//		Display
		System.out.println("average construction time in nanoseconds for N = 1000 is " + avgConstructionTime_1000 +
				" percentage is " +avgConstructionPercent_1000);
		System.out.println("average construction time in nanoseconds for N = 10000 is " + avgConstructionTime_10000 +
				" percentage is " +avgConstructionPercent_10000);
		System.out.println("average construction time in nanoseconds for N = 100000 is " + avgConstructionTime_100000 +
				" percentage is " +avgConstructionPercent_100000);
		System.out.println("average construction time in nanoseconds for N = 1000000 is "  + avgConstructionTime_1000000 +
				" percentage is " +avgConstructionPercent_1000000);
*/	
	}

	public static void buildMaxHeap (int [] a) {
		int maxParentalNodesIndex = (int)Math.floor((a.length)/2);		//Parental Nodes index from 0 - floor of n/2, where n is a.length
		
		for (int i = maxParentalNodesIndex; i > 0; i--)
			maxHeapify(a, i, a.length);
	}
	
	public static int left (int i) {
		return 2*i;
	}
	
	public static int right (int i) {
		return 2*i + 1;
	}
	
	public static int parent(int i) {
		return (int)Math.floor(i/2);
	}
	
/*	Added 3rd argument int L, where L represents the Heap Size.
 * 	In buildMaxHeap the function maxHeapify passes the argument where L is the array length to build heap accordingly.
 * 	In heapSort L is passed as the decrementing Heap Size
 */	
	public static void maxHeapify (int [] a, int i, int L) {
		int l = left(i);		//index
		int r = right(i);		//index
		int largest;
		
		if (l <= L && a[l-1] > a[i-1])
			largest = l;
			else
				largest = i;
		
		if (r <= L && a[r-1] > a[largest-1])
			largest = r;
		
		if (largest != i) {
			int temp = a[i-1];
			a[i-1] = a[largest-1];
			a[largest-1] = temp;
			maxHeapify(a,largest, L);
		}	
			
	}
	
//	This method is used in script to show how heap sort sorts 50 random integers.	
	public static void heapSort_50(int [] a) {
		int heapSize = a.length;
		
		// start timer for buildMaxHeap construction
		long startConstructTime = System.nanoTime();
			buildMaxHeap(a);
		long endConstructTime = System.nanoTime();
		
		long constructTime = endConstructTime - startConstructTime;
		
		
		
		// The array after max heap is build.
		System.out.print("The array turned into a max heap");
		printArray(a);
		
			for (int i = a.length; i > 1; i--) {
			
				int temp = a[0];
				a[0] = a[i-1];
				a[i-1] = temp;
				heapSize--;
			
				// The array after swap ** not in a heap
				System.out.print("The array after swap but not in a heap");
				printArray(a);
				

					maxHeapify(a, 1, heapSize);
				

			
				// The array finally after maxHeapify
				System.out.print("The array after being built into a heap");
				printArray(a);
		}
	
	}


//	This method is used in the scripts to show the construct time and sorting time of heap sort	
	public static void heapSort_1000(int [] a) {
		int heapSize = a.length;
		
		// start timer for buildMaxHeap construction
		long startConstructTime = System.nanoTime();
			buildMaxHeap(a);
		long endConstructTime = System.nanoTime();
		
		long constructTime = endConstructTime - startConstructTime;
		
		
		
		// The array after max heap is build.
		System.out.println("The array turned into a max heap, construct time is " +constructTime +" nanoseconds");
	
		// start timer for actual Sorting
		long startSortTime = System.nanoTime();
			for (int i = a.length; i > 1; i--) {
			
				int temp = a[0];
				a[0] = a[i-1];
				a[i-1] = temp;
				heapSize--;
				
				// start timer for maxHeapify construct
				long startTime = System.nanoTime();
					maxHeapify(a, 1, heapSize);
				long endTime = System.nanoTime();
			
				long constructTime2 = endTime - startTime;
				
				// Collectively increment construct timer
				constructTime = constructTime + (constructTime2);
		
		}
		long endSortTime = System.nanoTime();
		
		long totalSortTime = endSortTime - startSortTime;
	
		System.out.println("Total construct time is " +constructTime+ " nanoseconds");
		System.out.println("Acutal sort time is " +totalSortTime +" nanoseconds");
		
		long totalTime = constructTime + totalSortTime;
		double percentage = ((double)constructTime / totalTime) * 100;
		System.out.println("The percentage of time heap Sort takes in construction phase is " + percentage +" percent");
	}
	
//	This method is used for analysis of percentage
	public static double heapSortPercentageAnalysis (int [] a) {
		int heapSize = a.length;
	
		// start timer for buildMaxHeap construction
		long startConstructTime = System.nanoTime();
			buildMaxHeap(a);
		long endConstructTime = System.nanoTime();
	
		long constructTime = endConstructTime - startConstructTime;
	
		// start timer for actual Sorting
		long startSortTime = System.nanoTime();
			for (int i = a.length; i > 1; i--) {
		
				int temp = a[0];
				a[0] = a[i-1];
				a[i-1] = temp;
				heapSize--;
		
				// start timer for maxHeapify construct
				long startTime = System.nanoTime();
					maxHeapify(a, 1, heapSize);
				long endTime = System.nanoTime();
		
				long constructTime2 = endTime - startTime;
			
				// Collectively increment construct timer
				constructTime = constructTime + (constructTime2);
			}
			
		long endSortTime = System.nanoTime();
	
		long totalSortTime = endSortTime - startSortTime;
		
		long totalTime = constructTime + totalSortTime;
		double percentage = ((double)constructTime / totalTime) * 100;
		
		return percentage;
		
	}

//	This method is used for analysis of construct times	
	public static long heapSortTimeAnalysis (int [] a) {
		int heapSize = a.length;
	
		// start timer for buildMaxHeap construction
		long startConstructTime = System.nanoTime();
			buildMaxHeap(a);
		long endConstructTime = System.nanoTime();
	
		long constructTime = endConstructTime - startConstructTime;
	
		
		for (int i = a.length; i > 1; i--) {
		
			int temp = a[0];
			a[0] = a[i-1];
			a[i-1] = temp;
			heapSize--;
		
			// start timer for maxHeapify construct
			long startTime = System.nanoTime();
				maxHeapify(a, 1, heapSize);
			long endTime = System.nanoTime();
		
			long constructTime2 = endTime - startTime;
			
			// Collectively increment construct timer
			constructTime = constructTime + (constructTime2);
			}
			
		return constructTime;
	}	

//  This method allows me to pass all the arrays into the heapSortPercentageANalysis method.	
	public static double runAllHeapSortPercentageAnalysis (int [] a, int [] b, int [] c, int [] d, int [] e, int [] f, int [] g,
			int [] h, int [] i, int []j) {
		
		double array1 = heapSortPercentageAnalysis(a);
		double array2 = heapSortPercentageAnalysis(b);
		double array3 = heapSortPercentageAnalysis(c);
		double array4 = heapSortPercentageAnalysis(d);
		double array5 = heapSortPercentageAnalysis(e);
		double array6 = heapSortPercentageAnalysis(f);
		double array7 = heapSortPercentageAnalysis(g);
		double array8 = heapSortPercentageAnalysis(h);
		double array9 = heapSortPercentageAnalysis(i);
		double array0 = heapSortPercentageAnalysis(j);
		
		double average = (array1 + array2 + array3 + array4 + array5 + array6 + array7 + array8 + array9 + array0)/10;
		
		return average;
	}

//	This method allows me to pass all the arrays into the heapSortTimeANalysis method.
	public static long runAllHeapSortTimeAnalysis (int [] a, int [] b, int [] c, int [] d, int [] e, int [] f, int [] g,
			int [] h, int [] i, int []j) {
		
		long array1 = heapSortTimeAnalysis(a);
		long array2 = heapSortTimeAnalysis(b);
		long array3 = heapSortTimeAnalysis(c);
		long array4 = heapSortTimeAnalysis(d);
		long array5 = heapSortTimeAnalysis(e);
		long array6 = heapSortTimeAnalysis(f);
		long array7 = heapSortTimeAnalysis(g);
		long array8 = heapSortTimeAnalysis(h);
		long array9 = heapSortTimeAnalysis(i);
		long array0 = heapSortTimeAnalysis(j);
		
		double average = (double)(array1 + array2 + array3 + array4 + array5 + array6 + array7 + array8 + array9 + array0)/10;
		
		return (long)average;
	}
	
	public static int [] numGenerator (int n) {
		
		int [] numArray = new int[n];
		
		for (int x = 0; x < n; x++)
			numArray[x] = (int)(Math.random() *n);
		
		return numArray;
		
	}

	public static void printArray(int []a) {
		
		int n = 0;
	
		for (int index = 0; index < a.length; index++) {
			
			// if statement to make it into having only 10 columns
			if (index == n*10) {
				System.out.println();
				n++;
			}	
			
			System.out.print(+a[index] + "\t");
		}
		
		System.out.println("\n");
			
	}

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

	public static void writeData(int [] a , String s) throws Exception {
		
		java.io.File file = new java.io.File(s);
		if (file.exists()) {
	
			return;
		}	
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		// for loop to write data into the file
		for (int i = 0; i < a.length; i++) 
			output.println(a[i]);
		
		// closes the file
		output.close();
	}



}// end class