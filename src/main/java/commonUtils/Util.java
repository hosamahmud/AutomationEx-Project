package commonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {
    private static final String CREDENTIALS_FILE_PATH = "src/main/java/properties/credentials.properties";
    private static final Properties properties = new Properties();

    static {
        try {
            FileInputStream inputStream = new FileInputStream(CREDENTIALS_FILE_PATH);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFirstName() {
        return properties.getProperty("Firstname");
    }

    public static String getEmailAddress() {
        return properties.getProperty("email");
    }

    public static String getPassword() {
        return properties.getProperty("Password");
    }

    public static String getYear() {
        return properties.getProperty("year");
    }

    public static String getMonth() {
        return properties.getProperty("month");
    }

    public static String getDay() {
        return properties.getProperty("day");
    }

    public static String getLastName() {
        return properties.getProperty("Lastname");
    }

    public static String getCompanyName() {
        return properties.getProperty("Company");
    }

    public static String getAddress() {
        return properties.getProperty("Address");
    }

    public static String getAddress2() {
        return properties.getProperty("Address2");
    }

    public static String getCountry() {
        return properties.getProperty("Country");
    }

    public static String getState() {
        return properties.getProperty("State");
    }

    public static String getCity() {
        return properties.getProperty("City");
    }

    public static String getZipCode() {
        return properties.getProperty("Zipcode");
    }

    public static String getMobileNumber() {return properties.getProperty("MobileNumber");}
    public static String getIncorrectEmail() {return properties.getProperty("incorrectemail");}
    public static String getPathOfImage() {return properties.getProperty("filepath");}

    public static String getNameFromCard() {return properties.getProperty("NameonCard");}

    public static String getTheCardNumber() {return properties.getProperty("cardNumber");}

    public static String getCvc() {return properties.getProperty("CVC");}

    public static String getMonthExpiration() {return properties.getProperty("monthEX");}

    public static String getYearExpiration() {return properties.getProperty("yearEX");}
}

