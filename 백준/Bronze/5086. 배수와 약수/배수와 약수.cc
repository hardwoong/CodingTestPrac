#include <iostream>
using namespace std;

int sibal(int a, int b)
{
    if(a%b==0) return 1;
    else if(b%a==0) return 2;
    else return 3;
}

int main() {
    int a=1, b=1;
    while(1) {
        cin>>a>>b;
        if(a==0 && b==0) break;
        if(sibal(a, b)==1) cout<<"multiple"<<endl;
        else if(sibal(a, b)==2) cout<<"factor"<<endl;
        else if(sibal(a, b)==3) cout<<"neither"<<endl;
    }
    return 0;
}