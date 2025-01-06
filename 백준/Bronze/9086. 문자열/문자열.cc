#include <iostream>
#include <cstring>

using namespace std;

int main()
{
    string s;
    int num;
    cin>>num;
    for(int i=0; i<num; i++)
    {
        cin>>s;
        cout<<s[0]<<s[s.length()-1]<<endl;
    }

    return 0;
}