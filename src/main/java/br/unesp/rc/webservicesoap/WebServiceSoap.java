package br.unesp.rc.webservicesoap;

import br.unesp.rc.webservicesoap.entity.Fisica;
import br.unesp.rc.webservicesoap.utils.InstanceGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebServiceSoap implements CommandLineRunner {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(WebServiceSoap.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Fisica entity = InstanceGenerator.getPessoaFisica("111.222.333-44", "user1");
        System.out.println("\n" + entity + "\n");
    }
}
