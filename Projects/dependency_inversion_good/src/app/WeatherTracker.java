package app;
 
public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void notify(Notifier notifier) {
        notifier.alertWeatherConditions(currentConditions);
    }
    public static void main(String args[])
    {
    	WeatherTracker tracker = new WeatherTracker();
    	tracker.setCurrentConditions("rainy");  //sunny
    	
    	
    	MobileDevice notifier1 = new MobileDevice();
    	EmailClient notifier2 = new EmailClient();
    	
    	tracker.notify(notifier1);  //notifier1
    }
}
