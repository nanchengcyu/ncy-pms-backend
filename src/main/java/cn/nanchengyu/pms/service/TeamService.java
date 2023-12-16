package cn.nanchengyu.pms.service;

import cn.nanchengyu.pms.model.domain.Team;
import cn.nanchengyu.pms.model.domain.User;
import cn.nanchengyu.pms.model.domain.dto.TeamQuery;
import cn.nanchengyu.pms.model.domain.request.TeamJoinRequest;
import cn.nanchengyu.pms.model.domain.request.TeamUpdateRequest;
import cn.nanchengyu.pms.model.domain.vo.TeamUserVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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

    /**
     * 搜索队伍
     * @param teamQuery
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery,boolean isAdmin);

    /**
     * 更新队伍情况
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest,User loginUser);

    boolean joinTeam(TeamJoinRequest teamJoinRequest,User loginUser);
}
