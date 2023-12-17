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
public class TeamQuitRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private Long teamId;

}
