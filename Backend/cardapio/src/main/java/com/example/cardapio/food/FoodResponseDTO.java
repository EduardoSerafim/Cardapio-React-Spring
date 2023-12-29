package com.example.cardapio.food;

public record FoodResponseDTO(
        Long id,
        String title,
        String image,
        Integer price
) {
    public FoodResponseDTO(Food entity){
        this(entity.getId(), entity.getTitle(), entity.getImage(), entity.getPrice());
    }

}
