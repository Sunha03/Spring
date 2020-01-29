package front.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//실제 실행할 클래스의 상위 타입
//RequestMapping 클래스가 실행할 클래스를 찾아서 리턴할 때 필요한 공통의 타입(상위 클래스)
public interface Action {
	void run(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;
}
