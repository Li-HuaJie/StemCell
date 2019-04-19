package com.sc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SiteInformationMapper;

@Service("siteInformationService")
public class SiteInformationService<T> extends BaseService<T> {
	
	@Autowired
	private SiteInformationMapper<T> mapper;
	
	/**
	 * 逻辑修改，state=1解决
	 */
	public void update(Object[] ids) throws Exception{
		for(Object id : ids ){
			getMapper().update((Integer)id);
		}
		super.delete(ids);
	}
	
	/**
	 * 逻辑修改，state=2审核中
	 */
	public void updateAudit(Object[] ids) throws Exception{
		for(Object id : ids ){
			getMapper().update((Integer)id);
		}
		super.delete(ids);
	}
	
	/**
	 * 查询所有内容
	 * @return
	 * @throws Exception
	 */
	public List<T> queryByAll() throws Exception{
		return getMapper().queryByAll();
	}
	
	@Override
	public SiteInformationMapper<T> getMapper() {
		return mapper;
	}

}
