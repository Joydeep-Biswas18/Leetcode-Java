class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
     int n = nums.size();
        int l =0;
        int r =0;
        vector<int> ans(n-k+1);
        int index =0;
        deque<int> dq;
        while(r<n){
            while(!dq.empty() && nums[dq.back()]<= nums[r]){
                dq.pop_back();
            }

            dq.push_back(r);
            
            while(!dq.empty() && dq.front()<l){
                dq.pop_front();
            }

            if(r-l+1 == k){
                ans[index++] = nums[dq.front()];
                l++;
            }
            r++;
        }
        return ans;
    }
};