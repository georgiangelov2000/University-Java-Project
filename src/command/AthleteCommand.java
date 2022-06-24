package command;

public class AthleteCommand {
    private boolean isGetUp;

    public void getUp(){
        System.out.println("Get up!");
        this.isGetUp = true;
    }

    public void lieDownCommand(){
        System.out.println("Lie Down");
        isGetUp = false;
    }
}
