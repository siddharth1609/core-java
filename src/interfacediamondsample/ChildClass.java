package interfacediamondsample;

public class ChildClass implements GrandParentInterface {

	@Override
	public void show() {

		System.out.println("Child class");

	}

	public void show() {

		System.out.println("Child class");

	}

	public static void main(String[] args) {
		// ChildClass a = new ChildClass();
		// a.sh

		// GrandParentInterface b =new ChildClass();

		// b.sh

	}

}
