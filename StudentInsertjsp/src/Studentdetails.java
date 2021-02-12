

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.klu.DAO.StudentDAO;
import com.klu.bean.StudentBean;

/**
 * Servlet implementation class Studentdetails
 */
public class Studentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Studentdetails() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String regno=request.getParameter("regno");
         String name=request.getParameter("name");
         String email=request.getParameter("email");
         String department=request.getParameter("department");
         
         StudentBean sb=new StudentBean();
         sb.setRegno(regno);
         sb.setName(name);
         sb.setEmail(email);
         sb.setDepartment(department);
         
         StudentDAO sdo=new StudentDAO();
         ServletConfig sc=getServletConfig();
         try {
			int i = sdo.StudentInsert(sb,sc.getInitParameter("mysqldriver"),sc.getInitParameter("mysqlurl"),sc.getInitParameter("mysqluser"),sc.getInitParameter("mysqlpassword"));
			
			if(i>0) 
			{
				RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
				request.setAttribute("bean", sb);
				rd.forward(request, response);
			}
			
			else 
			{
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.include(request, response);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
