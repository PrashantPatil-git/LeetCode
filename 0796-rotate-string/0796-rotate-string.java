class Solution {
    public boolean rotateString(String s, String goal) {
        if(s==null && goal==null){
        return false;
        }
        else if(s.length()!=goal.length())
        {
            return false;
        }
        else{
            String concatenated= s+s;
            return concatenated.contains(goal);
        }


    }
}