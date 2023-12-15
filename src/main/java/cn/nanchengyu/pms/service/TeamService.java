package cn.nanchengyu.pms.service;

import cn.nanchengyu.pms.model.domain.Team;
import cn.nanchengyu.pms.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author nanchengyu
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-12-15 21:29:02
*/
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);
}
