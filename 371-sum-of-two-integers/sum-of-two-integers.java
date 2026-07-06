class Solution {
    public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        while ( b != 0){
            int c = a & b; // it will give the value of carry
            a = a ^ b; // it will store the xor value of 2 numbers 
            b = c << 1; // carry will be shifted
        }

        /*5+3=8
        0101 (5)
        0011 (3)
        ----------
        0001 (1) carry  &
        ----------
        the carry is shifted left it become 2 

        0101 (5)
        0011 (3)
        --------
        0110 (6)  sum ^
        ---------
         
        till b become 0 it will continue
        getSum(5,3)
        ↓
        getSum(6,2)
        ↓
        getSum(4,4)
        ↓
        getSum(0,8)
        ↓
        getSum(8,0)
        */

        return a;
    }
}