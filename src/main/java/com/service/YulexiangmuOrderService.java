package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YulexiangmuOrderEntity;
import java.util.Map;

/**
 * 娱乐项目订单 服务类
 */
public interface YulexiangmuOrderService extends IService<YulexiangmuOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}