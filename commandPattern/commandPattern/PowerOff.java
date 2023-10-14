package commandPattern;

public class PowerOff implements Command{

    private Power execute;

    public PowerOff (Power execute){
        this.execute = execute;

    }
    @Override
    public String execute() {
        return execute.off();
    }
}

//Purugganan