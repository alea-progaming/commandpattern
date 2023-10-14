package commandPattern;

public class Radio implements Power{

    @Override
    public String off() {
        return "Radio is Off!";
    }

    @Override
    public String on() {
        return "Radio is On!";
    }

    public String volumeUp(){
        return "Radio volume is increasing";
    }

    public String volumeDown(){
        return "Radio volume is decreasing";
    }

    public String previousChannel(){
        return "Previous channel";
    }

    public String nextChannel(){
        return "Next channel";
    }
    
}

//Purugganan