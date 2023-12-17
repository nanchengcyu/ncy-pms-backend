package cn.nanchengyu.pms.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 */
@Data
//省略了@Getter、@Setter、@ToString、@EqualsAndHashCode 和 @NoArgsConstructor。
public class TeamJoinRequest implements Serializable {

    //当一个类实现了 Serializable 接口时，表示该类的对象可以被序列化，即可以被转换成字节流，从而可以在网络上传输或者持久化到磁盘。

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
