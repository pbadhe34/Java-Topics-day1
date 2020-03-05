package app;
 
public class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "rainy")
            System.out.print("Alert by MobileDevice "+ " It is rainy");
    }
}
