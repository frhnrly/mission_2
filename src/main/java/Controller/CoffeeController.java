package Controller;

import com.javatpoint.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.CoffeeService;

import java.util.List;

@RestController
public class CoffeeController {
    //autowire the CoffeeService class
    @Autowired
    CoffeeService coffeeService;
    //creating a get mapping that retrieves all the coffee detail from the database
    @GetMapping("/coffee")
    private List<Coffee> getAllCoffee()
    {
        return coffeeService.getAllCoffee();
    }
    //creating a get mapping that retrieves the detail of a specific coffee
    @GetMapping("/coffee/{coffeeid}")
    private Coffee getCoffee(@PathVariable("coffeeid") int coffeeid)
    {
        return coffeeService.getCoffeeById(coffeeid);
    }
    //creating a delete mapping that deletes a specified coffee
    @DeleteMapping("/coffee/{coffeeid}")
    private void deleteCoffee(@PathVariable("coffeeid") int coffeeid)
    {
        coffeeService.delete(coffeeid);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/coffee")
    private int saveCoffee(@RequestBody Coffee coffee)
    {
        coffeeService.saveOrUpdate(coffee);
        return coffee.getCoffeeid();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/coffee")
    private Coffee update(@RequestBody Coffee coffee)
    {
        coffeeService.saveOrUpdate(coffee);
        return coffee;
    }
}