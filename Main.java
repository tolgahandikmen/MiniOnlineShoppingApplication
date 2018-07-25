
public class Main {
	public static void main(String[] args) {
		
		ReadFile read = new ReadFile();
		Person person[]=read.readFileUsers(args[0],args[2]);	/*arg[0]=users.txt, arg[1]=item.txt, arg[2]=commands.txt */  
		Items[] items=read.readFileItems(args[1],args[2]);

		read.readFileCommands(args[2],person,items);

	}
}
