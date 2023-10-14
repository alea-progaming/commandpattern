package commandPattern;

public class PowerOn implements Command{

    private Power execute;

    public PowerOn (Power execute){
        this.execute = execute;

    }
    @Override
    public String execute() {
        return execute.on();
    }
}

//Purugganan