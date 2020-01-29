package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//�⺻ web���� �ۼ��ϴ� ������ ������ ������ �ϴ� Ŭ����
//��Ʈ�ѷ�
//- DispatcherServlet���� ȣ��Ǵ� Ŭ����
//- �������� �ߴ� ��ó�� DAO�� �޼ҵ带 ȣ��
//- ������ ����(spring�� ������)
public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("��Ʈ�ѷ� ��û �Ϸ�");
		
		//���� ������ ���� & ����信 ���� ������ ��� �ִ� spring ��ü
		ModelAndView mav = new ModelAndView();
		
		//���� ������ ����
		// = request.setAttribute("msg", "spring ��Ʈ�ѷ����� �ѱ� ������")
		mav.addObject("msg", "spring ��Ʈ�ѷ����� �ѱ� ������");
		
		//forward�� ���� ������ ����(forward�� default)
		mav.setViewName("test/result");
		
		return mav;
	}

}
