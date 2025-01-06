#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int num;
    cin>>num;
    int cng;
    for(int i=0; i<num; i++)
    {
        cin>>cng;
        cout<<cng/25<<" "; cng-=25*(cng/25);
        cout<<cng/10<<" "; cng-=10*(cng/10);
        cout<<cng/5<<" "; cng-=5*(cng/5);
        cout<<cng<<endl;;

    }

    return 0;
}