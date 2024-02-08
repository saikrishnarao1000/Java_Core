package SomeSamples;

public class PallendromeCheck {
    public boolean checkPallendrome(int num1){
        String s1=num1+"";
        if (s1.length()==1)
            return true;
        for(int i=0;i<s1.length()/2;i++)
            if(s1.charAt(i) !=  s1.charAt(s1.length()-1-i))
                return false;
        return true;
    }
}
