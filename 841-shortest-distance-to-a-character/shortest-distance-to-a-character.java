class Solution {
    public int[] shortestToChar(String s, char c) {
        int a[]=new int[s.length()];
        int k=-s.length();
        for(int i=0;i<a.length;i++){
            if(s.charAt(i)==c)
                k=i;
            a[i]=Math.abs(i-k);
        }
        for(int i=k-1;i>=0;i--){
            if(s.charAt(i)==c)
                k=i;
            a[i]=Math.min(a[i],k-i);
        }
        return a;
    }
}