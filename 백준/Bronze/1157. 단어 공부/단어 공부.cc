#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    string s;
    cin>>s;

    int arr[26];
    int max = -1;
    int num=0;
    int cnt=0;
    for(int i=0; i<26; i++)
        arr[i]=0;
    for(int i=0; i<s.length(); i++)
    {
        if(96<(int)s[i]&&(int)s[i]<123)
        {
            arr[(int)s[i]-97]++;
            if(max<arr[(int)s[i]-97]) max = arr[(int)s[i]-97];
        }
        else
        {
            arr[(int)s[i]-65]++;
            if(max<arr[(int)s[i]-65]) max = arr[(int)s[i]-65];
        }
    }
    for(int i=0; i<26; i++)
    {
        if(max==arr[i])
        {
            num=i;
            cnt++;
        }
    }
    num+=65;
    if(cnt>1) num=63;
    cout<<(char)num<<endl;


    return 0;
}
