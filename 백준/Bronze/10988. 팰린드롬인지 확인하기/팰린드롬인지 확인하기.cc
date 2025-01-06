#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    string s;
    cin>>s;

    bool p = true;
    for(int i=0; i<=s.length(); i++)
    {
        if(s[i]!=s[s.length()-i-1]) p=false;
    }

    cout<<p<<endl;

    return 0;
}
