package com.github.pahangkrisdyan;

import jakarta.enterprise.inject.literal.NamedLiteral;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.util.TypeLiteral;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.function.Supplier;

@Path("/test")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@RestQuery String v) {
        return "Hello from RESTEasy Reactive. " + CDI.current().select(new TypeLiteral<Supplier<String>>() {}, NamedLiteral.of(v + "-dummy-dependency")).get().get();
    }
}
