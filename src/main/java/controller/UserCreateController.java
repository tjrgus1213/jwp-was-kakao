package controller;

import db.DataBase;
import domain.HttpRequest;
import domain.HttpResponse;
import model.User;

import java.io.IOException;

public class UserCreateController extends AbstractController {

    private static final String INDEX_URL = "/index.html";
    private static final String USER_CREATE_URL = "/user/create";

    @Override
    void doGet(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException {
        doPost(httpRequest, httpResponse);
    }

    @Override
    void doPost(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException {
        User user = new User(httpRequest.getParameter("userId"), httpRequest.getParameter("password"), httpRequest.getParameter("name"), httpRequest.getParameter("email"));
        DataBase.addUser(user);
        httpResponse.sendRedirect(INDEX_URL);
    }

    @Override
    public boolean isSupport(String path) {
        return path.equals(USER_CREATE_URL);
    }
}
