package com.soap.order.ws;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.feature.Features;

import com.bharath.ws.trainings.CreateOrdersRequest;
import com.bharath.ws.trainings.CreateOrdersResponse;
import com.bharath.ws.trainings.CustomerOrdersPortType;
import com.bharath.ws.trainings.GetOrdersRequest;
import com.bharath.ws.trainings.GetOrdersResponse;
import com.bharath.ws.trainings.Order;
import com.bharath.ws.trainings.Product;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class OrderService implements CustomerOrdersPortType{
	
	Map<BigInteger, List<Order>> orderRepo = new HashMap<>();
	Integer id = 0;
	
	public OrderService() {
		init();
	}
	
	public void init() {
		List<Order> orders = new ArrayList<Order>();
		
		Order macOrder = new Order();
		macOrder.setId(BigInteger.valueOf(1));
		
		Product mac  = new Product();
		mac.setId("1000");
		mac.setDescription("Awsome Mac");
		mac.setQuantity(BigInteger.valueOf(2));
		macOrder.getProduct().add(mac);
		
		orders.add(macOrder);
		
		id++;
		orderRepo.put(BigInteger.valueOf(id), orders);
		
	}
	

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {
		BigInteger customerId = request.getCustomerId();
		List<Order> orderDetails = orderRepo.get(customerId);
		GetOrdersResponse response = new GetOrdersResponse();
		response.getOrder().addAll(orderDetails);
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
		BigInteger customerId = request.getCustomerId();
		List<Order> orderDetails = orderRepo.get(customerId);
		orderDetails.add(request.getOrder());
		
		CreateOrdersResponse response = new CreateOrdersResponse();
		response.setResult(true);
		return response;
	}

}
