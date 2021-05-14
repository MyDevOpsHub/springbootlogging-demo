package org.arpit.java2blog;

import org.arpit.java2blog.springboot.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldStandaloneApplication implements CommandLineRunner {

    private static final Logger LOGGER=
            LoggerFactory.getLogger(SpringBootHelloWorldStandaloneApplication.class);

    @Autowired
    @Qualifier("country")
    private Country countryBean;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldStandaloneApplication.class, args);
    }

    public void run(String... arg0) throws Exception {

        System.out.println("Country Name: " + countryBean.getCountryName());
        LOGGER.trace("for tracing purpose new");
        LOGGER.debug("for debugging purpose new ");
        LOGGER.info("for informational purpose new ");
        LOGGER.warn("for warning purpose new ");
        LOGGER.error("for logging errors new ");

    }
}
