"""
n: int
return: list of int
"""
import math
class Solution:
    def jugglerSequence(self, n):
        # Code here
        ans=[n]
        while n!=1:
            if n%2==0:
                n=math.floor(n**0.5)
            else:
                n=math.floor(n**1.5)
            ans.append(n)    
        return ans