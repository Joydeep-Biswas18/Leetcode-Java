class Solution:
    def findPeakGrid(self, mat: list[list[int]]) -> list[int]:
        m = len(mat)
        n = len(mat[0])
        low =0
        high = n-1
        while(low<=high):
            mid = low + (high -low)//2
            row = self.max_ele_index(mat ,  mid)
            left = mat[row][mid - 1] if mid > 0 else -1
            right = mat[row][mid + 1] if mid < n - 1 else -1
            if(mat[row][mid]> left and mat[row][mid]> right):
                return [row,mid]
            elif(mat[row][mid]< left):
                high = mid -1
            else:
                low = mid +1
        return [-1,-1]

    def max_ele_index(self , mat:list[list[int]], col) -> int:
        maxEle = mat[0][col]
        max_index =0
        for i in range (len(mat)):
            if(mat[i][col]> maxEle):
                maxEle = mat[i][col]
                max_index = i
            
        return max_index
