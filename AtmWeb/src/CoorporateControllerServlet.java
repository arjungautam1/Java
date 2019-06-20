
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoorporateControllerServlet
 */
public class CoorporateControllerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		System.out.println("username and password"+username+" "+ password);
	}
}
