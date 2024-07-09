package com.pioneers.co.experiment.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pioneers.co.experiment.Model.Order;
import com.pioneers.co.experiment.NotFoundException.OrderNotFoundException;
import com.pioneers.co.experiment.Repository.OrderRepository;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo){
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<Order> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        return repo.findById(id).orElseThrow(
        ()-> new OrderNotFoundException(id));
    }
    @PostMapping("/create")
    public String create(@RequestBody Order newOrder){
        repo.save(newOrder);
        return "A new Order is Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        repo.deleteById(id);
        return "The order is deleted";
    }

}
