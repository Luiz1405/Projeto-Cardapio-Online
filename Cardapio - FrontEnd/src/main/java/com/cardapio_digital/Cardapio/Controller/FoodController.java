package com.cardapio_digital.Cardapio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardapio_digital.Cardapio.DTO.FoodResponseDTO;
import com.cardapio_digital.Cardapio.DTO.foodRequestDTO;
import com.cardapio_digital.Cardapio.Entities.Food;
import com.cardapio_digital.Cardapio.Repository.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody foodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);

        return;
    }

    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }

}
