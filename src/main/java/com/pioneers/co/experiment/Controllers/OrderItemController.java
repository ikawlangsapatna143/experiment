package com.pioneers.co.experiment.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pioneers.co.experiment.Model.OrderItem;
import com.pioneers.co.experiment.NotFoundException.OrderItemNotFoundException;
import com.pioneers.co.experiment.Repository.OrderItemRepository;

@RestController
@RequestMapping("/api/v1/order-items")
public class OrderItemController {
    
    private final OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo){
        this.repo = repo;
    }
    @GetMapping("/all")
    public List<OrderItem> getOrderItems(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItems(@PathVariable Long id){
        return repo.findById(id).orElseThrow(
            ()-> new OrderItemNotFoundException(id));
    }
     @PostMapping("/create")
    public String create(@RequestBody OrderItem newOrderItem){
        repo.save(newOrderItem);
        return "A new Order is Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        repo.deleteById(id);
        return "The order is deleted";
    }
}
