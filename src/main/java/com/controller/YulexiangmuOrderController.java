package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.YulexiangmuOrderEntity;

import com.service.YulexiangmuOrderService;
import com.entity.view.YulexiangmuOrderView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.service.YulexiangmuService;
import com.entity.YulexiangmuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 娱乐项目订单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yulexiangmuOrder")
public class YulexiangmuOrderController {
    private static final Logger logger = LoggerFactory.getLogger(YulexiangmuOrderController.class);

    @Autowired
    private YulexiangmuOrderService yulexiangmuOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private YulexiangmuService yulexiangmuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = yulexiangmuOrderService.queryPage(params);

        //字典表数据转换
        List<YulexiangmuOrderView> list =(List<YulexiangmuOrderView>)page.getList();
        for(YulexiangmuOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YulexiangmuOrderEntity yulexiangmuOrder = yulexiangmuOrderService.selectById(id);
        if(yulexiangmuOrder !=null){
            //entity转view
            YulexiangmuOrderView view = new YulexiangmuOrderView();
            BeanUtils.copyProperties( yulexiangmuOrder , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(yulexiangmuOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //级联表
            YulexiangmuEntity yulexiangmu = yulexiangmuService.selectById(yulexiangmuOrder.getYulexiangmuId());
            if(yulexiangmu != null){
                BeanUtils.copyProperties( yulexiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYulexiangmuId(yulexiangmu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YulexiangmuOrderEntity yulexiangmuOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yulexiangmuOrder:{}",this.getClass().getName(),yulexiangmuOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            yulexiangmuOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        yulexiangmuOrder.setInsertTime(new Date());
        yulexiangmuOrder.setCreateTime(new Date());
        yulexiangmuOrderService.insert(yulexiangmuOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YulexiangmuOrderEntity yulexiangmuOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yulexiangmuOrder:{}",this.getClass().getName(),yulexiangmuOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            yulexiangmuOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        yulexiangmuOrderService.updateById(yulexiangmuOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yulexiangmuOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yulexiangmuOrderService.queryPage(params);

        //字典表数据转换
        List<YulexiangmuOrderView> list =(List<YulexiangmuOrderView>)page.getList();
        for(YulexiangmuOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YulexiangmuOrderEntity yulexiangmuOrder = yulexiangmuOrderService.selectById(id);
            if(yulexiangmuOrder !=null){
                //entity转view
                YulexiangmuOrderView view = new YulexiangmuOrderView();
                BeanUtils.copyProperties( yulexiangmuOrder , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(yulexiangmuOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    YulexiangmuEntity yulexiangmu = yulexiangmuService.selectById(yulexiangmuOrder.getYulexiangmuId());
                if(yulexiangmu != null){
                    BeanUtils.copyProperties( yulexiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYulexiangmuId(yulexiangmu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YulexiangmuOrderEntity yulexiangmuOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yulexiangmuOrder:{}",this.getClass().getName(),yulexiangmuOrder.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
//            YulexiangmuEntity yulexiangmuEntity = yulexiangmuService.selectById(yulexiangmuOrder.getYulexiangmuId());
//            if(yulexiangmuEntity == null){
//                return R.error(511,"查不到该商品");
//            }
//            Double yulexiangmuNewMoney = yulexiangmuEntity.getYulexiangmuNewMoney();
//            if(yulexiangmuNewMoney == null){
//                return R.error(511,"商品价格不能为空");
//            }
//
//            Integer userId = (Integer) request.getSession().getAttribute("userId");
//            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
//            if(yonghuEntity == null){
//                return R.error(511,"用户不能为空");
//            }
//            if(yonghuEntity.getNewMoney() == null){
//                return R.error(511,"用户金额不能为空");
//            }
//            double balance = yonghuEntity.getNewMoney() - yulexiangmuEntity.getYulexiangmuNewMoney();//余额
//            if(balance<0){
//                return R.error(511,"余额不够支付");
//            }
            yulexiangmuOrder.setCreateTime(new Date());
            yulexiangmuOrder.setInsertTime(new Date());
            yulexiangmuOrderService.insert(yulexiangmuOrder);//根据id更新
//            yonghuEntity.setNewMoney(balance);
//            yonghuService.updateById(yonghuEntity);
            return R.ok();
        }else{
            return R.error(511,"您没有权限支付订单");
        }
    }





}

