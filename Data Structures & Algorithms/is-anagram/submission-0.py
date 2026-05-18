class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a,b=0,0
        if(len(s)==len(t)):
            a=sorted(s)
            b=sorted(t)
            if(a==b):
                return True
        return False
        
