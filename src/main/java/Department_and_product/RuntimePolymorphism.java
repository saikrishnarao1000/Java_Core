class Parent{
    public String printFun(){
        return "this is a parent class ";
    }
}

class Child extends Parent{
    @Override
    public String printFun(){
        return "This is a child class";
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.printFun());

        Child child = new Child();
        System.out.println(child.printFun());

        Parent p =  new Child();
        System.out.println(p.printFun());

        Child c = (Child) new Parent();
        //if we didn't cast this one it is showing compile time error
        System.out.println(c.printFun());
        //even though we type cast also parent class cannnot be typecasted to child class so we will get a runtime error
    }
}
