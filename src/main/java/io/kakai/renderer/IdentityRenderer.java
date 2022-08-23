package io.kakai.renderer;

import io.kakai.Authorizer;
import io.kakai.implement.ViewRenderer;
import io.kakai.model.web.HttpRequest;
import com.sun.net.httpserver.HttpExchange;

public class IdentityRenderer implements ViewRenderer {

    public boolean truthy(HttpRequest httpRequest, HttpExchange exchange){
        return true;
    }

    public String render(HttpRequest httpRequest, HttpExchange exchange){
        return Authorizer.get("userId");
    }

    public String getKey() {
        return "sec:id";
    }

    public Boolean isEval() {
        return false;
    }
}
