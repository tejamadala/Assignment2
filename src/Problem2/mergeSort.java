package Problem2;

public class mergeSort
{
	public static void mergeSort(int[] ar, int arsize)
	{
		if(arsize==0 || arsize==1)
		{
			return;
		}
		if(arsize>1)
		{
			int half=arsize/2;
			int[] right=new int[arsize-half];
			int[] left=new int[half];
			int index=0; //for existing array index
			int x=0; //right array index
			int y=0; //left array index
			//right half
			for(int i=half; i<arsize; i++)
			{
				int rin=i-half;
				right[rin]=ar[i];
			}
			
			//left half
			for(int i=0; i<half; i++)
			{
				left[i]=ar[i];
			}
			
			//Recursive method
			mergeSort(right,arsize-half);
			mergeSort(left,half);
			
			//x used for right, y used for left
			while(x<(arsize-half) && y<half)
			{
				if(left[y]<right[x])
				{
					ar[index]=left[y];
					y++;
				}
				else
				{
					ar[index]=right[x];
					x++;
				}
				index++;
			}
			while(x<(arsize-half))
			{
				ar[index]=right[x];
				index++;
				x++;
			}
			while(y<half)
			{
				ar[index]=left[y];
				index++;
				y++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] a={5, 91, 24, 3, 74, 543, 2};
		int arraySize=7;
		
		mergeSort(a,arraySize);
		for(int i=0; i<arraySize; i++)
		{
			System.out.print(a[i]+", ");
		}
	}
}