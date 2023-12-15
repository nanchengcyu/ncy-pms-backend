package cn.nanchengyu.pms.service.impl;

import cn.nanchengyu.pms.mapper.UserTeamMapper;
import cn.nanchengyu.pms.model.domain.UserTeam;
import cn.nanchengyu.pms.service.UserTeamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * @author nanchengyu
 * @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
 * @createDate 2023-12-15 21:33:44
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




