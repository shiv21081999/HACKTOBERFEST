#include<iostream>
using namespace std;
int length(char str[])
{
    int k=0;
    for(int i=0;str[i]!='\0';i++)
    {
        k++;
    }
    return k;
}
int main()
{
    char a[100],b[100];
    cin.getline(a,100);
    cin.getline(b,100);
    int count[256]={};
    int i;
    if(length(a)!=length(b))
    {
        cout<<"Not a permutation";
        return 0;
    }
    for(i=0; a[i]!='\0' && b[i]!='\0'; i++)
    {
        count[a[i]]++;
        count[b[i]]--;
    }


    for(i=0;i<256;i++)
    {
        if(count[i]==0)
            continue;
        else
        {
            cout<<"Not a permutation";
            return 0;
        }
    }
    cout<<"It is a permutation";
}
