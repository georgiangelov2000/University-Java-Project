package command;

public class AthleteLieDownCommand implements Command {
    private AthleteCommand athlete;

    public AthleteLieDownCommand(AthleteCommand athlete){
        this.athlete = athlete;
    }

    @Override
    public void execute() {
        this.athlete.lieDownCommand();
    }
}
