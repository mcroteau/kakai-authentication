package io.kakai.renderer;

import io.kakai.implement.ViewRenderer;
import io.kakai.model.web.HttpRequest;
import com.sun.net.httpserver.HttpExchange;
import io.kakai.Authorizer;

public class UserRenderer implements ViewRenderer {

    public boolean truthy(HttpRequest httpRequest, HttpExchange exchange){ return true; }

    public String render(HttpRequest httpRequest, HttpExchange exchange){
        return Authorizer.getUser();
    }

    public String getKey() {
        return "sec:user";
    }

    public Boolean isEval() {
        return false;
    }
}