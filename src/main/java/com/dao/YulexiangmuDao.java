package com.dao;

import com.entity.YulexiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YulexiangmuView;

/**
 * 娱乐项目 Dao 接口
 *
 * @author 
 */
public interface YulexiangmuDao extends BaseMapper<YulexiangmuEntity> {

   List<YulexiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
