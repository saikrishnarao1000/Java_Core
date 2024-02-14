package UnNecessary;

public class Code2 {
    public int countOperations(String s){
        s=s.replaceFirst("^0+","");
        int op=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')
                op+=2;
            else
                op++;
        }
        return --op;
    }
}
