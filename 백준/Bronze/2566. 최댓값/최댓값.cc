#include <iostream>

using namespace std;

int main() {
    int arr[9][9];
    for(int i=0; i<9; i++)
    {
        for(int j=0; j<9; j++)
        {
            cin>>arr[i][j];
        }
    }
    int max = -1;
    int a, b;
    for(int i=0; i<9; i++)
    {
        for(int j=0; j<9; j++)
        {
            if(max<arr[i][j])
            {
                max = arr[i][j];
                a=i+1; b=j+1;
            }
        }
    }
    cout<<max<<endl;
    cout<<a<<" "<<b<<endl;    

    return 0;
}