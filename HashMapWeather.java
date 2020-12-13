import java.util.Scanner;
import java.util.HashMap;

public class HashMapWeather {
	public static void main(String[] args) {
		HashMap<String,String> HMWeather = new HashMap<String,String>(); //Create HashMap Object
		HMWeather.put("gajuwaka", "H:30, L:20");
		HMWeather.put("laurel", "H:20, L:10");
		HMWeather.put("melbourne","H:35, L:25");

		Scanner scanner=new Scanner(System.in); //Scanner constructor
		System.out.println("Enter city: ");
		String city=scanner.nextLine(); //read city name
		String val=(String)HMWeather.get(city); //get city name
		System.out.println("Temperatures " + val); //check the value

	}
}