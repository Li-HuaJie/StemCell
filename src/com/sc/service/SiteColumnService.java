package com.sc.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SiteColumnMapper;

@Service("siteColumnService")
public class SiteColumnService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(SiteColumnService.class);
	
	/**
	 * 根据站点id查询栏目
	 * @param siteId
	 */
	public List<T> queryBySiteId(Integer siteId){
		return getMapper().queryBySiteId(siteId);
	}
	

	@Autowired
    private SiteColumnMapper<T> mapper;

		
	public SiteColumnMapper<T> getMapper() {
		return mapper;
	}

}
