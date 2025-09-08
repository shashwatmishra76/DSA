class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> result;

        addToVector(nums, result);
        addToVector(nums, result);

        return result;
    }

    void addToVector(vector<int> source, vector<int> &destination) {
        for(int num : source) {
            destination.push_back(num);
        }
    }
};