package applications;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

//This class shows the properties of the java virtual machine



public class ShowProperties {
	
	String localOS = null;
	
	
    public static void main(String[] args) 
    {
        System.getProperties().list(System.out);
        getSystemInformation();
    }
    
    public static String getOperatingSystem()
    {
    	String localOS = System.getProperty("os.name");
		System.out.println(localOS);
		return localOS;
    }
    
    public static String getSystemInformation()
    {
    	System.getProperties().list(System.out);
    	//List<Properties> properties = Arrays.asList(System.getProperties());
    	//String propertiesCommaSeperated = String.join(",", properties);
    	
    	String SystemInformation = System.getProperties().toString() + "\n";
    	System.out.println(SystemInformation);
    	return SystemInformation;
    	//return properties.toString();
    }
}