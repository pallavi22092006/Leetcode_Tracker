// Last updated: 8/11/2026, 2:14:18 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder result=new StringBuilder();
        StringBuilder others=new StringBuilder();
        int xcount=0;
        int ycount=0;
        for(char ch:s.toCharArray()){
            if(ch==y)
                ycount++;
            else if(ch==x)
                xcount++;
            else
                others.append(ch);
        }
        while(ycount-- > 0){
            result.append(y);
        }
        result.append(others);
        while(xcount-- > 0)
            result.append(x);
        return result.toString();
        }
}