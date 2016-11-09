/* Jason Pham Project #2
 * PHAJA
 */


public class MergeSort {

	public static void main(String[] args) {
		
/* This block of code is to sort 100 random numbers SHOW IN SCRIPT FILE */
		
		//Generate and print the array unsorted
		int [] testArray_100 = numGenerator(100);
		System.out.print("array before sort");
		printArray(testArray_100);
		System.out.println();
		
		//Use mergeSort to sorth array and print sorted array
		mergeSort(testArray_100, 1, 100);
		System.out.print("array after sort");
		printArray(testArray_100);

		
/* Generate arrays N */
		int [] randArray1_N1000 = numGenerator(1000);
		int [] randArray2_N1000 = numGenerator(1000);
		int [] randArray3_N1000 = numGenerator(1000);
		int [] randArray4_N1000 = numGenerator(1000);
		int [] randArray5_N1000 = numGenerator(1000);
		int [] randArray6_N1000 = numGenerator(1000);
		int [] randArray7_N1000 = numGenerator(1000);
		int [] randArray8_N1000 = numGenerator(1000);
		int [] randArray9_N1000 = numGenerator(1000);
		int [] randArray0_N1000 = numGenerator(1000);
		
		int [] randArray1_N10000 = numGenerator(10000);
		int [] randArray2_N10000 = numGenerator(10000);
		int [] randArray3_N10000 = numGenerator(10000);
		int [] randArray4_N10000 = numGenerator(10000);
		int [] randArray5_N10000 = numGenerator(10000);
		int [] randArray6_N10000 = numGenerator(10000);
		int [] randArray7_N10000 = numGenerator(10000);
		int [] randArray8_N10000 = numGenerator(10000);
		int [] randArray9_N10000 = numGenerator(10000);
		int [] randArray0_N10000 = numGenerator(10000);
		
		int [] randArray1_N100000 = numGenerator(100000);
		int [] randArray2_N100000 = numGenerator(100000);
		int [] randArray3_N100000 = numGenerator(100000);
		int [] randArray4_N100000 = numGenerator(100000);
		int [] randArray5_N100000 = numGenerator(100000);
		int [] randArray6_N100000 = numGenerator(100000);
		int [] randArray7_N100000 = numGenerator(100000);
		int [] randArray8_N100000 = numGenerator(100000);
		int [] randArray9_N100000 = numGenerator(100000);
		int [] randArray0_N100000 = numGenerator(100000);
		
		
/* sort all above by mergeSort */
		sortAll(randArray1_N1000, randArray2_N1000, randArray3_N1000, randArray4_N1000, randArray5_N1000,
				randArray6_N1000, randArray7_N1000, randArray8_N1000, randArray9_N1000, randArray0_N1000, 1, 1000);
		
		sortAll(randArray1_N10000, randArray2_N10000, randArray3_N10000, randArray4_N10000, randArray5_N10000,
				randArray6_N10000, randArray7_N10000, randArray8_N10000, randArray9_N10000, randArray0_N10000, 1, 10000);
		
		sortAll(randArray1_N100000, randArray2_N100000, randArray3_N100000, randArray4_N100000, randArray5_N100000,
				randArray6_N100000, randArray7_N100000, randArray8_N100000, randArray9_N100000, randArray0_N100000, 1, 100000);
		
		
/* Generate Array M size 25,50,100 and numbers between 1000,10000,100000 */
		int [] randArray1000_M25 = arrayMGenerator(1000,25);
		int [] randArray10000_M25 = arrayMGenerator(10000,25);
		int [] randArray100000_M25 = arrayMGenerator(100000,25);
		
		int [] randArray1000_M50 = arrayMGenerator(1000, 50);
		int [] randArray10000_M50 = arrayMGenerator(10000,50);
		int [] randArray100000_M50 = arrayMGenerator(100000,50);
		
		int [] randArray1000_M100 = arrayMGenerator(1000,100);
		int [] randArray10000_M100 = arrayMGenerator(100000,100);
		int [] randArray100000_M100 = arrayMGenerator(100000,100);
		
	
/* This block of code is to APPEND the two file then sort SHOW IN SCRIPT FILE*/
		
		//call the append method and pass the two arrays M and N then print out the combined array
		int [] appendM25N1000_1 = append(randArray1_N1000, randArray1000_M25);
		System.out.print("Append the Sorted array N of 1000 with Unsorted array M of size 25 numbers between 0-1000");
		printArray(appendM25N1000_1);
		System.out.println();
		
		//use mergeSort to sort the combined array and display
		mergeSort(appendM25N1000_1, 1, appendM25N1000_1.length);
		System.out.print("Using merge Sort, sort the new combined array");
		printArray(appendM25N1000_1);
		
		
/* This block of code is to MERGE the two arrays M and N and sort SHOW IN SCRIPT FILE */
		
		//Display array N and array M
		System.out.print("Array N");
		printArray(randArray1_N1000);
		System.out.println();
		System.out.print("Array M");
		printArray(randArray1000_M25);
		System.out.println();
		
		//Call the merge2Arrays function to merge and sort both M and N array then print
		int [] mergeM25N1000_1 = merge2Arrays(randArray1_N1000, randArray1000_M25);
		System.out.print("M and N merged");
		printArray(mergeM25N1000_1);
		
		
/* This block of code is to determine the Efficiency of APPENDING M and N then sort */
		
		//efficiency with M=25,50,100 and N=1000 10 power3
		long appendAvgT_N1000_M25 = appendEfficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M25);
		
		long appendAvgT_N1000_M50 = appendEfficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M50);
		
		long appendAvgT_N1000_M100 = appendEfficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M100);
		
		//efficiency with M=25,50,100 and N=10000 10 power4
		long appendAvgT_N10000_M25 = appendEfficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M25);
		
		long appendAvgT_N10000_M50 = appendEfficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M50);
		
		long appendAvgT_N10000_M100 = appendEfficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M100);
		
		//efficiency with M=25,50,100 and N=100000 10 power5
		long appendAvgT_N100000_M25 = appendEfficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M25);
		
		long appendAvgT_N100000_M50 = appendEfficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M50);
		
		long appendAvgT_N100000_M100 = appendEfficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M100);
	
/* This block of code is to determine the Efficiency of Merging M and N */		
		
		//efficiency of merge with N=1000 10 power3
		long mergAvgT_N1000_M25 = merge2Efficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M25);
		
		long mergAvgT_N1000_M50 = merge2Efficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M50);
		
		long mergAvgT_N1000_M100 = merge2Efficiency(randArray1_N1000, randArray2_N1000, randArray3_N1000,
				randArray4_N1000, randArray5_N1000, randArray6_N1000, randArray7_N1000,
				randArray8_N1000, randArray9_N1000, randArray0_N1000, randArray1000_M100);
		
		//efficiency of merge with N=10000 10 power4
		long mergAvgT_N10000_M25 = merge2Efficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M25);
		
		long mergAvgT_N10000_M50 = merge2Efficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M50);
		
		long mergAvgT_N10000_M100 = merge2Efficiency(randArray1_N10000, randArray2_N10000, randArray3_N10000,
				randArray4_N10000, randArray5_N10000, randArray6_N10000, randArray7_N10000,
				randArray8_N10000, randArray9_N10000, randArray0_N10000, randArray10000_M100);
		
		//efficiency of merge with N=100000 10 power5
		long mergAvgT_N100000_M25 = merge2Efficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M25);
		
		long mergAvgT_N100000_M50 = merge2Efficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M50);
		
		long mergAvgT_N100000_M100 = merge2Efficiency(randArray1_N100000, randArray2_N100000, randArray3_N100000,
				randArray4_N100000, randArray5_N100000, randArray6_N100000, randArray7_N100000,
				randArray8_N100000, randArray9_N100000, randArray0_N100000, randArray100000_M100);

	
/* print out the average times */
/* COMMENTED OUT THE DISPLAY NOT IN SCRIPT FILE		
		System.out.println("The average time to append in nanoSeconds N = 1000 and M = 25 is " +appendAvgT_N1000_M25);
		System.out.println("The average time to append in nanoSeconds N = 1000 and M = 50 is " +appendAvgT_N1000_M50);
		System.out.println("The average time to append in nanoSeconds N = 1000 and M = 100 is " +appendAvgT_N1000_M100);
		System.out.println();
		
		System.out.println("The average time to append in nanoSeconds N = 10000 and M = 25 is " +appendAvgT_N10000_M25);
		System.out.println("The average time to append in nanoSeconds N = 10000 and M = 50 is " +appendAvgT_N10000_M50);
		System.out.println("The average time to append in nanoSeconds N = 10000 and M = 100 is " +appendAvgT_N10000_M100);
		System.out.println();
		
		System.out.println("The average time to append in nanoSeconds N = 100000 and M = 25 is " +appendAvgT_N100000_M25);
		System.out.println("The average time to append in nanoSeconds N = 100000 and M = 50 is " +appendAvgT_N100000_M50);
		System.out.println("The average time to append in nanoSeconds N = 100000 and M = 100 is " +appendAvgT_N100000_M100);
		System.out.println();
		
		System.out.println("The average time to merge in nanoSeconds N = 1000 and M = 25 is " +mergAvgT_N1000_M25);
		System.out.println("The average time to merge in nanoSeconds N = 1000 and M = 50 is " +mergAvgT_N1000_M50);
		System.out.println("The average time to merge in nanoSeconds N = 1000 and M = 100 is " +mergAvgT_N1000_M100);
		System.out.println();
		
		System.out.println("The average time to merge in nanoSeconds N = 10000 and M = 25 is " +mergAvgT_N10000_M25);
		System.out.println("The average time to merge in nanoSeconds N = 10000 and M = 50 is " +mergAvgT_N10000_M50);
		System.out.println("The average time to merge in nanoSeconds N = 10000 and M = 100 is " +mergAvgT_N10000_M100);
		System.out.println();
		
		System.out.println("The average time to merge in nanoSeconds N = 100000 and M = 25 is " +mergAvgT_N100000_M25);
		System.out.println("The average time to merge in nanoSeconds N = 100000 and M = 50 is " +mergAvgT_N100000_M50);
		System.out.println("The average time to merge in nanoSeconds N = 100000 and M = 100 is " +mergAvgT_N100000_M100);
		System.out.println();
*/		
	}
	
/* create a number generator method to generate the array of n size */
		public static int [] numGenerator (int n) {
			
			int [] numArray = new int[n];
			
			for (int x = 0; x < n; x++)
				numArray[x] = (int)(Math.random() *n);
			
			return numArray;
			
		}

/* This method creates the M array of size s with numbers between 0-n */
		public static int [] arrayMGenerator (int n, int s) {
			int [] numArray = new int[s];
			for (int x = 0; x < s; x++)
				numArray[x] = (int)(Math.random() *n);
			
			return numArray;
		}

/* create a print method */
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

/* mergeSort method */		
		public static void mergeSort(int []a, int p, int r ) {
			if (p < r) {
				int q = (int) Math.floor((p + r)/2);
				mergeSort(a,p,q);
				mergeSort(a,q+1,r);
				merge(a,p,q,r);
			}
					
		}
		
/* merge method*/
		public static void merge(int []a, int p, int q, int r) {
			
			/* n1 and n2 are # of elements for new arrays */
			int n1 = q-p+1;										
			int n2 = r-q;
			
			/* assign new array (left) and (right), added one more element to utilize an arbitrary # */
			int [] left = new int[n1+1];						
			int [] right = new int[n2+1];
			
			/* assigning the elements to each indexes of array (left) and (right)*/
			for (int i = 0; i < n1; i++)
				left[i] = a[p+i-1];
			
			for (int j = 0; j < n2; j++)
				right[j] = a[q+j];
			
			/* utilize arbitrary numbers */
			left[n1] = 200000;
			right[n2] = 200000;
			
			for (int k = p-1, m = 0, n = 0; k < r; k++) {
				if (left[m] <= right[n]) {
					a[k] = left[m];
					m++;
				
				}
			
				else {
					a[k] = right[n];
					n++;
					
				}
				
			}
			
			
		}
		
/* method to append sorted array M and unsorted Array N  and return the combined arrays into a new one*/
		public static int [] append (int []M, int []N) {
			//create new combined array
			int [] combinedArray = new int[M.length + N.length];
			
			//move elements of array M and N over to combined array
			for (int k = 0, i = 0, j = 0; k < combinedArray.length; k++) {
				if (k+1 > M.length) {
					combinedArray[k] = N[j];
					j++;
				}	
					
				else {
					combinedArray[k] = M[i];
					i++;
				}
							
			}
			return combinedArray;	
		}
		
/* method to sort the unsorted Array N and and use merge method to combine */
		public static int [] merge2Arrays (int [] M, int [] N) {
			
			//create new arrays with +1 added element for the arbitrary numbers
			int [] newM = new int [M.length +1];
			int [] newN = new int [N.length +1];
			int [] combined = new int [M.length + N.length];
			
			for (int i = 0; i < M.length; i++)
				newM[i] = M[i];
			
			for (int j = 0; j < N.length; j++)
				newN[j] = N[j];
			
			newM[newM.length-1] = 200000;
			newN[newN.length-1] = 200000;
			
			//Sort the unsorted array
			mergeSort(newN, 1, N.length);
			
			//merging and sorting code
			for (int k = 0, m = 0, n = 0; k < (combined.length); k++) {
				if (newM[m] <= newN[n])	{
					combined[k] = newM[m];
					m++;
					
				}
				else {
					combined[k] = newN[n];
					n++;
				}	
			}
			
			return combined;
		}
		
/* method to sort the N sized arrays */
		public static void sortAll (int []a, int []b, int []c, int []d, int []e, int []f, int []g, int []h, 
				int [] i, int []j, int p, int r) {
			mergeSort(a,p,r);
			mergeSort(b,p,r);
			mergeSort(c,p,r);
			mergeSort(d,p,r);
			mergeSort(e,p,r);
			mergeSort(f,p,r);
			mergeSort(g,p,r);
			mergeSort(h,p,r);
			mergeSort(i,p,r);
			mergeSort(j,p,r);
		}

/* method to analyze append efficiency arguments: N array 1-10, M array, */
		public static long appendEfficiency(int []an, int []bn, int []cn, int []dn, int []en,
				int []fn, int []gn, int []hn, int[] in, int []jn, int []am) {
			
			long startTime = System.nanoTime();
				
				int []app1 = append(an,am);
				mergeSort(app1, 1, app1.length);
				
				int []app2 = append(bn,am);
				mergeSort(app2, 1, app2.length);
				
				int []app3 = append(cn,am);
				mergeSort(app3, 1, app3.length);
				
				int []app4 = append(dn,am);
				mergeSort(app4, 1, app4.length);
				
				int []app5 = append(en,am);
				mergeSort(app5, 1, app5.length);
				
				int []app6 = append(fn,am);
				mergeSort(app6, 1, app6.length);
				
				int []app7 = append(gn,am);
				mergeSort(app7, 1, app7.length);
				
				int []app8 = append(hn,am);
				mergeSort(app8, 1, app8.length);
				
				int []app9 = append(in,am);
				mergeSort(app9, 1, app9.length);
				
				int []app10 = append(jn,am);
				mergeSort(app10, 1, app10.length);
				
			long endTime = System.nanoTime();
			
			long totalTime = endTime - startTime;
			long avgTime = totalTime/10;

			return avgTime;
				
		}
	
/* method to analyze merge efficiency */		
		public static long merge2Efficiency(int []an, int []bn, int []cn, int []dn, int []en,
				int []fn, int []gn, int []hn, int[] in, int []jn, int []am) {
			
			long startTime = System.nanoTime();
				
				merge2Arrays(an,am);
				merge2Arrays(bn,am);
				merge2Arrays(cn,am);
				merge2Arrays(dn,am);
				merge2Arrays(en,am);
				merge2Arrays(fn,am);
				merge2Arrays(gn,am);
				merge2Arrays(hn,am);
				merge2Arrays(in,am);
				merge2Arrays(jn,am);
				
			long endTime = System.nanoTime();	
			
			long totalTime = endTime - startTime;
			long avgTime = totalTime/10;

			return avgTime;
		}
} //end class