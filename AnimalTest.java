//강아지와고양이를나타내는클래스를작성하자. 
//이들클래스의부모클래스로Animal클래스를정의한다. 
//강아지와고양이클래스의sound() 메소드를호출하면각동물들의소리가출력되도록프로그램을작성해보자.
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal.sound(); //Animal 클래스의 sound()
		dog.sound(); //멍멍
		cat.sound(); //야옹
	}

}
