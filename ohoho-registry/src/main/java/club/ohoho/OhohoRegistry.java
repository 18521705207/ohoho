package club.ohoho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 18521
 * @Date 2019/10/19 0019 14:47
 * @Since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class OhohoRegistry {
    public static void main(String[] args) {
        SpringApplication.run(OhohoRegistry.class, args);
    }
}

