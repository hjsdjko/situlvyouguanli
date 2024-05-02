package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YulexiangmuCollectionEntity;
import java.util.Map;

/**
 * 娱乐项目收藏 服务类
 */
public interface YulexiangmuCollectionService extends IService<YulexiangmuCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}