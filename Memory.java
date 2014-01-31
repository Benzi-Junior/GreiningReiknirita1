import java.util.Arrays;
import java.util.Random;
public class TimeMemory
{
	// Stýristærðir fyrir keyrslu
	static	int Size	=1000000;
	static	int Number	=10;
	static 	int Range	=10;
	public static void main(String[] args)
	{
//Generate Input
//Random input
		int[][][] array = new int[10][Number][Size];
		for(int i=0;i<Number;i++)
		{
			for(int j=0;j<Size;j++)
			{
				int generated=(int)Math.random()*Range;
				for(int k=0;k<10;k++)
					array[k][i][j]=generated;
			}
		}
//Fixed Arrays
//
		int[][] sortedarray = new int[10][Size];
		for(int i=0;i<Size;i++)
		{
			for(int j=0;j<10;j++)
				sortedarray[j][i]=i;
		}

		int[][] inversedarray = new int[10][Size];
		for(int i=0;i<Size;i++)
		{
			for(int j=0;j<10;j++)
				inversedarray[j][i]=i;
		}
		
		
		int[][] evenarray = new int[10][Size];
		for(int i=0;i<Size;i++)
		{
			for(int j=0;j<10;j++)
				evenarray[j][i]=j;
		}
//*Declaring measurements
		long[] randomtime = new long[11];
		long[] sortedtime = new long[11];
		long[] inverstime = new long[11];
		long[] equalstime = new long[11];
		long[] memoryuse  = new long[11];
//Declaring for convenience
		Runtime rt= Runtime.getRuntime();

		System.out.println("Input generated starting tests");
//Running tests
		System.gc();
		randomtime[1]=-System.nanoTime();
		memoryuse[1]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s1(array[1][i]);
		randomtime[1]+=System.nanoTime();
		memoryuse[1]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[1]-=System.nanoTime();
		Sorter.s1(sortedarray[1]);
		sortedtime[1]+=System.nanoTime();
		inverstime[1]-=System.nanoTime();
		Sorter.s1(inversedarray[1]);
		inverstime[1]+=System.nanoTime();
		equalstime[1]-=System.nanoTime();
		Sorter.s1(evenarray[1]);
		equalstime[1]+=System.nanoTime();
//		System.out.println(randomtime[1]);
/*
		System.gc();
		randomtime[2]=-System.nanoTime();
		memoryuse[2]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s2(array[2][i]);
		randomtime[2]+=System.nanoTime();
		memoryuse[2]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[2]-=System.nanoTime();
		Sorter.s1(sortedarray[2]);
		sortedtime[2]+=System.nanoTime();
		inverstime[2]-=System.nanoTime();
		Sorter.s1(inversedarray[2]);
		inverstime[2]+=System.nanoTime();
		equalstime[2]-=System.nanoTime();
		Sorter.s1(evenarray[2]);
		equalstime[2]+=System.nanoTime();
//		System.out.println(randomtime[2]);
		
		System.gc();
		randomtime[3]=-System.nanoTime();
		memoryuse[3]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s3(array[3][i]);
		randomtime[3]+=System.nanoTime();
		memoryuse[3]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[3]-=System.nanoTime();
		Sorter.s1(sortedarray[3]);
		sortedtime[3]+=System.nanoTime();
		inverstime[3]-=System.nanoTime();
		Sorter.s1(inversedarray[3]);
		inverstime[3]+=System.nanoTime();
		equalstime[3]-=System.nanoTime();
		Sorter.s1(evenarray[3]);
		equalstime[3]+=System.nanoTime();
//		System.out.println(randomtime[3]);
		
		System.gc();
		randomtime[4]=-System.nanoTime();
		memoryuse[4]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s4(array[4][i]);
		randomtime[4]+=System.nanoTime();
		memoryuse[4]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[4]-=System.nanoTime();
		Sorter.s1(sortedarray[4]);
		sortedtime[4]+=System.nanoTime();
		inverstime[4]-=System.nanoTime();
		Sorter.s1(inversedarray[4]);
		inverstime[4]+=System.nanoTime();
		equalstime[4]-=System.nanoTime();
		Sorter.s1(evenarray[4]);
		equalstime[4]+=System.nanoTime();
//		System.out.println(randomtime[4]);
*/		
		System.gc();
		randomtime[5]=-System.nanoTime();
		memoryuse[5]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s5(array[5][i]);
		randomtime[5]+=System.nanoTime();
		memoryuse[5]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[5]-=System.nanoTime();
		Sorter.s1(sortedarray[5]);
		sortedtime[5]+=System.nanoTime();
		inverstime[5]-=System.nanoTime();
		Sorter.s1(inversedarray[5]);
		inverstime[5]+=System.nanoTime();
		equalstime[5]-=System.nanoTime();
		Sorter.s1(evenarray[5]);
		equalstime[5]+=System.nanoTime();
//		System.out.println(randomtime[5]);
		
		System.gc();
		randomtime[6]=-System.nanoTime();
		memoryuse[6]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s6(array[6][i]);
		randomtime[6]+=System.nanoTime();
		memoryuse[6]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[6]-=System.nanoTime();
		Sorter.s1(sortedarray[6]);
		sortedtime[6]+=System.nanoTime();
		inverstime[6]-=System.nanoTime();
		Sorter.s1(inversedarray[6]);
		inverstime[6]+=System.nanoTime();
		equalstime[6]-=System.nanoTime();
		Sorter.s1(evenarray[6]);
		equalstime[6]+=System.nanoTime();
//		System.out.println(randomtime[6]);
/*		
		System.gc();
		randomtime[7]=-System.nanoTime();
		memoryuse[7]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s7(array[7][i]);
		randomtime[7]+=System.nanoTime();
		memoryuse[7]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[7]-=System.nanoTime();
		Sorter.s1(sortedarray[7]);
		sortedtime[7]+=System.nanoTime();
		inverstime[7]-=System.nanoTime();
		Sorter.s1(inversedarray[7]);
		inverstime[7]+=System.nanoTime();
		equalstime[7]-=System.nanoTime();
		Sorter.s1(evenarray[7]);
		equalstime[7]+=System.nanoTime();
//		System.out.println(randomtime[7]);
*/		
		System.gc();
		randomtime[8]=-System.nanoTime();
		memoryuse[8]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s8(array[8][i]);
		randomtime[8]+=System.nanoTime();
		memoryuse[8]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[8]-=System.nanoTime();
		Sorter.s1(sortedarray[8]);
		sortedtime[8]+=System.nanoTime();
		inverstime[8]-=System.nanoTime();
		Sorter.s1(inversedarray[8]);
		inverstime[8]+=System.nanoTime();
		equalstime[8]-=System.nanoTime();
		Sorter.s1(evenarray[8]);
		equalstime[8]+=System.nanoTime();
//		System.out.println(randomtime[8]);
//*/		
		System.gc();
		randomtime[9]=-System.nanoTime();
		memoryuse[9]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s9(array[9][i]);
		randomtime[9]+=System.nanoTime();
		memoryuse[9]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[9]-=System.nanoTime();
		Sorter.s1(sortedarray[9]);
		sortedtime[9]+=System.nanoTime();
		inverstime[9]-=System.nanoTime();
		Sorter.s1(inversedarray[9]);
		inverstime[9]+=System.nanoTime();
		equalstime[9]-=System.nanoTime();
		Sorter.s1(evenarray[9]);
		equalstime[9]+=System.nanoTime();
//		System.out.println(randomtime[9]);
/*		
		System.gc();
		randomtime[10]=-System.nanoTime();
		memoryuse[10]-=rt.totalMemory()-rt.freeMemory();
		for(int i=0;i<Number;i++)
			Sorter.s10(array[0][i]);
		randomtime[10]+=System.nanoTime();
		memoryuse[10]+=rt.totalMemory()-rt.freeMemory();
		sortedtime[10]-=System.nanoTime();
		Sorter.s1(sortedarray[0]);
		sortedtime[10]+=System.nanoTime();
		inverstime[10]-=System.nanoTime();
		Sorter.s1(inversedarray[0]);
		inverstime[10]+=System.nanoTime();
		equalstime[10]-=System.nanoTime();
		Sorter.s1(evenarray[0]);
		equalstime[10]+=System.nanoTime();
//		System.out.println(randomtime[0]);
//		*/
		for(int i=1;i<11;i++)
		{
				System.out.printf("s%d & %12d & %12d & %10d & %10d & %10d     \\\\%n",i,randomtime[i]/Number,memoryuse[i],sortedtime[i],inverstime[i],equalstime[i]);
		}
	}
}
