package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.OrderAdapterService;
import org.itstack.demo.design.service.OrderService;

public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
