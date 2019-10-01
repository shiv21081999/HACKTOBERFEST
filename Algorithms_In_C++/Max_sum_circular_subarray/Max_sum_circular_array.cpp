#include<iostream>
using namespace std;
int kadanesum(int arr[],int n)
{
    int currsum=0;
    int maxsum=0;
    for(int i=0;i<n;i++)
    {
        currsum=currsum+arr[i];
        if(currsum<0)
            currsum=0;
        if(maxsum<currsum)
            maxsum=currsum;
    }
    return maxsum;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int normal_kadane_sum=kadanesum(arr,n);
    int sum_arr=0;
    for(int i=0;i<n;i++)
    {
        sum_arr+=arr[i];
    }

    for(int i=0;i<n;i++)
    {
        arr[i]=-(arr[i]);
    }

    int inverted_kadane_sum=kadanesum(arr,n);

    int circular_sum=inverted_kadane_sum+sum_arr;
    if(circular_sum>normal_kadane_sum) cout<<circular_sum;
    else cout<<normal_kadane_sum;
}
