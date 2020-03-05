package app;
 
public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;

    //Hard coded dependencies
    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print("Alert by phone "+alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print("Alert by email "+alert);
        }
    }
    
    public static void main(String [] args)
    {
    	WeatherTracker tracker = new WeatherTracker();
    	tracker.setCurrentConditions("sunny");
    	
    }
}
