package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YulexiangmuEntity;
import java.util.Map;

/**
 * 娱乐项目 服务类
 */
public interface YulexiangmuService extends IService<YulexiangmuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}