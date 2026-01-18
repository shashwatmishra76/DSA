#include<bits/stdc++.h>
using namespace std;
 
const int MOD = 1e9 + 7;

int32_t main(){
    ios::sync_with_stdio(0);
    cin.tie(0);cout.tie(0);
    //code here
    
    int t, n;
    string s;
    cin >> t;
    
    while(t--) {
        cin >> n;
        cin >> s;
        
        int max_dot_strech = 0, current_dot_strech = 0, empty_cells = 0;
        
        for(int i = 0; i < s.size(); i++) {
            if(s[i] == '#') {
                current_dot_strech = 0;
                continue;
            } else {
                current_dot_strech += 1;
                empty_cells += 1;
                max_dot_strech = max(current_dot_strech, max_dot_strech);
            }
        }
        
        if(max_dot_strech >= 3) {
            cout << 2 << "\n";
        } else {
            cout << empty_cells << "\n";
        }
        
    }
    
    
    //code here
    return 0;
}
