package io.kakai.negotiator;

import io.kakai.implement.RequestNegotiator;
import io.kakai.model.web.HttpRequest;
import com.sun.net.httpserver.HttpExchange;
import io.kakai.Authorizer;

public class AuthNegotiator implements RequestNegotiator {
    @Override
    public void intercept(HttpRequest request, HttpExchange httpExchange) {
        Authorizer.SAVE(request);
        Authorizer.SAVE(httpExchange);
    }
}
