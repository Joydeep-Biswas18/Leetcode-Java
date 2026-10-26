class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merge = merge_array(nums1,nums2);
        int n = merge.length;
        if(n%2==1){
            return(double) merge[n/2];

        }
        else{
            return(double) (merge[n/2] + merge[n/2-1])/2;
        }
        
    }
    public static int[] merge_array(int[]nums1 ,int[]nums2){
        int m = nums1.length;
        int n = nums2.length;
        int i =0;
        int j =0;
        int k=0;
        int [] merge = new int[n+m];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++]= nums1[i];
                i++;
            }
            else{
                merge[k++] = nums2[j];
                j++;
            }
        }
        while(i<m){
            merge[k++]= nums1[i];
            i++;
            
        }
        while(j<n){
            merge[k++]= nums2[j];
            j++;

        }
        return merge;
    }
}