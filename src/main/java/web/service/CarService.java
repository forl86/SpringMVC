package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getCars(int count);
    List<String> getCarNames();
}
