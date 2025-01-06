#include <iostream>

using namespace std;

int main() {
    int a, b;
    cin>>a>>b;
    int arr1[a][b];
    for(int i=0; i<a; i++)
    {
        for(int j=0; j<b; j++)
        {
            cin>>arr1[i][j];
        }
    }
    int arr2[a][b];
    for(int i=0; i<a; i++)
    {
        for(int j=0; j<b; j++)
        {
            cin>>arr2[i][j];
        }
    }
    for(int i=0; i<a; i++)
    {
        for(int j=0; j<b; j++)
        {
            cout<< arr1[i][j] + arr2[i][j]<< " ";
        }
        cout<<"\n";
    }


    


    return 0;
}