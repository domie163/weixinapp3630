package com.dao;

import com.entity.ErshouwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshouwupinVO;
import com.entity.view.ErshouwupinView;


/**
 * 二手物品
 * 
 * @author 
 * @email 
 * @date 2021-04-23 11:06:52
 */
public interface ErshouwupinDao extends BaseMapper<ErshouwupinEntity> {
	
	List<ErshouwupinVO> selectListVO(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
	
	ErshouwupinVO selectVO(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
	
	List<ErshouwupinView> selectListView(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);

	List<ErshouwupinView> selectListView(Pagination page,@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
	
	ErshouwupinView selectView(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
	
}
