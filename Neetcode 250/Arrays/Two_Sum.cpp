class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> um;
        vector<int> indices;
        for(int i = 0; i < nums.size(); i++) {
            if(um.find(target - nums[i]) != um.end()) {
                indices.push_back(um[target - nums[i]]);
                indices.push_back(i);
                return indices;
            }
            um.insert({nums[i], i});
        }

        return indices;
    }
};
