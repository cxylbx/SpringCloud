package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 程序启动类
 * @author liubaoxing
 * @date 2023/2/22 10:09
 */
@EnableFeignClients
@SpringBootApplication
public class OrderMain02 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain02.class);
    }
}
