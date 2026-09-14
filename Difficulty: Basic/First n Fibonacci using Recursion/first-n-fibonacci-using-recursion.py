class Solution:
    def fibonacciNumbers(self, n: int) -> list[int]:
        a,b=0,1
        ans=[]
        for _ in range(n):
            ans.append(a);
            a,b=b,a+b
            
        return ans    
        