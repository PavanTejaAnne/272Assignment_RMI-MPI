import java.rmi.*;
import java.rmi.registry.*;

public class Client {

    public static void main(String[] args) throws Exception {
	
        try {
	    SquareInt s = (SquareInt) Naming.lookup("Power");
	    for(int i = 0; i < 10; i++)
		System.out.println("Square (" + i + ") = " + s.square(i));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}