package com.soap.order.client.soap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.bharath.ws.trainings.CustomerOrdersPortType;
import com.bharath.ws.trainings.GetOrdersRequest;
import com.bharath.ws.trainings.GetOrdersResponse;
import com.bharath.ws.trainings.Order;
import com.soap.order.ws.OrderServiceService;

public class SoapClient {
	
	public static void main(String args[]) throws MalformedURLException {
		
		OrderServiceService orderService  = new OrderServiceService(new URL("http://localhost:8080/orderws/orders?wsdl"));
		CustomerOrdersPortType orderServicePort = orderService.getOrderServicePort();
		GetOrdersRequest request = new GetOrdersRequest();
		request.setCustomerId(BigInteger.valueOf(1));
		GetOrdersResponse orders = orderServicePort.getOrders(request);
		List<Order> order = orders.getOrder();
		
		System.out.println(order);
		System.out.println("Total items it order are : " +order.size());
		
		
	}

}
