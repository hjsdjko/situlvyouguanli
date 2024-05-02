package com.dao;

import com.entity.XiangcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangcheView;

/**
 * 相册 Dao 接口
 *
 * @author 
 */
public interface XiangcheDao extends BaseMapper<XiangcheEntity> {

   List<XiangcheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
