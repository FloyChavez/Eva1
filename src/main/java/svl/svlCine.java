package svl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import bean.Cine;
import dao.CineDAO;

	public class svlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlCine() {
        super();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		dao.CineDAO daocine=new dao.CineDAO();
		
		Object idCine = request.getParameter("idCine");
		
		if(idCine == null) {
			/* Array
			String [][] mCines =daocine.getVerCines();
			session.setAttribute("id",mCines== null ? null : "3");
			session.setAttribute("mCines",mCines);
			*/
			
			List<Cine>lstCine =daocine.getCinesList();
			session.setAttribute("id",lstCine== null ? null : "3");
			session.setAttribute("lstCine",lstCine);
			
			
		}else {
			/*Array
			String[] aCine = daocine.getVerCine(idCine);
			session.setAttribute("id",aCine == null ? null : "4");
			session.setAttribute("aCine",aCine);
			session.setAttribute("mTarifas",daocine.getCineTarifas(idCine));
			session.setAttribute("mPeliculas",daocine.getCinePeliculas(idCine));
			*/
			Cine Cine = daocine.getCineList(idCine);
			session.setAttribute("id",Cine == null ? null : "4");
			session.setAttribute("Cine",Cine);
			session.setAttribute("lstCineTarifa",daocine.getCineTarifasList(idCine));
			session.setAttribute("lstCinePelicula",daocine.getCinePeliculasList(idCine));
			
		}
		response.sendRedirect("index.jsp");
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

