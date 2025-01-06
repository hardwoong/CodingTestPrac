#include <iostream>
using namespace std;
// Case #1: 1 + 1 = 2
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int num;
    cin>>num;
    int a,b;
    for(int i=0; i<num; i++)
    {
        cin>>a>>b;
        cout<<"Case #"<<i+1<<": "<<a<<" + "<<b<<" = "<<a+b<<"\n";
    }
    return 0;
}