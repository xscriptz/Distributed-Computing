import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteImp extends UnicastRemoteObject implements Select{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /* This assigns a version number to serializable class */

	protected RemoteImp() throws RemoteException {
		super();
	}
    public static void main(String args[]) throws RemoteException,AlreadyBoundException
    {
        RemoteImp rmp = new RemoteImp();
        Registry registry = LocateRegistry.createRegistry(9212);
        /* Server creates a registry registering its services onto the registry */
        registry.bind("TestRMI", rmp);
        /* This binds the name to the registry */
        System.out.println("Server started");
    }

	
	@Override
	public synchronized String users() throws RemoteException {
		StringBuffer sbf = new StringBuffer();/* creates a StringBuffer object to access its methods */
		String read = "";
		Process proc;
				try 
				{
					proc = Runtime.getRuntime().exec("who");
                    /* This runs the who command and takes its output and copies to the programs stdout */
					proc.waitFor();
					BufferedReader bfr = new BufferedReader(new InputStreamReader(proc.getInputStream()));
					while ((read = bfr.readLine())!= null) 
					{
						sbf.append(read + "\n");
                        /* It appends multiple lines putting them on new lines */
					}

				} catch (Exception e) 
				{
				
					e.printStackTrace();
                    /* Prints out any exceptions that occur*/
				}

				return sbf.toString();
	}
	@Override
	public synchronized String reverse(String inp) throws RemoteException
	{
		StringBuilder sb = new StringBuilder(inp);
        /* Creates an object of StringBuilder passing the string argument from the client as an input */
		String rev = sb.reverse().toString();
        /* reverses the string */
		return rev;
		
	}
	@Override
	public synchronized String enc(String inp) throws RemoteException
	{
		String temp = "";
		        for(int i = 0; i < inp.length(); i++)
		        {
		            int a = inp.charAt(i);
                    /* selects the character at position i */
		            if (Character.isUpperCase(a)) //checks if character is an uppercase one or not
		            {
		                a = a + (1 % 26);
		                if (a > 'Z')
		                {
		                a = a - 26;
		                }
		            }
		            else if (Character.isLowerCase(a)) //checks if character is a lowercase one or not
		            {
		                a = a + (1 % 26);
		                if (a > 'z')
		                {
		                a = a - 26;
		                }
		            }
		            else if ((Character.isDigit(a))) //checks if character is a digit or not
		            {
		            	a = a + 1;
		            }
		            temp += (char) a;
		        }
		    return temp;
	}


	@Override
	public String del(String inp) throws RemoteException 
	{
		String str;
		File f = new File(inp);//creates a File object taking the filename as na input
		if(f.delete())//checks if the file is deletable and deletes the file
		{
			str = "Deletion successful!";
			return str;
		}
		else
		{
			str = "Deletion Failed!";
			return str;
		}
	}


	@Override
	public synchronized String conc(String str, String strr)
	{
		String temp = str + strr;//concatenation of two strings
		return temp;
	}
	
	
	

}
