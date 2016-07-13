package lesson1;

/**
 * Created by Admin on 12.07.16.
 */
public class RaceCar extends AbstractCar { //Является ли гоночная машина машиной?
    RaceCar() {
        speed = 300;
    }

    @Override
    public double getEngineVolume() {
        return 3.5;
    }
}
