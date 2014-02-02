import java.util.Arrays;
import java.util.Random;
public class VarianceTime
{
	// Stýristærðir fyrir keyrslu
	static	int Size	=100000;
	static 	int Range	=1000;
	public static void main(String[] args)
	{
//Generate Input
//Random input
		int[] array = new int[Size];
		for(int j=0;j<Size;j++)
		{
			array[j]=j%Range;
		}
		int[] a=new int[Size];
		System.arraycopy(array,0,a,0,array.length);
//Fixed Arrays
//Declaring measurements
		long randomtime=0;
//Running tests 
		while(true)
		{
		/*	
			System.arraycopy(a,0,array,0,array.length);
			randomtime= -System.nanoTime();
			Sorter.s3(array);
			randomtime+=System.nanoTime();
			System.out.printf("%12d",randomtime);
*/
			System.arraycopy(a,0,array,0,array.length);
			randomtime=-System.nanoTime();
			Sorter.s4(array);
			randomtime+=System.nanoTime();
			System.out.printf("%12d",randomtime);
        
			System.arraycopy(a,0,array,0,array.length);
			randomtime=-System.nanoTime();
			Sorter.s7(array);
			randomtime+=System.nanoTime();
			System.out.printf("%12d",randomtime);
			
			System.arraycopy(a,0,array,0,array.length);
			randomtime=-System.nanoTime();
			Sorter.s10(array);
			randomtime+=System.nanoTime();
			System.out.printf("%12d",randomtime);

			System.out.printf("%n");	
		}
	}
}
