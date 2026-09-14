class Solution:
    def powerSet(self, s):
       #code here
       result=[]
       def pattern(index,current):
           
            if index==len(s):
               result.append(current)
               return
            pattern(index+1,current)
        pattern(index+1,current+s[index])
            
        
        pattern(0,"")
        return result
        
        
       