package cn.nanchengyu.pms.model.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: TeamAddRequsest
 * Package: cn.nanchengyu.pms.model.domain.request
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/15 23:28
 * @Version 1.0
 */
@Data
public class TeamAddRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;


    /**
     * 密码
     */
    private String password;

}
