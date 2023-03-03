package java8Feautures;

public class FunctionalInterfaceMain implements FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		FunctionalInterfaceExample fi = new FunctionalInterfaceMain();
        fi.print("tiger");
        System.out.println(FunctionalInterfaceExample.num());
        fi.display();
}

@Override
public void print(String message) {
	System.out.println(message);
	
}

}

//class -> class = extends
//class -> interface = implements
//interface -> interface = extends