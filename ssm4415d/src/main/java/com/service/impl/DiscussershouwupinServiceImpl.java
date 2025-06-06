package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussershouwupinDao;
import com.entity.DiscussershouwupinEntity;
import com.service.DiscussershouwupinService;
import com.entity.vo.DiscussershouwupinVO;
import com.entity.view.DiscussershouwupinView;

@Service("discussershouwupinService")
public class DiscussershouwupinServiceImpl extends ServiceImpl<DiscussershouwupinDao, DiscussershouwupinEntity> implements DiscussershouwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussershouwupinEntity> page = this.selectPage(
                new Query<DiscussershouwupinEntity>(params).getPage(),
                new EntityWrapper<DiscussershouwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussershouwupinEntity> wrapper) {
		  Page<DiscussershouwupinView> page =new Query<DiscussershouwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussershouwupinVO> selectListVO(Wrapper<DiscussershouwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussershouwupinVO selectVO(Wrapper<DiscussershouwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussershouwupinView> selectListView(Wrapper<DiscussershouwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussershouwupinView selectView(Wrapper<DiscussershouwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
