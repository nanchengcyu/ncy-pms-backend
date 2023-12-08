package cn.nanchengyu.pms.service.impl;

import cn.nanchengyu.pms.mapper.TagMapper;
import cn.nanchengyu.pms.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.nodes.Tag;

/**
* @author nanchengyu
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-12-08 23:55:19
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




