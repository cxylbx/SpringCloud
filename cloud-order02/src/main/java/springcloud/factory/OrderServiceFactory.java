package springcloud.factory;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import springcloud.service.OrderService;

/**
 * @author 刘宝星
 * @date 2023/3/26 15:34
 */
@Component
public class OrderServiceFactory implements FallbackFactory<OrderService> {

    @Override
    public OrderService create(Throwable cause) {
        return () -> "错误尝试";
    }
}
