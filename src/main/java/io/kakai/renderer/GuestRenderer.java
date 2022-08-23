package io.kakai.renderer;

import io.kakai.Authorizer;
import io.kakai.implement.ViewRenderer;
import io.kakai.model.web.HttpRequest;
import com.sun.net.httpserver.HttpExchange;

public class GuestRenderer implements ViewRenderer {

    public boolean truthy(HttpRequest httpRequest, HttpExchange exchange){
        return !Authorizer.isAuthenticated();
    }

    public String render(HttpRequest httpRequest, HttpExchange exchange){
        return "";
    }

    public String getKey() { return "sec:guest"; }

    public Boolean isEval() {
        return false;
    }
}
