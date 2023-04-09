package com.cxylbx.springcloud.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 刘宝星
 */
@Service("orderService")
public class OrderService {

    private final AtomicInteger orderIndex = new AtomicInteger(0);

    public ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList) {
        return serviceInstanceList.get(getIndex() % serviceInstanceList.size());
    }

    private int getIndex() {
        int index;
        int result;
        do {
            index = orderIndex.get();
            result = index + 1;
        } while (!orderIndex.compareAndSet(index, result));
        System.out.println("ribbon手写的次数" + result);
        return result;
    }
}
