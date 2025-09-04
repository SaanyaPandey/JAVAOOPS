class Employee{
  public void employeeName(String name){
    System.out.println("The name of this employee is: "+ name);
  }
}
class Age extends Employee{
  public void employeeAge(int age){
    System.out.println("The age of this employee is: "+ age);
  }
}
class salary extends Employee{
  public void employeeSalary(float salary){
    System.out.println("The salary of the employee is: "+ salary);
  }
}
public class HeirarchicalInheritance{
  public static void main(String[] args){
    Age a1 = new Age();
    a1.employeeName("Rohit");
    a1.employeeAge(30);
    salary s1 = new salary();
    s1.employeeName("Rahul");
    s1.employeeSalary(60000.00f);
  }
}

