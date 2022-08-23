package io.kakai.renderer;

import io.kakai.implement.ViewRenderer;
import io.kakai.model.web.HttpRequest;
import com.sun.net.httpserver.HttpExchange;
import io.kakai.Authorizer;

public class AuthenticatedRenderer implements ViewRenderer {

    public boolean truthy(HttpRequest httpRequest, HttpExchange exchange){
        return Authorizer.isAuthenticated();
    }

    public String render(HttpRequest httpRequest, HttpExchange exchange){
        return "";
    }

    public String getKey() {
        return "sec:authenticated";
    }

    public Boolean isEval() {
        return true;
    }
}
