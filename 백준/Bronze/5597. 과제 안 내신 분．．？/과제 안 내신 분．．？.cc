#include <iostream>
using namespace std;

int main()
{
    int arr1[30];
    for(int i=0; i<30; i++)
        arr1[i]=i+1;
    // for(int i=0; i<30; i++)
    //     cout<<arr1[i]<<" ";
    int arr2[30];
    int a;
    for(int i=0; i<28; i++)
    {
        cin>>a;
        arr2[a-1]=a;
    }
    // for(int i=0; i<30; i++)
    //     cout<<arr2[i]<<" ";
    for(int i=0; i<30; i++)
    {
        if(arr1[i]!=arr2[i]) cout<<arr1[i]<<endl;
    }

    return 0;
}