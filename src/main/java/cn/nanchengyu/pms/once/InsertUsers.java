package cn.nanchengyu.pms.once;

import cn.nanchengyu.pms.mapper.UserMapper;
import cn.nanchengyu.pms.model.domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ClassName: InsertUsers
 * Package: once
 * Description:
 *              这个类一般写到测试中，此处插入内容也不全！
 *
 * @Author 南城余
 * @Create 2023/12/14 15:49
 * @Version 1.0
 */
@Component
public class InsertUsers {
    @Resource
    private UserMapper userMapper;

    /**
     * 定时批量导入用户
     */
//    @Scheduled(initialDelay = 5000,fixedRate = Long.MAX_VALUE)  //此处需要在main方法中加入@EnableScheduling
    public void doInsertUsers() {
        //执行sql消耗的时间
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 10000;
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setId(0L);
            user.setUsername("");
            //其余省略
            user.setUserPassword("");

            userMapper.insert(user);
        }


        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());

    }
}

//    public static void main(String[] args) {
////        InsertUsers insertUsers = new InsertUsers();
////        insertUsers.doInsertUsers();
//        //直接调方法
//        new InsertUsers().doInsertUsers();
//    }
//}
