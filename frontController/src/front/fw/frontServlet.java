package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정
@WebServlet(name="front", urlPatterns= {"*.do", "*.jsp", "*.html"})
public class frontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 정보를 분석해서 추출 > 어떤 path로 요청할지 아직 모름
		System.out.println("요청 받기");
		System.out.println("request.getContextPath() > " + request.getContextPath());
		System.out.println("request.getRequestURI() > " + request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length());
		System.out.println("path : " + path);
		
		//추출한 요청 path로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업
		//RequestMapping객체에 의뢰 > RequestMapping 객체의 메소드 호출 + 실제 실행할 객체를 찾아서 리턴
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		
		//Action의 메소드 호출
		action.run(request, response);
		
		//run 메소드의 실행결과로 응답 view 찾기
		
		//응답 view로 forward or redirect
		
		//실행 URL(ProductList) : http://localhost:8088/frontController/product/list.do
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
