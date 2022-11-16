class Animal
{
	public static void eating() 
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	public static void Bark() 
	{
		System.out.println("Dog is barking & ");
	}
}
public class Inheritance {

	public static void main(String[] args) 
	{
       Dog d = new Dog();
       d.Bark();
       d.eating();

	}

}
