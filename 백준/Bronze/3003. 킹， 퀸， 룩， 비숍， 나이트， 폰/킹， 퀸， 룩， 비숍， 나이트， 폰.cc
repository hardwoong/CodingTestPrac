#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    int origin[6] = {1, 1, 2, 2, 2, 8};
    int arr[6] = {};
    for(int i=0; i<6; i++)
    {
        cin>>arr[i];
    }
    for(int i=0; i<5; i++)
    {
        cout<<(int)origin[i]-(int)arr[i]<<" ";
    }
    cout<<(int)origin[5]-(int)arr[5];


    return 0;
}
