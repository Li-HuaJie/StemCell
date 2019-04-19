package com.sc.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.bean.SiteInformation;
import com.sc.model.SiteInformationModel;
import com.sc.service.SiteInformationService;

@Controller
@RequestMapping("/siteInformation")
public class SiteInformationAction extends BaseAction {

	@Autowired
	private SiteInformationService<SiteInformation> siteInService;
	
	@RequestMapping("/list")
	public ModelAndView list(SiteInformationModel model,HttpServletRequest request) throws Exception{
		Map<String,Object>  context = getRootMap();
		return forword("siteMain/siteInformation",context); 
	}
	
	/**
	 * state=1解决
	 * @param id
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/update")
	public void update(Integer[] id,HttpServletResponse response) throws Exception{
		siteInService.update(id);
		sendSuccessMessage(response, "修改成功");
	}
	
	/**
	 * state=2审核
	 * @param id
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/updateAudit")
	public void updateAudit(Integer[] id,HttpServletResponse response) throws Exception{
		siteInService.updateAudit(id);
		sendSuccessMessage(response,"修改成功");
	}
	
}
