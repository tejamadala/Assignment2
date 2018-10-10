package Problem1;

public class Problem1Sort
{
	static void Problem1Sort(int[] ar, int arsize)
	{
		int r=ar[0];
		int x=1;
		int[] fin=new int[arsize];
		
		for(int index=1; index<arsize; index++)
		{
			if(ar[index]>r)
			{
				r=ar[index];
			}
		}
		
		while((r/x)>0)
		{
			int[] temp=new int[r];
			
			for(int i=0; i<arsize; i++)
			{
				temp[(ar[i]/x)%10]++;
			}
			for(int j=1; j<temp.length; j++)
			{
				temp[j]+=temp[j-1];
			}
			for(int k=arsize-1; k>=0; k--)
			{
				temp[(ar[k]/x)%10]-=1;
				fin[temp[(ar[k]/x)%10]]=ar[k];
			}
			for(int w=0; w<arsize; w++)
			{
				ar[w]=fin[w];
			}
			x=x*10;
		}
	}
	
	public static void main(String[] args)
	{
		int[] a= {12,9001,5,80009,532};
		int arraySize=5;
		Problem1Sort(a, arraySize);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+", ");
		}
	}
}