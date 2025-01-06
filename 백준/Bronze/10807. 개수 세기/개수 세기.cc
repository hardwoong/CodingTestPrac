#include <iostream>
using namespace std;

int main()
{
    int num;
    cin>>num;
    int arr[num];
    for(int i=0; i<num; i++)
    {
        cin>>arr[i];
    }
    int f;
    int cnt=0;
    cin>>f;
    for(int j=0; j<num; j++)
    {
        if(arr[j]==f) cnt++;
    }
    cout<<cnt<<endl;
    return 0;
}