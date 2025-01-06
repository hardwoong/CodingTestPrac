#include <iostream>
using namespace std;

int main()
{
    int N;
    long int M;
    cin>>N>>M;
    int * arr = new int[N];
    for(int i=0; i<N; i++)
        arr[i]=i+1;
    int a,b;
    for(int i=0; i<M; i++)
    {
        cin>>a>>b;
        int c = (a+b)/2;
        while(a<=c)
        {
            int temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
            a++; b--;
        }

    }

    for(int i=0; i<N-1; i++)
        cout<<arr[i]<<" ";
    cout<<arr[N-1];
    delete []arr;
    return 0;
}