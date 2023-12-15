package cn.nanchengyu.pms.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: PageRequest
 * Package: cn.nanchengyu.pms.common
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/15 22:29
 * @Version 1.0
 */
@Data
public class PageRequest  implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    //页面大小
    protected int pageSize = 10;
    //当前页数
    protected int pageNum = 1;



}
