package com.cardapio_digital.Cardapio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardapio_digital.Cardapio.Entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
