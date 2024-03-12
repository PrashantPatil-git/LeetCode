class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int string1 = s.length();
        int string2= t.length();

        if(string1!= string2)
        {
            return false;
        }
         else{
     
          int[] count = new int[26];   
        for(int i=0;i<string1;i++)
        {
            count[s.charAt(i)-'a']++;
        } 

        for(int i=0;i<string2;i++)
        {
            count[t.charAt(i)-'a']--;
        }

        for(int i=0;i<count.length;i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }
         return true;

      }

      

    }  
}