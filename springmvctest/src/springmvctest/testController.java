package springmvctest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class testController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("gugu", "9 * 1 = 9<br/>9 * 2 = 18");
		mav.setViewName("/WEB-INF/test/result.jsp");
		
		return mav;
	}

}
