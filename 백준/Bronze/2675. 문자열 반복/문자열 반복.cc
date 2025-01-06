#include <iostream>

using namespace std;

int main()
{
    int T;
    cin>>T;
    string s;
    for(int i=0; i<T; i++)
    {
        int num;
        cin>>num>>s;
        for(int j=0; j<s.length(); j++)
        {
            for(int k=0; k<num; k++)
            {
                cout<<s[j];
            }
        }
        cout<<"\n";
    }

    return 0;
}