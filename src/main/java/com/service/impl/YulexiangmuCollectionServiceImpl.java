package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.YulexiangmuCollectionDao;
import com.entity.YulexiangmuCollectionEntity;
import com.service.YulexiangmuCollectionService;
import com.entity.view.YulexiangmuCollectionView;

/**
 * 娱乐项目收藏 服务实现类
 */
@Service("yulexiangmuCollectionService")
@Transactional
public class YulexiangmuCollectionServiceImpl extends ServiceImpl<YulexiangmuCollectionDao, YulexiangmuCollectionEntity> implements YulexiangmuCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YulexiangmuCollectionView> page =new Query<YulexiangmuCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
