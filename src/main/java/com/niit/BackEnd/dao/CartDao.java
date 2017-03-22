package com.niit.BackEnd.dao;

import java.util.List;

import com.niit.BackEnd.model.Cart;
import com.niit.BackEnd.model.CartItem;
import com.niit.BackEnd.model.Product;
import com.niit.BackEnd.model.User;

public interface CartDao {

	public CartItem addCartItem(CartItem cartItem);
	public Cart getCart(int userId);
	public CartItem getSingleCartItem();
	public List<CartItem> getCartItemList();
	public void createCart(int userId);
	public void saveCart(Cart cart);
	public CartItem getCartItem(int productId,int cartId);
	public void updateCartItem(CartItem cartItem);
	public void deleteCartItem(CartItem cartItem);
	public void deleteAllCartItems(int cartId);
}
