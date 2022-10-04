package controller;

import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Client;

@WebServlet("/login")
public class LoginServerlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			String email = request.getParameter("email");
			System.out.println(email);
			String senha = request.getParameter("password");
			String pagina = "";
			
			Client user = this.buscarUsuario(email, senha);
			if(user != null) {
				request.getSession().setAttribute("Usuario", user);
				pagina = "/Successfull.jsp";
			}
			else {
				pagina = "/erro.jsp";
				request.setAttribute("ErroMSG", "Usuario ou senha inv�lida");
			}
			
			RequestDispatcher dispatecher = getServletContext().getRequestDispatcher(pagina); 
			dispatecher.forward(request, response);
			
			
		}
		catch (Exception e) {
			System.out.println("Erro ao chamar login servlet: " + e.getMessage());
		}
		
	}
	
	private Client buscarUsuario(String email, String senha) {
		if(email.equals("gulliver@traveller.com") && senha.equals("123456")) {
			Client result = new Client();
			result.setNome("Gulliver Traveller");
			result.setEmail("gulliver@traveller.com");
			result.setFoto(".\\assets\\images\\user.png");
			result.setNascimento(LocalDate.of(1984, 3, 1));
			result.setSenha("123456");
			result.setNivel("A");
			result.setGenero("1");
			
			/*Cidade cidade = new Cidade();
			cidade.setCidade("S�o Paulo");
			cidade.setEstado("SP");
			cidade.setPais("Brasil");
			
			result.setCidade(cidade);*/
			
			return result;
		}
		else {
			return null;
		}
			
	}

}
