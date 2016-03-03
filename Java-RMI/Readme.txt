I have hard coded the servers ip address as 10.234.136.55

The Server has to be placed in in-csci-rrpc02.cs.iupui.edu
10.234.136.55

Server Side:
To Compile and run the server
Current directory must be /ThalluriA3/Source/Server/
give the following command to compile and run the code

./Makefileserver.sh

Client Side:
The client can be deployed onto any of the machines provided in
the list:
in-csci-rrpc02.cs.iupui.edu 10.234.136.56
in-csci-rrpc03.cs.iupui.edu 10.234.136.57
in-csci-rrpc04.cs.iupui.edu 10.234.136.58
in-csci-rrpc05.cs.iupui.edu 10.234.136.59
in-csci-rrpc06.cs.iupui.edu 10.234.136.60

To Compile and run the server
Current directory must be /ThalluriA3/Source/Client/ give the following command
give the following command to compile and run the code 

./Makefileclient.sh

The file required to be deleted by the client has to be present in the directory

/ThalluriA3/Source/Server/

Please give sufficient access privileges to both the client files
and the server files by using

In the Client Folder
please run
chmod 777 *.*
chmod 777 *

In the Server Folder
please run
chmod 777 *.*
chmod 777 *