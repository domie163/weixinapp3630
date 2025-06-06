package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussershouwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussershouwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussershouwupinView;


/**
 * 二手物品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 11:06:52
 */
public interface DiscussershouwupinService extends IService<DiscussershouwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussershouwupinVO> selectListVO(Wrapper<DiscussershouwupinEntity> wrapper);
   	
   	DiscussershouwupinVO selectVO(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
   	
   	List<DiscussershouwupinView> selectListView(Wrapper<DiscussershouwupinEntity> wrapper);
   	
   	DiscussershouwupinView selectView(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussershouwupinEntity> wrapper);
   	
}

