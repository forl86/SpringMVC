package web.controller;

import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping()
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        if (count != null) {
            model.addAttribute("carsList", carService.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
