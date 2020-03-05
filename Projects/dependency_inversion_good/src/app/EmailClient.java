package app;
 
public class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny");
            System.out.print("Alert by Email "+ " It is sunny");
    }
}
