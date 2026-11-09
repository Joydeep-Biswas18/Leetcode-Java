
class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int max_fruits = 0;
        int l = 0;
        int r = 0;
        int n = fruits.size();

        map<int, int> oset;

        while (r < n) {

            oset[fruits[r]]++;

            while (oset.size() > 2) {

                oset[fruits[l]]--;

                if (oset[fruits[l]] == 0) {
                    oset.erase(fruits[l]);
                }

                l++;
            }

            max_fruits = max(max_fruits, r - l + 1);
            r++;
        }

        return max_fruits;
    }
};
