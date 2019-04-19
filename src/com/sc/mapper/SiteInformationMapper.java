package com.sc.mapper;

import java.util.List;

public interface SiteInformationMapper<T> extends BaseMapper<T> {

	/**
	 * 逻辑修改，state=1解决
	 */
	public void update(Integer id);
	
	/**
	 * 逻辑修改，state=2审核中
	 */
	public void updateAudit(Integer id);
	
	/**
	 * 查询所有内容
	 * @return
	 */
	public List<T> queryByAll();
	
}
