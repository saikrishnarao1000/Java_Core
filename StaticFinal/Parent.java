class Parent {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

    class Child1 extends Parent {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    class Child2 extends Parent {

        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }


     class Main4 {
        public static void main(String[] args) {

            Parent a = new Child1();
            a.sound();
            Parent b = new Child2();
            b.sound();
        }
    }


