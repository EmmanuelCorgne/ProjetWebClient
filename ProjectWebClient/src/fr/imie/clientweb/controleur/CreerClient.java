package fr.imie.clientweb.controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.imie.clientweb.bean.ClientBean;

/**
 * Servlet implementation class CreerClient
 */
@WebServlet("/CreerClient")
public class CreerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<ClientBean> clients=new ArrayList<ClientBean>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreerClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWork(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWork(request, response);
	}

	private void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		ClientBean bean = null;
		

		if (session.isNew()) {
			bean = new ClientBean();
			session.setAttribute("bean", bean);
			request.setAttribute("bean", bean);
			
			request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
		} else {
			bean = (ClientBean) session.getAttribute("bean");
			request.setAttribute("bean", bean);
			request.setAttribute("clients", clients);
			if (bean.getEmail() == null && bean.getMdp() == null) {
				bean.setEmail(request.getParameter("email"));
				bean.setMdp(request.getParameter("mdp"));
			}
		
			if (bean.isConnecter(request.getParameter("email"), request.getParameter("mdp"))) {
				if (request.getParameter("nom") != null) {
					bean.setNom(request.getParameter("nom"));
					bean.setPrenom(request.getParameter("prenom"));

					bean.setTelephone(request.getParameter("telephone"));
					bean.setEmail(request.getParameter("email"));
					bean.setMdp(request.getParameter("mdp"));
					
					clients.add(bean);
					
					if(clients.size()==2)
						request.getRequestDispatcher("ResultatForm.jsp").forward(request, response);
					else request.getRequestDispatcher("ClientForm.jsp").forward(request, response);

				}else request.getRequestDispatcher("ClientForm.jsp").forward(request, response);
				
			}
		
		}
	}

}
