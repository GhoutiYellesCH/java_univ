class Animal {
	void eat() {
		System.out.println("I am eating ...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("I am barking ... ");
	}
}

class BabyDog extends Dog {
	public void weep() {
		System.out.println("I am weeping ... ");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();
	}
}
