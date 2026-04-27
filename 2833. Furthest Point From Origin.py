class Solution(object):
    def furthestDistanceFromOrigin(self, moves):
        """
        :type moves: str
        :rtype: int
        """
        r =0
        l=0
        sp=0
        fin=0
        for i in moves:
            if i == 'R':
                r=r+1
            elif i == 'L':
                l=l+1
            else:
                sp=sp+1
        if r>l:
            fin =r-l
            fin=fin+sp
        else:
            fin=l-r
            fin=fin+sp
        return fin





        