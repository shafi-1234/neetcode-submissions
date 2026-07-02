class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        d={}
        e={}

        for i in range (len(s)):
            d[s[i]]=d.get(s[i],0)+1
            e[t[i]]=e.get(t[i],0)+1
        return d==e
