package com.niit.BackEnd.dao;

import com.niit.BackEnd.model.BillingAddress;
import com.niit.BackEnd.model.ShippingAddress;
import com.niit.BackEnd.model.User;

public interface UserDao {

	public String addUser(User user);
	public void updateUser(User user);
	public User getUserById(int id);
	public String addBillingAddress(BillingAddress billingAddress);
	public String updateBillingAddress(BillingAddress billingAddress);
	public User getUserByUsername(String username);
	public BillingAddress getBillingAddress(int userId);
	public void addShippingAddress(ShippingAddress shippingAddress);
}
