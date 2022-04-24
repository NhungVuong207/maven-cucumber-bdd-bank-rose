package utilities;

import com.github.javafaker.Faker;

public class DataUtil {
	
	private Faker faker;
	
	public static DataUtil getData() {
		 return new DataUtil();
	}
	
	public DataUtil() {

		faker = new Faker();
	}
	
	public String getFirstName() {

		return faker.name().firstName();
	}
	
	public String getLastName() {

		return faker.name().lastName();
	}
	
	public String getEmailAddress() {
		return faker.internet().emailAddress();
	}
	
	public String getEditEmailAddress() {

		return faker.internet().safeEmailAddress();
	}
	
	public String getPassword() {

		return faker.internet().password();
	}
	
	public String getString() {

		return faker.name().toString();
	}
	
	public String getTitle() {

		return faker.name().title();
	}
	
	public String getCardNumber() {

		return faker.business().creditCardNumber();
	}
	
	public int getCode() {

		return faker.code().hashCode();
	}
	
	public String getCardHolderName() {

		return faker.name().fullName().toUpperCase();
	}
	

}
