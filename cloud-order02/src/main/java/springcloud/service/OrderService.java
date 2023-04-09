package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import springcloud.factory.OrderServiceFactory;

/**
 * @author 刘宝星
 */
@FeignClient(value = "CLOUD-PAYMENT", fallbackFactory = OrderServiceFactory.class)
public interface OrderService {

    @GetMapping("/test/02")
    String test();
}
