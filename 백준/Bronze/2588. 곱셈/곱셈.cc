#include <iostream>
using namespace std;

int main()
{
    int a, b;
    cin>>a;
    cin>>b;

    cout<<a*(b%10)<<endl;
    cout<<(((b%100-b%10))/10)*a<<endl;
    cout<<(((b-b%100))/100)*a<<endl;
    cout<<a*b<<endl;
    return 0;
}