public class StacticExample {

    private static int staticVariable = 0;

        public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {
          System.out.println("Static Variable: " + StacticExample.staticVariable);
        System.out.println("Static Method Result: " + StacticExample.getStaticVariable());


        StacticExample.staticVariable = 42;


        System.out.println("Updated Static Variable: " + StacticExample.staticVariable);
        System.out.println("Updated Static Method Result: " + StacticExample.getStaticVariable());
    }
}
