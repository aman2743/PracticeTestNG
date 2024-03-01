
public class GetOSAndJavaVersion {
	public static void main(String[] args) {
//		System.getProperties().list(System.out);//output stream
		System.out.println("Operating System Version:"+System.getProperty("os.version"));
		System.out.println("Java Version:"+System.getProperty("java.version"));
		System.out.println("User Name:"+System.getProperty("user.name"));
        System.out.println("User Directory:"+System.getProperty("user.dir"));
        System.out.println("User Country:"+System.getProperty("user.country"));
        System.out.println("User Language:"+System.getProperty("user.language"));
        System.out.println("User Home:"+System.getProperty("user.home"));
        System.out.println("Java Version date:"+System.getProperty("java.version.date"));
        
	}
}
