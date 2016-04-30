import java.rmi.*;

public class Server
{
    public static void main(String[] args) throws Exception{
	
	try {
	    Square s = new Square();
	    Naming.rebind("Power", s);
	    System.out.println("Computing Squares");
	} catch(Exception e) {
	    e.printStackTrace();
	}
    }
}