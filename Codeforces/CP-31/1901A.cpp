#include<bits/stdc++.h>
using namespace std;
 
const int MOD = 1e9 + 7;

int32_t main(){
    ios::sync_with_stdio(0);
    cin.tie(0);cout.tie(0);
    //code here
    
    int t, n, x;
    cin >> t;
    
    while(t--) {
        vector<int> v;
        cin >> n >> x;
        for(int i = 0; i < n; i++) {
            int num;
            cin >> num;
            v.push_back(num);
        }
        
        int max_between = v[0];
        
        for(int i = 0; i < v.size() - 1; i++) {
            max_between = max(max_between, v[i + 1] - v[i]);
        }
        
        int max_overlapping = 2 * (x - v[n - 1]);
        
        cout << max(max_between, max_overlapping) << "\n";
        
    }
    
    
    //code here
    return 0;
}
