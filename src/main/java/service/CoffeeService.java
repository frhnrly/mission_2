package service;

import com.javatpoint.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CoffeeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService{
    @Autowired
    CoffeeRepository coffeeRepository;
    //getting all coffee record by using the method findAll() of CrudRepository
    public List<Coffee> getAllCoffee()
    {
        List<Coffee> coffee = new ArrayList<Coffee>();
        coffeeRepository.findAll().forEach(coffee1 -> coffee.add(coffee1));
        return coffee;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Coffee getCoffeeById(int id)
    {
        return coffeeRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Coffee coffee)
    {
        coffeeRepository.save(coffee);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        coffeeRepository.deleteById(id);
    }
    //updating a record
    public void update(Coffee coffee, int coffeeid)
    {
        coffeeRepository.save(coffee);
    }
}