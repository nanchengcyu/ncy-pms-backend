package cn.nanchengyu.pms.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Properties;

@SpringBootTest
public class RedisConnectionTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testRedisConnection() {
        RedisConnectionFactory connectionFactory = redisTemplate.getConnectionFactory();
        if (connectionFactory != null) {
            RedisConnection connection = connectionFactory.getConnection();

            // 获取连接的信息
            Properties info = connection.info("server");

            // 打印连接的IP和端口
            String redisHost = info.getProperty("server.host");
            String redisPort = info.getProperty("server.port");

            System.out.println("Redis连接IP：" + redisHost);
            System.out.println("Redis连接端口：" + redisPort);

            // 在这里进行你的断言或其他测试逻辑
        } else {
            System.err.println("Redis连接工厂未注入");
        }
    }
}
