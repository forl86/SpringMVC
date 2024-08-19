package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carsList;

    public CarDaoImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car("Toyota", "Caldina", 2000));
        carsList.add(new Car("Ford", "Mustang", 1975));
        carsList.add(new Car("Mercedes", "C200", 2009));
        carsList.add(new Car("Kia", "Rio", 2018));
        carsList.add(new Car("Haval", "T500", 2024));
    }
    @Override
    public void add(Car car) {
        carsList.add(car);
    }
    @Override
    public List<Car> getAllCars() {
        return carsList;
    }

    @Override
    public List<Car> getCars(int count) {
        return (count < 5) ? carsList.subList(0, count) : carsList;
    }

    @Override
    public List<String> getCarNames() {
        List<String> carNames = new ArrayList<>();
        for( Car c : carsList) {
            carNames.add(c.getName());
        }
        return carNames;
    }
}
