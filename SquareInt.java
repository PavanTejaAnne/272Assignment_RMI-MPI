import java.rmi.*;

public interface SquareInt extends Remote
    {
    public long square(int i) throws Exception;
}