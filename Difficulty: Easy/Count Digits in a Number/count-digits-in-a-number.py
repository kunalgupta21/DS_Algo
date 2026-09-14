class Solution:
    def countDigits(self, n):
        # code here
        a=0
        while n>0:
            n=n//10
            a+=1
        return a    
