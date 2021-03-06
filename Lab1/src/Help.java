
public class Help {
	
	public static void Execute(String[] args)
	{
		String arg0 = args.length > 0 ? args[0].toLowerCase() : "";
		switch (arg0)
		{
		case "get":
			System.out.print(HELP_GET);
			break;
		case "post":
			System.out.print(HELP_POST);
			break;
		default:
			System.out.print(HELP);
		}
	}
    
    static String HELP =
		"httpc is a curl-like application but supports HTTP protocol only.\r\n" + 
		"Usage:\r\n" + 
		" httpc command [arguments]\r\n" + 
		"The commands are:\r\n" + 
		" get executes a HTTP GET request and prints the response.\r\n" + 
		" post executes a HTTP POST request and prints the response.\r\n" + 
		" help prints this screen.\r\n" + 
		"Use \"httpc help [command]\" for more information about a command.\r\n";
    
    static String HELP_GET =
    	"usage: httpc get [-v] [-h key:value] URL\r\n" + 
    	"Get executes a HTTP GET request for a given URL.\r\n" + 
    	" -v Prints the detail of the response such as protocol, status,\r\n" + 
    	"and headers.\r\n" + 
    	" -h key:value Associates headers to HTTP Request with the format\r\n" + 
    	"'key:value'.\r\n";
    
    static String HELP_POST =
    	"usage: httpc post [-v] [-h key:value] [-d inline-data] [-f file] URL\r\n" + 
    	"Post executes a HTTP POST request for a given URL with inline data or from\r\n" + 
    	"file.\r\n" + 
    	" -v Prints the detail of the response such as protocol, status,\r\n" + 
    	"and headers.\r\n" + 
    	" -h key:value Associates headers to HTTP Request with the format\r\n" + 
    	"'key:value'.\r\n" + 
    	" -d string Associates an inline data to the body HTTP POST request.\r\n" + 
    	" -f file Associates the content of a file to the body HTTP POST\r\n" + 
    	"request.\r\n" + 
    	"Either [-d] or [-f] can be used but not both.\r\n";
}
