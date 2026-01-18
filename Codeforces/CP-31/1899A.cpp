#include<bits/stdc++.h>
using namespace std;
 
const int MOD = 1e9 + 7;

int32_t main(){
    ios::sync_with_stdio(0);
    cin.tie(0);cout.tie(0);
    //code here
    int t;
    cin >> t;
    
    while(t--) {
        int n;
        cin >> n;
        
        if((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
            cout << "First" << "\n";
            continue;
        } else {
            cout << "Second" << "\n";
            continue;
        }
    }
    
    //code here
    return 0;
}
