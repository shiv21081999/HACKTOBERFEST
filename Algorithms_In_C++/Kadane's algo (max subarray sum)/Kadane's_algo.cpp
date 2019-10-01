#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int currsum=0;
    int maxsum=0;
    for(int i=0;i<n;i++)
    {
        currsum=currsum+arr[i];
        if(currsum<0)
            currsum=0;
        if(currsum>maxsum)
            maxsum=currsum;
    }
    cout<<maxsum;
}
