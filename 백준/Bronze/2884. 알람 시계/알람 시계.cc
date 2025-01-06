#include <iostream>
using namespace std;

int main()
{
    int h, m;
    cin>>h; cin>>m;
    
    int mm = m - 45;
    if(mm<0)
    {
        h--;
        if(h<0) h+=24;
        mm+=60;
    }

    cout<<h<<" "<<mm<<endl;

    return 0;
}
