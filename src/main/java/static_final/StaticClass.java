package static_final;

class StaticClass{
    static int var;

    static int varFunction(){
        return 10;
    }

    int varTestingFinal(){
        FinalClass finalClass = new FinalClass();
        return finalClass.varFunction();
    }
}