class Solution:
    def pattern(self, n):
        # code here
        pat=[]
        while True:
            pat.append(n);
            if(n<=0): break
            n-=5;
            
        pat=pat+pat[-2::-1]  
        return pat