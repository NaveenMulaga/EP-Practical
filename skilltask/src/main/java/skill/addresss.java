package skill;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class addresss
 */
public class addresss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addresss() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String district=request.getParameter("district");
		String state=request.getParameter("state");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		AddressBean ab=new AddressBean();
		ab.setStreet(street);
		ab.setCity(city);
		ab.setDistrict(district);
		ab.setPincode(pincode);
		ab.setState(state);
		HttpSession hs=request.getSession();
		Integer a=(Integer)hs.getAttribute("regno");
		ab.setId(a);
		PrintWriter pw=response.getWriter();
		DetailsDAO da=new DetailsDAO();
		 try { 
			  int i=da.address_insert(ab);
			  if(i>0)
			  {
				  request.getRequestDispatcher("view.jsp").include(request,response);
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
			  e.printStackTrace(); }//sb have details of client
			 
		 }
		 
	}
