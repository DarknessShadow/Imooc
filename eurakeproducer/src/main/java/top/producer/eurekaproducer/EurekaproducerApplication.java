package top.producer.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaproducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaproducerApplication.class, args);
    }

}
