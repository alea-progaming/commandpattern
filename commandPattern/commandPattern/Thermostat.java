package commandPattern;

public class Thermostat implements Power{

    @Override
    public String off() {
        return "Thermostat is Off!";
    }

    @Override
    public String on() {
        return "Thermostat is On!";
    }

    public String tempUp(){
        return "Temperature is increasing";
    }

    public String tempDown(){
        return "Temperature is decreasing";
    }

    
}

//Purugganan