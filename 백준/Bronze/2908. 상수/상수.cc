#include <iostream>
#include <string>

using namespace std;

int main() {
    string s1, s2;
    cin>>s1>>s2;

    string r1 = s1, r2 = s2;
    char temp = r1[0];
    r1[0] = r1[2];
    r1[2] = temp;
    temp = r2[0];
    r2[0] = r2[2];
    r2[2] = temp;

    int a = stoi(r1);
    int b = stoi(r2);
    if(a>=b) cout<<a;
    else cout<<b;

    return 0;
}