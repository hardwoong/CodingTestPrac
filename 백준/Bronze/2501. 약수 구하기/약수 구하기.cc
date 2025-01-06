#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin>>a>>b;
    int arr[10000] = { 10000 };
    int n=0, cnt=0;
    for(int i=1; i<10000; i++)
    {
        if(i>a) break;
        if(a%i==0) {
            cnt++;
            arr[n++] = i;
        }
    }
    if(cnt<b) cout<<"0"<<endl;
    else cout<<arr[b-1]<<endl;

    return 0;
}