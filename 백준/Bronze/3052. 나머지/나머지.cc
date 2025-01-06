#include <iostream>
using namespace std;

int main()
{
    int arr[10];
    int cnt = 10;
    for(int i=0; i<10; i++)
        cin>>arr[i];
    for(int i=0; i<10; i++)
    {
        for(int j=i+1; j<10; j++)
        {
            if(arr[i]%42==arr[j]%42)
            {
                cnt--;
                break;
            }
        }
    }

    cout<<cnt<<endl;

    return 0;
}