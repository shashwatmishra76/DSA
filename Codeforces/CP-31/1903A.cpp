#include<bits/stdc++.h>
using namespace std;
 
#define int long long

const int MOD = 1e9 + 7;

int32_t main(){
    ios::sync_with_stdio(0);
    cin.tie(0);cout.tie(0);
    //code here
    
    int t, n, k;
    cin >> t;
    
    while(t--) {
        vector<int> v;
        cin >> n >> k;
        for(int i = 0; i < n; i++) {
            int x;
            cin >> x;
            v.push_back(x);
        }
        
        if(is_sorted(v.begin(), v.end()) || k > 1) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    
    
    //code here
    return 0;
}
