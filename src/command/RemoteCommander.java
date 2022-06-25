package command;

public class RemoteCommander {
    private  Command command;

    public Command GetCommand(){
        return command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressCommand(){
        if(this.command == null) {
                System.out.println("You don't have entry command yet.");
                return;
            }
        this.command.execute();
        }

}
