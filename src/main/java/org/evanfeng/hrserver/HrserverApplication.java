package org.evanfeng.hrserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.evanfeng.hrserver.mapper")
public class HrserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrserverApplication.class, args);
    }

}
