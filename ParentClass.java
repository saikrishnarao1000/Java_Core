public class ParentClass {


    protected int parentVariable;

      public ParentClass(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

class ChildClass extends ParentClass {

    // Instance variable in the child class
    private int childVariable;

       public ChildClass(int parentVariable, int childVariable) {

        super(parentVariable);

        this.childVariable = childVariable;
    }


    public ChildClass(int childVariable) {

        super(0);

        this.childVariable = childVariable;
    }


    public int getParentVariable() {
        return parentVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }

    public static void main(String[] args) {

        ChildClass childInstance1 = new ChildClass(5, 10);
        System.out.println("Parent Variable: " + childInstance1.getParentVariable());
        System.out.println("Child Variable: " + childInstance1.getChildVariable());


        ChildClass childInstance2 = new ChildClass(20);
        System.out.println("Parent Variable: " + childInstance2.getParentVariable());
        System.out.println("Child Variable: " + childInstance2.getChildVariable());
    }
}

