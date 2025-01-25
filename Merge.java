import java.util.*;
class Merge
{
	static void mergeSort(int low,int high,int[] arr)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(low,mid,arr);
			mergeSort(mid+1,high,arr);
			mergearr(low,mid,high,arr);
		}
	}
	static void mergearr(int low,int mid,int high,int[] arr)
	{
		int i=low;
		int j=mid+1;
		int[] temp=new int[high+1];
		int k=low;
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		while(j<=high)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		for(int h=low;h<=high;h++)
		{
			arr[h]=temp[h];
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size  of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		mergeSort(0,(arr.length)-1,arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
	
	
	
	
