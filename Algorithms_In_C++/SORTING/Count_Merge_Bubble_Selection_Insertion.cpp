#include<iostream>
using namespace std;
void swap(int *a, int *b)
{   if(a==b)
	{
		return;
	}
	*a=*a+*b;
	*b=*a-*b;
	*a=*a-*b;
}
// logic is to compare consecutive elements and switch them at the end of each iteration, greatest number is at the end
void bubble(int arr[])
{
	for(int i=0;i<=9;i++)
	{
		for(int j=0;j<9-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap(&arr[j], &arr[j+1]);
			
}		}
	}
	for (int i = 0; i <10;i++)
	{
		cout<<arr[i]<<endl;
	}
}

//logic is to find the smallest element and then swap it with the current counter
void selection(int arr[])
{int z;
	for(int i=0;i<9;++i)
	{
		z=i;
		for(int j=i+1; j<10;j++)
		{
			if(arr[j]<arr[z])
				z=j;
		}
	swap(&arr[i],&arr[z]);
	}
	for (int i = 0; i <10;i++)
	{
		cout<<arr[i]<<endl;
	}
}
/*logic is to pick up each element one by one and compare it with all the previous ones if a greater 
one is found then shift it ahead and decrease the counter at the end put j+1 as key*/
void insertion(int arr[])
{int key, j;
	for(int i=1; i<10; i++)
	{
		key=arr[i];
		j=i-1;
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	for (int i = 0; i <10;i++)
	{
		cout<<arr[i]<<endl;
	}
}


void merge(int arr[],int low,int mid, int high)
{
	int n1, n2,i,j;
	n1=mid-low+1;
	n2=high-mid;
	int arr1[10], arr2[10];
	for(i=0;i<n1;i++)
	{
		arr1[i]=arr[low+i];
	}
	for (j = 0; j < n2;++j)
	{
		arr2[j]=arr[mid+j+1];
	}
	int k=low;
	j=0;
	i=0;
	while(i<n1 && j<n2)
	{
		if(arr1[i]<=arr2[j])
		{
			arr[k]=arr1[i];
			i++;
		}
		 else if(arr2[j]<arr1[i])
		{
			arr[k]=arr2[j];
			j++;
		}
		k++;
	}
	while(i<n1)
	{
		arr[k]=arr1[i];
		k++;
		i++;
	}
	while(j<n2)
	{
		arr[k]=arr2[j];
		k++;
		j++;
	}
	

}
void mergesort(int arr[], int low, int high)
{ int mid;
	if(high>low)
	{	
		mid= low + (high-low)/2;
		mergesort(arr,low,mid);
		mergesort(arr, mid+1, high);
		merge(arr, low, mid, high);
		
	}
	
	
}
int partition(int arr[], int low, int high)
{	int pivot;
	int x=0;
	pivot=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++)
	{
		if(arr[j]<=pivot)
		{  
			i++;
			swap(&arr[j], &arr[i]);
		}
	}
	i++;
	swap(&arr[i], &arr[high]);
	return i;
}
void quicksort(int arr[], int low, int high)
{	if(low<high)
	{
		int pi= partition(arr, low, high);
		quicksort(arr,low,pi-1);
		quicksort(arr, pi+1,high);
	}
}
int main()
{
	int arr[10], choice;
	cout<<"enter your numbers";
	for(int i=0; i<10;i++){
	cin>>arr[i];
	}
	cout<<"enter your choice";
	cin>>choice;
	if(choice==1)
	{
		cout<<"bubble sort";
		bubble(arr);
	}
	else if(choice==2)
	{
		cout<<"selection sort";
		selection(arr);
	}
	else if(choice==3)
	{
		cout<<"insertion sort";
		insertion(arr);
	}
    else if(choice==4)
	{
		cout<<"merge sort";
		mergesort(arr,0,9);
		for (int i = 0; i <10;i++)
	{
		cout<<arr[i]<<endl;
	}
	}
	else if(choice==5)
	{
		cout<<"quick sort";
		quicksort(arr,0,9);
			for (int i = 0; i <10;i++)
	{
		cout<<arr[i]<<endl;
	}
	}

	return 0;
}
