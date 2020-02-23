import java.util.*;
class bubblesort
{
	void sort1(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
		//System.out.println(arr[k]);
	}
	void sort2(int arr[])
	{}
	void sort3(int arr[])
	{}
}
class test
{
	public static void main(String args[])
	{
		int arr[]=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubblesort bs=new bubblesort();
		bs.sort1(arr);
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
		//bs.sort2();
		//bs.sort3();
	}
}