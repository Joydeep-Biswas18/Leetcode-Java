class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        // same problem as Assign Cookies Leetcode 455
        int pointer1 =0;
        //pointer of players array
        int pointer2 =0;
        // pointer of trainers array
        int count =0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        while(pointer1 < players.length && pointer2 < trainers.length){
            if(players[pointer1]<=trainers[pointer2]){
                count ++;
                pointer1++;
                pointer2++;
            }
            else{
                pointer2++;
            }
        }
        return count;
    }
}