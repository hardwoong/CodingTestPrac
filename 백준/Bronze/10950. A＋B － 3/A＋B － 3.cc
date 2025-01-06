#include <iostream>
using namespace std;

int main()
{
    int num = 0;
    cin>>num;

    int a,b=0;
    for(int i=0; i<num; i++)
    {
        cin>>a>>b;
        cout<<a+b<<endl;
    }
    return 0;
}