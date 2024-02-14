public class Pattern {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=0;j<6;j++){
                if(j<4 && j<i-1)
                    System.out.print("+");
                else
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
