package io.qg.fooddelivery.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.qg.fooddelivery.models.FoodCart;
import io.qg.fooddelivery.models.Item;



@Service
public interface ICartService {
    public FoodCart createCart(FoodCart cart);
    public FoodCart addItemToCart(Item item,Long id);
    public FoodCart increaseQuantity(Item item,int quantity,Long id);
    public FoodCart decreaseQuantity(Item item,int quantity,Long id);
    public FoodCart removeItem(Item item,Long id);
    public ResponseEntity<FoodCart> clearCart(Long id);
    public FoodCart getFoodCartById(Long id);

}
