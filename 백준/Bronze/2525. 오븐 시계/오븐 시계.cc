#include <iostream>
using namespace std;

int main()
{
    int h, m, t;
    cin>>h; cin>>m;
    cin>>t;
    m+=t;

    for(m; m>59; )
    {
        m-=60;
        h++;
        if(h>23) h=0;
    }

    cout<<h<<" "<<m<<endl;

    return 0;
}
