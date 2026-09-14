class Solution:
    def recursivePower(self, n, p):
        # code here
        if p==0:
            return 1;
        return self.recursivePower(n,p-1)*n;
