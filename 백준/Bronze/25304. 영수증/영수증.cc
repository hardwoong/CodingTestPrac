#include <iostream>
using namespace std;

int main()
{
    long long x, a;
    int n ,b;
    int sum = 0;

    cin>>x;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a>>b;
        sum += a*b;
    }
    if(x==sum) cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
    return 0;
}