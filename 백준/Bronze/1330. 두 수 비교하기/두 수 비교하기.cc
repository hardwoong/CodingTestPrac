#include <iostream>
using namespace std;

int main(void)
{
    long long a, b;
    cin>>a; cin>>b;
    if(a>b)
        cout<<">"<<endl;
    else if(a<b)
        cout<<"<"<<endl;
    else
        cout<<"=="<<endl;
    return 0;
}