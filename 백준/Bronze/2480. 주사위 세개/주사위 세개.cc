#include <iostream>
using namespace std;
#define MAX(a, b) (a>b)?a:b

int main()
{
    int a,b,c;
    cin>>a>>b>>c;

    if(a==b && a!=c)
        cout<<1000+a*100<<endl;
    else if(a==c && a!=b)
        cout<<1000+a*100<<endl;
    else if(b==c && b!=a)
        cout<<1000+b*100<<endl;
    else if(a==b && b==c)
        cout<<10000+a*1000<<endl;
    else
    {
        int m = MAX(a, b);
        m = MAX(m, c);
        cout<<100*m<<endl;
    }

    return 0;
}
