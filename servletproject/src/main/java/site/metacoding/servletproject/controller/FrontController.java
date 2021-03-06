package site.metacoding.servletproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http 프로토콜 버전 (GET)
// http 1.0 프로토콜 (GET, POST)
// http 1.1 프로토콜 (GET(주소요청), POST(폼태그), DELETE(자바스크립트), PUT(자바스크립트)) (현재 사용되는 버전)

// http://localhost:80/front
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		System.out.println("나 메모리에 떴어 : FrontController");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("front 컨트롤러로 요청들어옴.");

		// 공통로직 처리!!

		// 1. 라우터 만들기
		String path = request.getParameter("path");
		System.out.println("path : " + path);

		if (path.equals("login")) {
			response.sendRedirect("/login.jsp");
			
			// 로그인페이지를 응답
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>LoginPage</h1>");
//			out.println("</body>");
//			out.println("</html>");

		} else if (path.equals("join")) {
			response.sendRedirect("/join.jsp");
			
			// 브라우저에 있는 코드를 바꿀 수 없음. (톰켓이 차단)
			response.setHeader("Status Code", "555");
			// 변경을 할 수 있으나 나중에 배울예정.
			response.setHeader("hello", "555");
			
			// 조인페이지를 응답
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>JoinPage</h1>");
//			out.println("</body>");
//			out.println("</html>");
		}
	}

}
