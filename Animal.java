//강아지와고양이를나타내는클래스를작성하자. 
//이들클래스의부모클래스로Animal클래스를정의한다. 
//강아지와고양이클래스의sound() 메소드를호출하면각동물들의소리가출력되도록프로그램을작성해보자.
class Animal {
	void sound() {
		System.out.println("Animal 클래스의 sound()");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("야옹");
	}
}