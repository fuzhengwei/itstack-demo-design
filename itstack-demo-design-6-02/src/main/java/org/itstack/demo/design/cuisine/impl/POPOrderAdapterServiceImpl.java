package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.OrderAdapterService;
import org.itstack.demo.design.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
