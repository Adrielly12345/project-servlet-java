package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Cidade;
import org.example.model.Estado;
import org.example.model.Pessoa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OlaIfamServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Obter o valor dp parametro
        String parametroNome = req.getParameter("nome");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Estado estado = new Estado();
        estado.setNome("Amazonas");
        estado.setSigla("AM");

        Cidade cidade = new Cidade();
        cidade.setNome("Manaus");
        cidade.setEstado(estado);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Adrielly");
        pessoa1.setTelefone("9936-2653");
        pessoa1.setEmail("adrielly@gmail.com");
        pessoa1.setCidade(cidade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setTelefone("9936-2653");
        pessoa2.setEmail("maria@gmail.com");
        pessoa2.setCidade(cidade);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Joao");
        pessoa3.setTelefone("9936-2653");
        pessoa3.setEmail("joao@gmail.com");
        pessoa3.setCidade(cidade);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);


        PrintWriter saida = resp.getWriter();

        saida.println("<!DOCTYPE html> ");
        saida.println("<html lang=\"pt-br\">");
        saida.println("<head>");
        saida.println("<meta charset=\"UTF-8\">");
        saida.println("<tittle>Ola Ifam!</tittle> ");
        saida.println("</head>");
        saida.println("<body>");
        saida.println("<h1> Ola IFAM!</h1> ");
        saida.println("<h2>Pessoa</h2> ");


        //TAREFA PRA CASA: criar filtro do email, telefone, cidade e estado
        saida.println("<form method='get' action= 'olaifam'>");
        saida.println("     <label for='filtroNome'>Nome: </label>");
        saida.println("     <input type='text' id='filtroNome' name='nome' value=''>");
        saida.println("     <br><br>");
        saida.println("     <button type='submit'>Pesquisar</button");
        saida.println("</form>");
        saida.println("<br>");

        saida.println("<table border='1'>"); //alterei
        saida.println("<thead>");
        saida.println("<tr>");

        saida.println("<th>Nome</th>"); //contrução das colunas
        saida.println("<th>Email</th>");
        saida.println("<th>Telefone</th>");
        saida.println("<th>Cidade</th>");
        saida.println("<th>Estado</th>");

        for(Pessoa p:pessoas){

            if(p.getNome().toLowerCase().contains(parametroNome.toLowerCase())){
                saida.println("<tr>");
                saida.println("<td>" +p.getNome()+"</td>");
                saida.println("<td>" + p.getEmail()+"</td>");
                saida.println("<td>" + p.getTelefone()+"</td>");
                saida.println("<td>" +p.getCidade().getNome()+"</td>");
                saida.println("<td>" +p.getCidade().getEstado().getNome()+"</td>");
                saida.println("</tr>");
            }

        }

       /*
        saida.println("</tr>");
        saida.println("</thead>");

        saida.println("<tbody>");
        saida.println("<tr>");


        saida.println("<td>" + pessoa.getNome()+"</td>");
        saida.println("<td>" + pessoa.getEmail()+"</td>");
        saida.println("<td>" + pessoa.getTelefone()+"</td>");
        saida.println("<td>" +pessoa.getCidade().getNome()+"</td>");
        saida.println("<td>" +pessoa.getCidade().getEstado().getNome()+"</td>");
*/

        saida.println("</table>");
        saida.println("</body>");
        saida.println("</html>");
    }
}
