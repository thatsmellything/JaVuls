package applications;

//This class shows the properties of the java virtual machine



public class ShowProperties {
	
	String localOS = null;
	
	
    public static void main(String[] args) 
    {
        System.getProperties().list(System.out);
    }
    
    public static String getOperatingSystem()
    {
    	String localOS = System.getProperty("os.name");
		System.out.println(localOS);
		return localOS;
    }
}