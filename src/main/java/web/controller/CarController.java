package web.controller;

import model.Car;
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
    CarService cs = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        if (count != null) {
            model.addAttribute("carsList", cs.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
