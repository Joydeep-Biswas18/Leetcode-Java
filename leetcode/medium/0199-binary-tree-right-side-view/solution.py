# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: TreeNode | None) -> list[int]:
        ds = []
        self.rightSideViewFunc(root, 0, ds)
        return ds

    def rightSideViewFunc(
        self, root: TreeNode | None, level: int, ds: list[int]
    ) -> None:

        if root is None:
            return

        if level == len(ds):
            ds.append(root.val)

        self.rightSideViewFunc(root.right, level + 1, ds)
        self.rightSideViewFunc(root.left, level + 1, ds)
