



    final class RestrictedClass {


        final int finalVariable = 10;


        final void restrictedMethod() {
            System.out.println("This method can only be accessed within the same class.");
        }
    }

    class MainClass {

        public static void main(String[] args) {

            RestrictedClass restrictedInstance = new RestrictedClass();


            System.out.println("Final Variable: " + restrictedInstance.finalVariable);


            restrictedInstance.restrictedMethod();
        }
    }


