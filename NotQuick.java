import java.util.Arrays;
import java.util.Random;
public class NotQuick
{
	// Stýristærðir fyrir keyrslu
	static	int MaxSize	=100000000;
	static	int Number	=1;
	static 	int Range	=100000000;
	public static void main(String[] args)
	{
//*Declaring measurements
		long[] time = new long[11];
		long[] memory  = new long[11];
//Declaring for convenience
		Runtime rt= Runtime.getRuntime();

//Random input
		int[][][] array;
		for(int Size=1000;Size<=MaxSize;Size+=1000)
		{
			array= new int[10][Number][Size];
			for(int i=0;i<Number;i++)
			{
				for(int j=0;j<Size;j++)
				{
					int generated=(int)Math.random()*Range;
					for(int k=0;k<10;k++)
						array[k][i][j]=generated;
				}
			}
//			System.out.println("Input generated starting tests");
//Runnin//Running tests
			System.gc();
			time[1]=-System.nanoTime();
			memory[1]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s1(array[1][i]);
			time[1]+=System.nanoTime();
			memory[1]+=rt.totalMemory()-rt.freeMemory();
//*/
/*		
			System.gc();
			time[3]=-System.nanoTime();
			memory[3]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s3(array[3][i]);
			time[3]+=System.nanoTime();
			memory[3]+=rt.totalMemory()-rt.freeMemory();
//*/
		
		
			System.gc();
			time[5]=-System.nanoTime();
			memory[5]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s5(array[5][i]);
			time[5]+=System.nanoTime();
			memory[5]+=rt.totalMemory()-rt.freeMemory();
//*/
		
			
			System.gc();
			time[6]=-System.nanoTime();
			memory[6]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s6(array[6][i]);
			time[6]+=System.nanoTime();
			memory[6]+=rt.totalMemory()-rt.freeMemory();
//*/
		
        
			System.gc();
			time[8]=-System.nanoTime();
			memory[8]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s8(array[8][i]);
			time[8]+=System.nanoTime();
			memory[8]+=rt.totalMemory()-rt.freeMemory();
//*/
		
			
			System.gc();
			time[9]=-System.nanoTime();
			memory[9]-=rt.totalMemory()-rt.freeMemory();
			for(int i=0;i<Number;i++)
				Sorter.s9(array[9][i]);
			time[9]+=System.nanoTime();
			memory[9]+=rt.totalMemory()-rt.freeMemory();
//*/
		
			System.out.printf("%10d",Size);
			for(int i=1;i<11;i++)
			{
				System.out.printf("%10d ",time[i]);
			}
			for(int i=1;i<11;i++)
			{
				System.out.printf("%10d ",memory[i]);
			}
			System.out.printf("\n");
		}
	}
}
