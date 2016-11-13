package cn.su.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.su.domain.TimeCost;
import cn.su.service.TimeService;

@Controller
public class TimeController {

	@Autowired
	private TimeService timeService;
	
	@Autowired 
	private ServletContext servletContext;
	
	//直接访问页面，后缀名是noo,返回的是${view}.jsp
	@RequestMapping(value = "/{view}.noo", method=RequestMethod.GET)
	public String enter(@PathVariable("view") String view) {
		return view;
	}
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public String save(@RequestParam("time") Long time) {
		int a = timeService.save(time);
		return "hello";
	}
	
	@RequestMapping(value = "/exportXls", method=RequestMethod.GET)
	public void enter(HttpServletResponse response,HttpServletRequest request) {
		List<TimeCost> list = timeService.findAll();
		//创建excel sheet
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		//设置第一行
		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("id");
		row0.createCell(1).setCellValue("所用时长");
		//设置其他行，遍历list
		int i = 1;
		for(TimeCost tc:list) {
			XSSFRow row = sheet.createRow(i);
			row.createCell(0).setCellValue(tc.getId());
			row.createCell(1).setCellValue(tc.getCost());
			i++;
		}
		
		try {
			ServletOutputStream out = response.getOutputStream();
			String filename = "Game_Time.xls";
			String agent = request.getHeader("User-Agent");
			String contextType = servletContext.getMimeType(filename);
			response.setContentType(contextType);
			response.setHeader("content-disposition", "attchment;filename="+filename);
			book.write(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String list(Model model) {
		List<TimeCost> list = timeService.findAll();
		model.addAttribute("list", list);
		return "list";
	}
}
