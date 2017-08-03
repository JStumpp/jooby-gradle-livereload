package com.mycompany;

import org.jooby.Jooby;
import org.jooby.livereload.LiveReload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class App extends Jooby {

    private final Logger log = LoggerFactory.getLogger(getClass());

    {
        use(new LiveReload());

        get("/", req -> {
            return "Test";
        });
    }

    public static void main(final String[] args) {
        run(App::new, args);
    }
}
