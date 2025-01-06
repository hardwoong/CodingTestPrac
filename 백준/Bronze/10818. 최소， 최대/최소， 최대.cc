#include <iostream>
using namespace std;

int main()
{
    long int N;
    cin>>N;
    long int arr[N];
    for(int i=0; i<N; i++)
    {
        cin>>arr[i];
    }
    long int max = arr[0];
    long int min = arr[0];
    for(int j=0; j<N; j++)
    {
        if(max<arr[j]) max=arr[j];
    }
    for(int k=0; k<N; k++)
    {
        if(min>arr[k]) min=arr[k];
    }
    cout<<min<<" "<<max<<endl;

    return 0;
}