class Solution {
    public boolean detectCapitalUse(String s) {

        int capcnt=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch))capcnt++;
        }

        if(capcnt==0|| capcnt==s.length() || (capcnt==1 && Character.isUpperCase(s.charAt(0))))return true;
        return false;
        
    }
}