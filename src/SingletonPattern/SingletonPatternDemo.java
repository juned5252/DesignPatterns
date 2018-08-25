package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	     
		SingleObject object1 = SingleObject.getInstance();
		
		SingleObject object2 = SingleObject.getInstance();
		
        System.out.println("object1 HashCode: " + (System.identityHashCode(object1)));
		
		System.out.println("object2 HashCode: " + (System.identityHashCode(object2)));

	      //show the message
	      object1.showMessage();
	      object2.showMessage();
		
	}

}
