import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Select extends Remote{

	public String users() throws RemoteException;



	public String reverse(String str) throws RemoteException;



	public String enc(String str) throws RemoteException;



	public String del(String str) throws RemoteException;



	public String conc(String str, String strr) throws RemoteException;


	
	
}
