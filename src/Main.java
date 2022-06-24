import command.*;
import observer.Athlete;
import observer.Audience;
import observer.Observer;

public class Main {

    public static void main(String[] args) {

        AthleteCommand athleteCommand = new AthleteCommand();

        Command athleteGetUpCommand = new AthleteGetUpCommand(athleteCommand);

        Command athleteLieDownCommand = new AthleteLieDownCommand(athleteCommand);

        RemoteCommander remote = new RemoteCommander();

        remote.setCommand(athleteGetUpCommand);
        remote.pressCommand();

        Athlete athlete = new Athlete();
        Observer audience1 = new Audience("First Audience");
        Observer audience2 = new Audience("Second Audience");
        Observer audience3 = new Audience("Third Audience");

        athlete.startWatcing(audience1);
        athlete.startWatcing(audience2);
        athlete.startWatcing(audience3);

        athlete.setPosition("First Position: Get up for jumps.");
        athlete.stopWatcing(audience3);

        remote.setCommand(athleteLieDownCommand);
        remote.pressCommand();

        athlete.setPosition("Second Position: Lie down for andominal presses.");

    }

}
