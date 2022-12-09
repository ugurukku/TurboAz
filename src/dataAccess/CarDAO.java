package dataAccess;
// Data Access Object

import entity.Car;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CarDAO implements CarRepository {

    List<Car> cars = Arrays.asList(
            new Car(1, "Camry", true, 1, 65600),
            new Car(2, "VAZ-2107", false, 2, 7800),
            new Car(3, "Prius", false, 1, 12500));

    @Override
    public Car getById(Integer id) {

        AtomicReference<Car> _car = new AtomicReference<>();

        cars.forEach(car -> {

            if (car.getId() == id) {

                _car.set(car);

            }
        });

        return _car.get();

    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }
}
