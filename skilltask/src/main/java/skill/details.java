package skill;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class details
 */
public class details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      int id=Integer.parseInt(request.getParameter("regno"));
	      String name=request.getParameter("name");
	      String email=request.getParameter("email");
	      StudentBean rb1=new StudentBean();
	      rb1.setId(id);
	      rb1.setName(name);
	      rb1.setEmail(email);
	      DetailsDAO da=new DetailsDAO();
		  try { 
			  int i=da.insert(rb1);
			  if(i>0)
			  {
				  request.getRequestDispatcher("address.html").include(request,response);
				  HttpSession hs = request.getSession();
				  hs.setAttribute("regno",id);
				 
			  } 
			  else{ 
				  RequestDispatcher rd1=request.getRequestDispatcher("error.html");
				  rd1.include(request, response); 
				  } 
		 } 
		 catch (ClassNotFoundException e) 
		  { // TODO Auto-generated catch block 
			 e.printStackTrace();
			 
		  } 
		  catch (SQLException e)
		  { //TODO Auto-generated catch block 
			  e.printStackTrace();
		 }//sb have details of client
			 
		 catch (NumberFormatException e)
		  { //TODO Auto-generated catch block 
			  e.printStackTrace(); }//sb have details of client
			 
		 }
}
