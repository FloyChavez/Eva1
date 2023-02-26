package svl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import dao.PeliculaDAO;

	public class svlPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlPelicula() {
        super();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		
		Object id = request.getParameter("id"); 
		Object idPelicula = request.getParameter("idPelicula"); 
		dao.PeliculaDAO daopelicula=new dao.PeliculaDAO();
		
		if (id != null  && (id.equals("1") || id.equals("2"))) {
			String [][] mPeliculas = daopelicula.getPeliculas(id);
			session.setAttribute("id", mPeliculas==null ? null : id);
			session.setAttribute("mPeliculas", mPeliculas);
		}
		if (idPelicula != null ) {
			
			String [] aPelicula = daopelicula.getPelicula(idPelicula);
			session.setAttribute("id", aPelicula==null ? null : "3");
			session.setAttribute("aPelicula", aPelicula);
		}
		response.sendRedirect("index.jsp");
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}