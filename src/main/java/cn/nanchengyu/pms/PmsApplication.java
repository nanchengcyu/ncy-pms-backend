package cn.nanchengyu.pms;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("cn.nanchengyu.pms.mapper")
//@CrossOrigin
public class PmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class, args);
    }

}
