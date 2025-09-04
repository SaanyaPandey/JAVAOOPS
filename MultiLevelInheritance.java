package JAVAOOPS;
/*This code shows you how to apply the concept of MULTILEVEL INHERITANCE in JAVA. */
class Person{
  public void printperson(String name){
    System.out.println("This is a person with the name: "+ name);
  }
}
class personAge extends Person{
  public void printage(int age){
    System.out.println("The age of this person is:" + age);
  }
}
class personProffession extends personAge{
  public void printProffession(String Proffession){
    System.out.println("This person is a "+ Proffession + " by proffession");
  }
}
class personSatisfied extends personProffession{
  public void personSatisfy(String satisfy){
    System.out.print("Is this person satisfied from his job?  "+ satisfy);
  }
}
public class MultiLevelInheritance {
  public static void main(String[] args){
    personSatisfied P1 = new personSatisfied();
    P1.printperson("Raman");
    P1.printage(29);
    P1.printProffession("Doctor");
    P1.personSatisfy("Yes");
  }
}
