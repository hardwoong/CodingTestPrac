#include <iostream>
using namespace std;

int main()
{
    long int N;
    cin>>N;

    for(N; N>3; N-=4)
    {
        cout<<"long ";
    }
    cout<<"int"<<endl;
    return 0;
}