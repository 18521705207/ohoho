package club.ohoho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 18521
 * @Date 2019/10/19 0019 14:47
 * @Since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OhohoItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(OhohoItemApplication.class, args);
    }
}