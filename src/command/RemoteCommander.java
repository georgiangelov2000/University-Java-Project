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
                System.out.println("No command set");
                return;
            }
        this.command.execute();
        }

}
