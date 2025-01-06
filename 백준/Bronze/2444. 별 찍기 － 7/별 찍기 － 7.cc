#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    int num;
    cin>>num;

    for(int i=0; i<num; i++)
    {
        for(int j=num-i-1; j>0; j--)
            cout<<" ";
        for(int k=0; k<i+1; k++)
            cout<<"*";
        for(int a=0; a<i; a++)
            cout<<"*";
        cout<<endl;
    }
    for(int i=num; i>0; i--)
    {
        for(int j=0; j<num-i+1; j++)
            cout<<" ";
        for(int k=i-1; k>0; k--)
            cout<<"*";
        for(int a=i-2; a>0; a--)
            cout<<"*";
        cout<<endl;
    }

    return 0;
}

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *