package by.it.academy.zhalabkevich.booking.service.command.Impl;

import by.it.academy.zhalabkevich.booking.service.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoSuchCommand implements Command {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
}
