package com.niit.mycart.Dao;

public interface CartItemDao {

	 void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(Cart cart);

	    CartItem getCartItemByProductId (int productId);
}


