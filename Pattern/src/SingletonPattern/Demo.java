package SingletonPattern;

public class Demo {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();
		
		singleObject.showMessage();

	}

}
