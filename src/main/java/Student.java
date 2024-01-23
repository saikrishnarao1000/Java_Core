public class Student{
    private String Name;

    public void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return this.Name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Manoj Pusala");
        System.out.println(student.getName());
    }
}