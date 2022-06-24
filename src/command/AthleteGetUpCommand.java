package command;

public class AthleteGetUpCommand implements Command {

    private AthleteCommand athlete;

    public AthleteGetUpCommand(AthleteCommand athlete){
        this.athlete = athlete;
    }

    @Override
    public void execute() {
        this.athlete.getUp();
    }
}
