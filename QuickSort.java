/* JasonPham Project #2
 * PHAJB
 */
import java.util.Scanner;
public class QuickSort {
	
	public static void main(String [] arg) throws Exception {
		
//  These block of code goes in the script file 		
		
	// This is the array to test each algorithm works, write data into a file	
	int [] randTestArray = numGenerator(50);
	writeData(randTestArray, "TestArray");
	
	// This is the array to see the sorting times of each algorithm, write data into a file
	int [] testTimeArray = numGenerator(1000);
	writeData(testTimeArray, "TestTimeArray");
	
	// declare the variable to test the algorithm (has 50 elements)
	int [] quickSortTestArray = readData(50, "TestArray");
	int [] medianOfThreeTestArray = readData(50, "TestArray");
	int [] randMedianTestArray = readData(50, "TestArray");
	
	// declare the variable to observe sort time (has 1000 elements)
	int [] quickSortTestTime = readData(1000, "TestTimeArray");
	int [] medianOfThreeTestTime = readData(1000, "TestTimeArray");
	int [] randMedianTestTime = readData(1000, "TestTimeArray");

//  print out each algorithm	
	System.out.println("Original array is...");
	printArray(randTestArray);
	System.out.println();
	
	System.out.println("quick Sort algorithm..");
	quickSort(quickSortTestArray, 1, quickSortTestArray.length);
	printArray(quickSortTestArray);
	System.out.println();
	
	System.out.println("median of three algorithm..");
	medianOfThree(medianOfThreeTestArray, 1, medianOfThreeTestArray.length);
	printArray(medianOfThreeTestArray);
	System.out.println();
	
	System.out.println("randomMedianTestArray...");
	randomMedian(randMedianTestArray, 1, randMedianTestArray.length);
	printArray(randMedianTestArray);
	System.out.println();
	
//  Observe the sort time for array of 1000
	
	//get time for QuickSort
	long startQuickSort = System.nanoTime();
		quickSort(quickSortTestTime, 1, quickSortTestTime.length);
	long endQuickSort = System.nanoTime();
	
	long startMedianOfThree = System.nanoTime();
		medianOfThree(medianOfThreeTestTime, 1, medianOfThreeTestTime.length);
	long endMedianOfThree = System.nanoTime();
	
	long startRandMedian = System.nanoTime();
		randomMedian(randMedianTestTime, 1, randMedianTestTime.length);
	long endRandMedian = System.nanoTime();	
	
	
	long totalTimeQuickSort = endQuickSort - startQuickSort;
	long totalTimeMedianOfThree = endMedianOfThree - startMedianOfThree;
	long totalTimeRandMedian = endRandMedian - startRandMedian;
	
	System.out.println("The time it took for quick sort to sort in nanoseconds is " +totalTimeQuickSort);
	System.out.println("The time it took for median of three to sort in nanoseconds is " +totalTimeMedianOfThree);
	System.out.println("The time it took for random median to sort in nanoseconds is " +totalTimeRandMedian);
// THIS ENDS WHAT SHOULD BE ON THE SCRIPT 

/*	
// ANALYSIS PART //

	// declare
	int [] rand1_100 = numGenerator(100);		int [] rand1_1000 = numGenerator(1000);			int [] rand1_10000 = numGenerator(10000);
	int [] rand2_100 = numGenerator(100);		int [] rand2_1000 = numGenerator(1000);			int [] rand2_10000 = numGenerator(10000);
	int [] rand3_100 = numGenerator(100);		int [] rand3_1000 = numGenerator(1000);			int [] rand3_10000 = numGenerator(10000);
	int [] rand4_100 = numGenerator(100);		int [] rand4_1000 = numGenerator(1000);			int [] rand4_10000 = numGenerator(10000);
	int [] rand5_100 = numGenerator(100);		int [] rand5_1000 = numGenerator(1000);			int [] rand5_10000 = numGenerator(10000);
	int [] rand6_100 = numGenerator(100);		int [] rand6_1000 = numGenerator(1000);			int [] rand6_10000 = numGenerator(10000);
	int [] rand7_100 = numGenerator(100);		int [] rand7_1000 = numGenerator(1000);			int [] rand7_10000 = numGenerator(10000);
	int [] rand8_100 = numGenerator(100);		int [] rand8_1000 = numGenerator(1000);			int [] rand8_10000 = numGenerator(10000);
	int [] rand9_100 = numGenerator(100);		int [] rand9_1000 = numGenerator(1000);			int [] rand9_10000 = numGenerator(10000);
	int [] rand0_100 = numGenerator(100);		int [] rand0_1000 = numGenerator(1000);			int [] rand0_10000 = numGenerator(10000);
	
	
	
	// write into file
	writeData(rand1_100, "rand1_100");			writeData(rand1_1000, "rand1_1000");			writeData(rand1_10000, "rand1_10000");
	writeData(rand2_100, "rand2_100");			writeData(rand2_1000, "rand2_1000");			writeData(rand2_10000, "rand2_10000");
	writeData(rand3_100, "rand3_100");			writeData(rand3_1000, "rand3_1000");			writeData(rand3_10000, "rand3_10000");
	writeData(rand4_100, "rand4_100");			writeData(rand4_1000, "rand4_1000");			writeData(rand4_10000, "rand4_10000");
	writeData(rand5_100, "rand5_100");			writeData(rand5_1000, "rand5_1000");			writeData(rand5_10000, "rand5_10000");
	writeData(rand6_100, "rand6_100");			writeData(rand6_1000, "rand6_1000");			writeData(rand6_10000, "rand6_10000");
	writeData(rand7_100, "rand7_100");			writeData(rand7_1000, "rand7_1000");			writeData(rand7_10000, "rand7_10000");
	writeData(rand8_100, "rand8_100");			writeData(rand8_1000, "rand8_1000");			writeData(rand8_10000, "rand8_10000");
	writeData(rand9_100, "rand9_100");			writeData(rand9_1000, "rand9_1000");			writeData(rand9_10000, "rand9_10000");
	writeData(rand0_100, "rand0_100");			writeData(rand0_1000, "rand0_1000");			writeData(rand0_10000, "rand0_10000");
	
	// read the file and use it for quickSort
	int [] array1_100 = readData(100, "rand1_100");						int [] array1_1000 = readData(1000, "rand1_1000");
	int [] array2_100 = readData(100, "rand2_100");						int [] array2_1000 = readData(1000, "rand2_1000");
	int [] array3_100 = readData(100, "rand3_100");						int [] array3_1000 = readData(1000, "rand3_1000");
	int [] array4_100 = readData(100, "rand4_100");						int [] array4_1000 = readData(1000, "rand4_1000");
	int [] array5_100 = readData(100, "rand5_100");						int [] array5_1000 = readData(1000, "rand5_1000");
	int [] array6_100 = readData(100, "rand6_100");						int [] array6_1000 = readData(1000, "rand6_1000");
	int [] array7_100 = readData(100, "rand7_100");						int [] array7_1000 = readData(1000, "rand7_1000");

	int [] array8_100 = readData(100, "rand8_100");						int [] array8_1000 = readData(1000, "rand8_1000");
	int [] array9_100 = readData(100, "rand9_100");						int [] array9_1000 = readData(1000, "rand9_1000");
	int [] array0_100 = readData(100, "rand0_100");						int [] array0_1000 = readData(1000, "rand0_1000");
	
	int [] array1_10000 = readData(10000, "rand1_10000");
	int [] array2_10000 = readData(10000, "rand2_10000");
	int [] array3_10000 = readData(10000, "rand3_10000");
	int [] array4_10000 = readData(10000, "rand4_10000");
	int [] array5_10000 = readData(10000, "rand5_10000");
	int [] array6_10000 = readData(10000, "rand6_10000");
	int [] array7_10000 = readData(10000, "rand7_10000");
	int [] array8_10000 = readData(10000, "rand8_10000");
	int [] array9_10000 = readData(10000, "rand9_10000");
	int [] array0_10000 = readData(10000, "rand0_10000");
	
	// read the file and use it for median of three
	int [] medarray1_100 = readData(100, "rand1_100");						int [] medarray1_1000 = readData(1000, "rand1_1000");
	int [] medarray2_100 = readData(100, "rand2_100");						int [] medarray2_1000 = readData(1000, "rand2_1000");
	int [] medarray3_100 = readData(100, "rand3_100");						int [] medarray3_1000 = readData(1000, "rand3_1000");
	int [] medarray4_100 = readData(100, "rand4_100");						int [] medarray4_1000 = readData(1000, "rand4_1000");
	int [] medarray5_100 = readData(100, "rand5_100");						int [] medarray5_1000 = readData(1000, "rand5_1000");
	int [] medarray6_100 = readData(100, "rand6_100");						int [] medarray6_1000 = readData(1000, "rand6_1000");
	int [] medarray7_100 = readData(100, "rand7_100");						int [] medarray7_1000 = readData(1000, "rand7_1000");
	int [] medarray8_100 = readData(100, "rand8_100");						int [] medarray8_1000 = readData(1000, "rand8_1000");
	int [] medarray9_100 = readData(100, "rand9_100");						int [] medarray9_1000 = readData(1000, "rand9_1000");
	int [] medarray0_100 = readData(100, "rand0_100");						int [] medarray0_1000 = readData(1000, "rand0_1000");
	
	int [] medarray1_10000 = readData(10000, "rand1_10000");
	int [] medarray2_10000 = readData(10000, "rand2_10000");
	int [] medarray3_10000 = readData(10000, "rand3_10000");
	int [] medarray4_10000 = readData(10000, "rand4_10000");
	int [] medarray5_10000 = readData(10000, "rand5_10000");
	int [] medarray6_10000 = readData(10000, "rand6_10000");
	int [] medarray7_10000 = readData(10000, "rand7_10000");
	int [] medarray8_10000 = readData(10000, "rand8_10000");
	int [] medarray9_10000 = readData(10000, "rand9_10000");
	int [] medarray0_10000 = readData(10000, "rand0_10000");
	
	// read the file and use it for random median
	int [] ranarray1_100 = readData(100, "rand1_100");						int [] ranarray1_1000 = readData(1000, "rand1_1000");
	int [] ranarray2_100 = readData(100, "rand2_100");						int [] ranarray2_1000 = readData(1000, "rand2_1000");
	int [] ranarray3_100 = readData(100, "rand3_100");						int [] ranarray3_1000 = readData(1000, "rand3_1000");
	int [] ranarray4_100 = readData(100, "rand4_100");						int [] ranarray4_1000 = readData(1000, "rand4_1000");
	int [] ranarray5_100 = readData(100, "rand5_100");						int [] ranarray5_1000 = readData(1000, "rand5_1000");
	int [] ranarray6_100 = readData(100, "rand6_100");						int [] ranarray6_1000 = readData(1000, "rand6_1000");
	int [] ranarray7_100 = readData(100, "rand7_100");						int [] ranarray7_1000 = readData(1000, "rand7_1000");
	int [] ranarray8_100 = readData(100, "rand8_100");						int [] ranarray8_1000 = readData(1000, "rand8_1000");
	int [] ranarray9_100 = readData(100, "rand9_100");						int [] ranarray9_1000 = readData(1000, "rand9_1000");
	int [] ranarray0_100 = readData(100, "rand0_100");						int [] ranarray0_1000 = readData(1000, "rand0_1000");
	
	int [] ranarray1_10000 = readData(10000, "rand1_10000");
	int [] ranarray2_10000 = readData(10000, "rand2_10000");
	int [] ranarray3_10000 = readData(10000, "rand3_10000");
	int [] ranarray4_10000 = readData(10000, "rand4_10000");
	int [] ranarray5_10000 = readData(10000, "rand5_10000");
	int [] ranarray6_10000 = readData(10000, "rand6_10000");
	int [] ranarray7_10000 = readData(10000, "rand7_10000");
	int [] ranarray8_10000 = readData(10000, "rand8_10000");
	int [] ranarray9_10000 = readData(10000, "rand9_10000");
	int [] ranarray0_10000 = readData(10000, "rand0_10000");

//  for 100 elements //
	long quickSortTime_100 = quickSortEfficiency (array1_100, array2_100, array3_100, array4_100,
			array5_100, array6_100, array7_100, array8_100, array9_100, array0_100);
	
	long medianOfThreeTime_100 = medianOfThreeEfficiency (medarray1_100, medarray2_100, medarray3_100, medarray4_100,
			medarray5_100, medarray6_100, medarray7_100, medarray8_100, medarray9_100, medarray0_100); 
	
	long randMedianTime_100 = randomMedianEfficiency (ranarray1_100, ranarray2_100, ranarray3_100, ranarray4_100,
			ranarray5_100, ranarray6_100, ranarray7_100, ranarray8_100, ranarray9_100, ranarray0_100);

//  for 1000 elements //	
	long quickSortTime_1000 = quickSortEfficiency (array1_1000, array2_1000, array3_1000, array4_1000,
			array5_1000, array6_1000, array7_1000, array8_1000, array9_1000, array0_1000);
	
	long medianOfThreeTime_1000 = medianOfThreeEfficiency (medarray1_1000, medarray2_1000, medarray3_1000, medarray4_1000,
			medarray5_1000, medarray6_1000, medarray7_1000, medarray8_1000, medarray9_1000, medarray0_1000);
	
	long randMedianTime_1000 = randomMedianEfficiency (ranarray1_1000, ranarray2_1000, ranarray3_1000, ranarray4_1000,
			ranarray5_1000, ranarray6_1000, ranarray7_1000, ranarray8_1000, ranarray9_1000, ranarray0_1000); 

//  for 10000 elements //	
	long quickSortTime_10000 = quickSortEfficiency (array1_10000, array2_10000, array3_10000, array4_10000,
			array5_10000, array6_10000, array7_10000, array8_10000, array9_10000, array0_10000);
	
	long medianOfThreeTime_10000 = medianOfThreeEfficiency (medarray1_10000, medarray2_10000, medarray3_10000, medarray4_10000,
			medarray5_10000, medarray6_10000, medarray7_10000, medarray8_10000, medarray9_10000, medarray0_10000);
	
	long randMedianTime_10000 = randomMedianEfficiency (ranarray1_10000, ranarray2_10000, ranarray3_10000, ranarray4_10000,
			ranarray5_10000, ranarray6_10000, ranarray7_10000, ranarray8_10000, ranarray9_10000, ranarray0_10000);
	
	System.out.println("The average for quickSort with 100 elements is " +quickSortTime_100 + " in nanoseconds");
	System.out.println("The average for median of three with 100 element is " +medianOfThreeTime_100+ " in nanoseconds");
	System.out.println("The average for random median with 100 element is " +randMedianTime_100+ " in nanoseconds");
	System.out.println();
	System.out.println("The average for quickSort with 1000 elements is " +quickSortTime_1000 + " in nanoseconds");
	System.out.println("The average for median of three with 1000 element is " +medianOfThreeTime_1000+ " in nanoseconds");
	System.out.println("The average for random median with 1000 element is " +randMedianTime_1000+ " in nanoseconds");
	System.out.println();
	System.out.println("The average for quickSort with 10000 elements is " +quickSortTime_10000 + " in nanoseconds");
	System.out.println("The average for median of three with 10000 element is " +medianOfThreeTime_10000+ " in nanoseconds");
	System.out.println("The average for random median with 10000 element is " +randMedianTime_10000+ " in nanoseconds");
*/
	}
	

	public static int partition(int []a, int p, int r) {
		int i = p-2;
		
		for (int j = p-1; j < r-1; j++)
			if (a[j] <= a[r-1]) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				//printArray(a);
			}
		
		int temp = a[i+1];
		a[i+1] = a[r-1];
		a[r-1] = temp;
		i = i + 1;
		return i;
	}
	
	public static void quickSort (int []a, int p, int r) {
	
		if (p < r) {
			int q = partition(a,p,r);
			quickSort(a,p,q);
			quickSort(a,q+2,r);
			
		}
	}
	
	public static void medianOfThree (int []a, int p, int r) {
		
		int q = (int) Math.floor((p + r)/2);			// get the median index q
		
		int [] threeNum = {a[p-1], a[q-1], a[r-1]};		// put the three num in an array
		
		quickSort(threeNum, 1, threeNum.length);			// sort the array of three number
		
		// replace index r,p,q respectively
		a[r-1] = threeNum[1];	// the median moved to rightmost as pivot
		a[q-1] = threeNum[2];	// the highest element is now middle of index
		a[p-1] = threeNum[0];	// the lowest element is now first most index
		
		//return a;
		quickSort(a, 1, a.length);
	
	}

	public static void randomMedian (int []a, int p, int r) {
	
		//create the random indexes
		int ranIndex1 = (int)(Math.random() *r); 
		int ranIndex2 = (int)(Math.random() *r);
		int ranIndex3 = (int)(Math.random() *r);
		int ranIndex4 = (int)(Math.random() *r);
		int ranIndex5 = (int)(Math.random() *r);
		
		//put them in an array and then sort, notice fiveNum[2] is the median after sorting for 5 integers
		int [] fiveNum = {a[ranIndex1], a[ranIndex2], a[ranIndex3], a[ranIndex4], a[ranIndex5]};
		quickSort(fiveNum, 1, fiveNum.length);
	
		// for loop to run throughout the original array
		for (int i = 0; i < r; i++) {
			
			// if element is equal to the median....
			if (a[i] == fiveNum[2]) {
		
				//exchange the median with last element and last element with index at i
				int temp = a[r-1];
				a[r-1] = a[i];
				a[i] = temp;
				break;
			}
		}
		//return a;
		quickSort(a, 1, a.length);
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
		
		System.out.println();
			
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
	
	public static long quickSortEfficiency (int [] a, int [] b, int [] c, int [] d, int [] e,
			int [] f, int [] g, int [] h, int [] i, int [] j) {
		
		long startTime = System.nanoTime();
			quickSort(a, 1, a.length);
			quickSort(b, 1, b.length);
			quickSort(c, 1, c.length);
			quickSort(d, 1, d.length);
			quickSort(e, 1, e.length);
			quickSort(f, 1, f.length);
			quickSort(g, 1, g.length);
			quickSort(h, 1, h.length);
			quickSort(i, 1, i.length);
			quickSort(j, 1, j.length);
		long endTime = System.nanoTime();
		
		long totalTime = endTime - startTime;
		long avgTime = totalTime/10;

			return avgTime;
	}
	
	public static long medianOfThreeEfficiency (int [] a, int [] b, int [] c, int [] d, int [] e,
			int [] f, int [] g, int [] h, int [] i, int [] j) {
		
		long startTime = System.nanoTime();
			medianOfThree(a, 1, a.length);
			medianOfThree(b, 1, b.length);
			medianOfThree(c, 1, c.length);
			medianOfThree(d, 1, d.length);
			medianOfThree(e, 1, e.length);
			medianOfThree(f, 1, f.length);
			medianOfThree(g, 1, g.length);
			medianOfThree(h, 1, h.length);
			medianOfThree(i, 1, i.length);
			medianOfThree(j, 1, j.length);
		long endTime = System.nanoTime();
	
		long totalTime = endTime - startTime;
		long avgTime = totalTime/10;

			return avgTime;
	}
	
	public static long randomMedianEfficiency (int [] a, int [] b, int [] c, int [] d, int [] e,
			int [] f, int [] g, int [] h, int [] i, int [] j) {
		
		long startTime = System.nanoTime();
			randomMedian(a, 1, a.length);
			randomMedian(b, 1, b.length);
			randomMedian(c, 1, c.length);
			randomMedian(d, 1, d.length);
			randomMedian(e, 1, e.length);
			randomMedian(f, 1, f.length);
			randomMedian(g, 1, g.length);
			randomMedian(h, 1, h.length);
			randomMedian(i, 1, i.length);
			randomMedian(j, 1, j.length);
		long endTime = System.nanoTime();

		long totalTime = endTime - startTime;
		long avgTime = totalTime/10;

			return avgTime;
		
	}
}// end class 