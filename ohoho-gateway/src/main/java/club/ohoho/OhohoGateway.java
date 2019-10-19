package club.ohoho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author 18521
 * @Date 2019/10/19 0019 14:57
 * @Since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class OhohoGateway {
    public static void main(String[] args) {
        SpringApplication.run(OhohoGateway.class, args);
    }
}
