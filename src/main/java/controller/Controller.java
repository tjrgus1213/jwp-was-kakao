package controller;

import domain.HttpRequest;
import domain.HttpResponse;
import exception.UnsupportedMethodException;

import java.io.IOException;
import java.net.URISyntaxException;

public interface Controller {
    void service(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException, URISyntaxException, UnsupportedMethodException;
    boolean isSupport(String path);
}

