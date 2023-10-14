package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        RemoteControl rc = new RemoteControl();
        PowerOn on;
        PowerOff off;
        String cmd;
        
        Tv tv = new Tv();
        on = new PowerOn(tv);
        rc.setCommand(on);
        cmd = rc.clickButton();
        System.out.println(cmd);
        System.out.println(tv.volumeUp());

        System.out.println();

        MusicPlayer mp = new MusicPlayer();
        on = new PowerOn(mp);
        rc.setCommand(on);
        cmd = rc.clickButton();
        System.out.println(cmd);
        System.out.println(mp.volumeDown());

        System.out.println();

        Thermostat thermostat = new Thermostat();
        off = new PowerOff(thermostat);
        rc.setCommand(off);
        cmd = rc.clickButton();
        System.out.println(thermostat.tempDown());
        System.out.println(cmd);

        System.out.println();

        Radio rd = new Radio();
        on = new PowerOn(rd);
        rc.setCommand(on);
        cmd =rc.clickButton();
        System.out.println(cmd);
        System.out.println(rd.nextChannel());
        System.out.println(rd.volumeUp());

        System.out.println();

        Lamp lamp = new Lamp();
        on = new PowerOn(lamp);
        cmd = rc.clickButton();
        System.out.println(lamp.on());
        System.out.println(lamp.yellowLightSetting());
        System.out.println(lamp.brightnessDown());
        System.out.println(lamp.off());
    }
}

//Purugganan