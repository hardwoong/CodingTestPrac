#include <iostream>
using namespace std;

int main()
{
    int N, M;
    cin>>N>>M;
    int *arr = new int[N];
    int a,b;
    int idx;
    for(int i=0; i<M; i++)
    {
        cin>>a>>b>>idx;
        while(a<=b)
        {
            arr[a-1]=idx;
            a++;
        }
    }
    for(int i=0; i<N; i++)
        cout<<arr[i]<<" ";
    return 0;
}