class Solution:
    def sequence(self, n: int) -> int:
        MOD = 10**9 + 7
        # code here
        ans=0
        c=1;
        for i in range(n):
            temp=1;
            for j in range(i+1):
                temp=(temp*c)%MOD
                c+=1
            ans=(ans+temp)%MOD
        return ans;    