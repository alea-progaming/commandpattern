package commandPattern;

public class Lamp implements Power{

    @Override
    public String off() {
        return "Light is Off!";
    }

    @Override
    public String on() {
        return "Light is On!";
    }

    public String brightnessUp(){
        return "Increase brightness";
    }

    public String brightnessDown(){
        return "Decrease brightness";
    }

    public String yellowLightSetting(){
        return "Set to yellow light";
    }
}

//Purugganan