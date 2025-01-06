#include <iostream>
using namespace std;

int main() {
    int n;
    cin>>n;

    int dot = 2;
    while(n--)
    {
        dot = dot * 2 - 1;
    }
    cout<<dot*dot<<endl;

    return 0;
}