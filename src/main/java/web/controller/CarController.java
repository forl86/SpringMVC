package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class CarController {

    private CarService carService = null;

//    public CarController() {
//        this.carService = new CarServiceImpl();
//    }
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        if (carService == null) {
            setCarService(new CarServiceImpl());
        }
        if (count != null) {
            model.addAttribute("carsList", carService.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }
}
