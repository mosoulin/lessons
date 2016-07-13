package lesson1;

/**
 * Created by Admin on 12.07.16.
 */
public abstract class AbstractCar implements Car {
    protected int speed = 200; // protected видят наследники

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 15;
    }

    public void getDiscription() {
        out("speed " + speed+" "+ getEngineVolume());
    }

    private void out(String str) {
        System.out.println(str);
    }
}
