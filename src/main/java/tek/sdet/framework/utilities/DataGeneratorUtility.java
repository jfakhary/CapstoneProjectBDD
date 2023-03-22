package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {

	public static String data(String input) {

		Faker faker = new Faker();
		String outPut = "";
		String firstName = "";
		String lastName = "";

		if (input.equals("firstName")) {
			outPut = faker.name().firstName();

		} else if (input.equals("lastName")) {
			outPut = faker.name().lastName();
		} else if (input.equals("email")) {
			outPut = faker.name().firstName() + "." + faker.name().lastName() + "@tekschool.us";
		} else if (input.equals("phoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) {
			outPut = faker.name().fullName();

		} else if (input.equals("streetAddress")) {
			outPut = faker.address().streetAddress();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
		} else if (input.equals("state")) {
			outPut = faker.address().state();
		} else if (input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		}else if(input.equals("country")) {
			outPut = "United States";
		}else if(input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}else if(input.equals("cardNumber")) {
			outPut = faker.number().digits(16);
		}else {
			outPut = faker.expression("");
		}return outPut;
		
	}
	
	public static String credentials(String input) {
		String email = "jim@gmail.com";
		String password = "Tek@12345";
		
		return password;
		
	}

}
