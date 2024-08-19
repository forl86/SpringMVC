package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private CarDao carDao;

    public CarServiceImpl() {
    }
    @Autowired
    public void SetCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
    @Override
    public List<String> getCarNames() {
        return carDao.getCarNames();
    }
}
