public class Employee extends Person {
    int EmployeeID;
    double Salary;

    public Employee(int age, String name) {
        super(age, name);
      
    }
    public String toString() {
        return age + " " + name+" "+EmployeeID+" " +Salary ;
    }
    public static void main(String[] args) {
        Employee em1=new Employee(18, "Krishnan");
        em1.EmployeeID=216165;
        em1.Salary=50000;
        System.out.println(em1);
    }
    
}
