package static_final;

public class Parent_child {
    
}

class Parent{
    Parent_child pc1;

    Parent(Parent_child pc1){
        this.pc1 =  pc1;
    }

    Parent(){

    }
}

class Child extends Parent{
    Parent_child pc2;

    Child(Parent_child pc1,Parent_child pc2){
        super(pc1);
        this.pc2 = pc2;
    }

    Child(Parent_child pc2){
        super(null);
        this.pc2= pc2;
    }

    Child(){
        
    }
}