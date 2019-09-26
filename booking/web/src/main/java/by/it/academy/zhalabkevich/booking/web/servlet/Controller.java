package by.it.academy.zhalabkevich.booking.web.servlet;

import by.it.academy.zhalabkevich.booking.service.command.Command;
import by.it.academy.zhalabkevich.booking.service.command.CommandProvider;
import by.it.academy.zhalabkevich.booking.web.RequestParameterName;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final CommandProvider provider = CommandProvider.getInstance();
    public Controller() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String commandName;
        Command command;
        String page = null;

        commandName = request.getParameter(RequestParameterName.REQ_PARAM_COMMAND_NAME);
        command = provider.getCommand(commandName);

        command.execute(request, response);
    }
}
