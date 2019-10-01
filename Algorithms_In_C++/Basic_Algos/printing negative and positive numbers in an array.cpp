#include <iostream>

using namespace std;

int main()
{
    int n ,s =0 , array[100], negative_terms[100] , positive_terms[100] ;
    cout << "enter size of array \n" ;
    cin >> n;
    cout << "enter elements of array - \n";
    while(s < n)
    {
        cin >> array[s];
   s++;
    }
    int i = 0,j=0,k=0;
    while(i < n)
    {
        if(array[i] < 0)
           { negative_terms[j] = array[i];
              j++; }
        else if(array[i] >= 0 )
           { positive_terms[k] = array[i] ;
              k++; }
              i++;
    }
     cout << "all negative terms are -- \n" ;
    for(int p = 0 ; p< j; p++)
 { cout <<  negative_terms[p] << endl;
  }
  cout << "all positive terms are -- \n" ;
 for(int p = 0 ; p< k;  p++)
 { cout << positive_terms[p] << endl ;
 }

}

