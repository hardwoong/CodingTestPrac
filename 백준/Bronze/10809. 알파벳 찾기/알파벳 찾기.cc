#include <iostream>

using namespace std;

int main()
{
    string s;
    cin>>s;
    int arr[26];
    for(int i=0; i<26; i++)
    {
        arr[i] = -1;
    }
    for(int i=0; i<s.length(); i++)
    {
        if(arr[(int)s[i]-97]==-1)
        {   
            arr[(int)s[i]-97] = i;
        }
    }
    for(int i=0; i<25; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<arr[25];

    return 0;
}