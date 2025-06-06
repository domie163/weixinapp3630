package com.dao;

import com.entity.DiscussershouwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussershouwupinVO;
import com.entity.view.DiscussershouwupinView;


/**
 * 二手物品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 11:06:52
 */
public interface DiscussershouwupinDao extends BaseMapper<DiscussershouwupinEntity> {
	
	List<DiscussershouwupinVO> selectListVO(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
	
	DiscussershouwupinVO selectVO(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
	
	List<DiscussershouwupinView> selectListView(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);

	List<DiscussershouwupinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
	
	DiscussershouwupinView selectView(@Param("ew") Wrapper<DiscussershouwupinEntity> wrapper);
	
}
