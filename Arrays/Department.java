public abstract class Department {

    public abstract int getDepartmentSize();
}
class Measurements extends Department{
    int departmentSize;

    public void ForDepartment(int size)
    {

        this.departmentSize = size;
    }
    public int getDepartmentSize() {
        System.out.println(+departmentSize);


        return departmentSize;
    }
}
class Main1 {
    public static void main(String[] args)
    {
        Measurements measurements = new Measurements();
        measurements.departmentSize=20;
        System.out.println("gg"+measurements.departmentSize);
        //measurements.ForDepartment(10);
        measurements.getDepartmentSize();

    }
}

