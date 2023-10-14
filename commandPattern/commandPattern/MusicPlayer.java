package commandPattern;

public class MusicPlayer implements Power{

    @Override
    public String off() {
        return "Music Player is Off!";
    }

    @Override
    public String on() {
        return "Music Player is On!";
    }

    public String volumeUp(){
        return "Music volume is increasing";
    }

    public String volumeDown(){
        return "Music volume is decreasing";
    }

}

//Purugganan