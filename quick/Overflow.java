import java.util.Arrays;
import java.util.Random;
public class Overflow
{
	// Stýristærðir fyrir keyrslu
	static	int MaxSize	=1000000000;
	static 	int Range	=1000;
	public static void main(String[] args)
	{
		boolean s3 =true;
		boolean s4 =true;
		boolean s7 =true;
		boolean s10=true;
		for (int Size=15000;Size<MaxSize;Size+=100)
		{
			int[] array = new int[Size];
			for(int i=0;i<Size;i++)
			{
				for(int j=0;j<10;j++)
					array[i]=i;
			}
			if(s3 ){ try{Sorter.s3(array); }catch (StackOverflowError e) {System.out.println("s3 overflowed with "  + Size + " sorted numbers ");s3=false;}}
			if(s4 ){ try{Sorter.s4(array); }catch (StackOverflowError e) {System.out.println("s4 overflowed with "  + Size + " sorted numbers ");s4=false;}}
			if(s7 ){ try{Sorter.s7(array); }catch (StackOverflowError e) {System.out.println("s7 overflowed with "  + Size + " sorted numbers ");s4=false;}}
			if(s10){ try{Sorter.s10(array);}catch (StackOverflowError e) {System.out.println("s10 overflowed with " + Size + " sorted numbers ");s4=false;}}
		}
	}
}
