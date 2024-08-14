package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {
    List<Car> getAllCars();
    List<Car> getCars(int count);
    List<String> getCarNames();
}
