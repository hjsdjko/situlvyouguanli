package com.dao;

import com.entity.YulexiangmuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YulexiangmuCollectionView;

/**
 * 娱乐项目收藏 Dao 接口
 *
 * @author 
 */
public interface YulexiangmuCollectionDao extends BaseMapper<YulexiangmuCollectionEntity> {

   List<YulexiangmuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
