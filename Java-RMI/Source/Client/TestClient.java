import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestClient {
	public static void main(String[] args) throws NotBoundException, IOException
	{
	String str;
	String strr;
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));//Reads the Input
	Registry registry = LocateRegistry.getRegistry("10.234.136.55",9212);
        /* Client accesses the registry using the Servers IP address and Port number */
	Select sel = (Select) registry.lookup("TestRMI");
	System.out.println("Please enter a selection from the following");
	System.out.println("1.User 2.Reverse 3.Encrypt 4.Delete 5.Concatenation"); 
	try
	{
	int a = Integer.parseInt(inp.readLine());
        /* Reads the user input by a line and parses it into an integer*/
	switch (a) //This Statement enables the user to select only a single option
	{
	case 1: System.out.println(sel.users()) ;
            /*Prints the number of users logged onto the client the "sel.users()"
             accesses the method present in the server*/
    break;
	case 2:
		System.out.println("Enter the string: ");//Prompts the user to enter the string
		str = inp.readLine();
		System.out.println(sel.reverse(str));
            /* This takes the user input and passes it as an argument to the reverse method */
    break;
	case 3:
		System.out.println("Enter the string: ");
		str = inp.readLine();
		System.out.println(sel.enc(str));
            /* Calls the enc method which Encrypts the string at the server side */
    break;
	case 4:
		System.out.println("Enter the File Name: ");
		str = inp.readLine();
		System.out.println(sel.del(str));
            /* Takes the user input and passes it as an argument to del method for filedeletion */
    break;
	case 5:
		System.out.println("Enter the First String: ");
		str = inp.readLine();
		System.out.println("Enter the Second String: ");
		strr = inp.readLine();
		System.out.println(sel.conc(str,strr));
            /* Takes two inputs from the user and passes them as arguments to the conc method which 
             concatenates two strings*/
    break;
	default: System.out.println("Invalid Input");
    break;
	}
	}
	catch(Exception e)
	{
		System.out.println("Invalid input Entered");
	}

	}
}
