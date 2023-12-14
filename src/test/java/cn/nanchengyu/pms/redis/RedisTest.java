package cn.nanchengyu.pms.redis;

import cn.nanchengyu.pms.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * ClassName: RedisTest
 * Package: cn.nanchengyu.pms.redis
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/14 17:55
 * @Version 1.0
 */
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    void testRedis() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //增
        valueOperations.set("ncyString", "nanchengyu");
        valueOperations.set("ncyInt","1");
        valueOperations.set("ncyDouble",1.0);
        User user = new User();
        user.setId(1L);
        valueOperations.set("ncyUser",user);
        //查
//        Object ncy = valueOperations.get("ncyString");
//        Assertions.assertTrue("nanchengyu".equals((String) "nanchengyu"));
//        ncy = valueOperations.get("ncyInt");
//        Assertions.assertTrue("1".equals((Integer) 1));
    }
}
