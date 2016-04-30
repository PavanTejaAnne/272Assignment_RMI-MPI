
import java.rmi.server.*;


public class Square extends UnicastRemoteObject implements SquareInt
{

    public Square() throws Exception
    {
        super();
    }

    public long square(int x) throws Exception
    {
	return x*x;
    }
}