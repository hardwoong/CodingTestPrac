#include <iostream>
using namespace std;

int main()
{
    cout.precision(10);
    int N;
    cin>>N;
    int * arr = new int[N];
    for(int i=0; i<N; i++)
    {
        cin>>arr[i];
    }
    double max = arr[0];
    for(int i=0; i<N; i++)
    {
        if(max<arr[i]) max=arr[i];
    }
    double * arr2 = new double[N];
    for(int i=0; i<N; i++)
        arr2[i] = arr[i] / max * 100;
    // for(int i=0; i<N; i++)
    //     cout<<arr2[i]<<" ";
    cout<<"\n";
    double sum=0;
    for(int i=0; i<N; i++)
    {
        sum+=arr2[i];
    }
    cout<<sum/N<<endl;

    delete []arr;
    delete []arr2;
    return 0;
}