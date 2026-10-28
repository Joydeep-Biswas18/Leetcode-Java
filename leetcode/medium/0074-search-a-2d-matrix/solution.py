class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        low = 0
        high = m * n -1
        while(low <= high):
            mid = low + (high -low)//2
            if(matrix[mid // n][mid % n] == target):
                return True

            elif ( matrix[mid // n][mid % n]< target):
                low = mid +1
            
            else:
                high = mid -1
            
        return False