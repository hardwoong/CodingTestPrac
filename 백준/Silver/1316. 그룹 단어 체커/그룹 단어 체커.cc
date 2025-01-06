#include <iostream>
using namespace std;

int main() {
    int num;
    cin>>num;
    string s;
    int cnt=0;
    for(int i=0; i<num; i++)
    {
        cin>>s;
        bool arr[26] = {false, };
        arr[(int)s[0]-97] = true;
        for(int i=1; i<s.length(); i++)
        {
            if(s[i] == s[i-1])
            {
                continue;
            }
            else if(s[i] != s[i-1] && arr[(int)s[i]-97] == true)
            {
                cnt++;
                break;
            }
            else
            {
                arr[(int)s[i]-97] = true;
            }
        }
    }

    cout<<num-cnt;

	return 0;
}