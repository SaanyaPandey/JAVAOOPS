/*This code shows you SINGLE INHERITANCE in OOPS in JAVA. */


package JAVAOOPS;
class Animal{
  public void name(String n){
    System.out.println("The name of the animal is: "+ n);
  }
  public void AnimalWalk(int feet){
    System.out.println("This animal walks on "+ feet + " feet");
  }
}
class AnimalEats extends Animal{
  public void animalEats(String food){
    System.out.println("This animal eats:"+ food);
  }
}
class Species extends AnimalEats{
  public void AnimalSpecies(String spcs){
    System.out.println("This animal is: "+ spcs);
  }
}
public class singleinheritance{
  public static void main(String[] args){
    Species S1 = new Species();
    S1.name("Cow");
    S1.AnimalWalk(4);
    S1.animalEats("Plant Food");
    S1.AnimalSpecies("Herbivores");
  }
}

