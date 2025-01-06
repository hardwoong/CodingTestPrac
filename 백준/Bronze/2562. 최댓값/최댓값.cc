#include <iostream>
using namespace std;

int main()
{
    int arr[9];
    for(int i=0; i<9; i++)
    {
        cin>>arr[i];
    }
    int max = 0;
    int n;

    for(int j=0; j<9; j++)
    {
        if(max<arr[j])
        {
            max = arr[j];
            n = j+1;
        }
    }


    cout<<max<<endl;
    cout<<n<<endl;
    return 0;
}