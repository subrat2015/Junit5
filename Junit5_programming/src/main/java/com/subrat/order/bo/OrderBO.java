package com.subrat.order.bo;

import com.subrat.order.bo.Exception.BOException;
import com.subrat.order.dto.Order;

public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;

}

