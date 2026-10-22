class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // here the mainconcept is breaking existing array in two half and compare target Char with mid elelment of the letters array
        //at frist assign low as 0 indx
        int low = 0;
        // and assign high as the last index
        int high = letters.length - 1;
        // here ask about the smallest character in letters that is lexigraphically greater than target char
        // so i save the result in the form of ans char and update the high below mid 
        char ans = letters[low];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < letters[mid]) {
                ans = letters[mid];
                // that is check further smallest element is present or not
                high = mid - 1;
                // reduce the array and go to the left half
            } else {
                low = mid + 1;
                // go to the right half
            }
        }
        // at last return the ans that is update in every time when it find smallest elelment that is lexigraphically greater than target char
        return ans;

    }
}