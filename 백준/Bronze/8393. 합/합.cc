#include <iostream>
using namespace std;

int main()
{
    long long num = 0;
    cin>>num;

    long long sum=0;
    for(int i=0; i<=num; i++)
    {
      sum+=i;
    }
    cout<<sum<<endl;
    return 0;
}