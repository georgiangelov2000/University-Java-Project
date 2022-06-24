package observer;

public class Audience implements Observer {

    private String position;
    private Observable workout;

    public Audience(String position){
        this.position =position;
    }

    @Override
    public void update() {
        if(this.workout == null){
            System.out.println("No position set");
            return;
        }
        String lastPositon = this.workout.getUpdate();
        System.out.println(this.position + "position: " + lastPositon);
    }

    @Override
    public void setPosition(Observable workout) {
        this.workout = workout;
    }
}
