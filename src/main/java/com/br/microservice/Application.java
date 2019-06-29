package com.br.microservice;

import com.br.microservice.utils.SenhaUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        System.out.println(SenhaUtils.gerarBCript("$2a$10$NCYZV.u2EI7KuimjvGdGT.GMAFeTCtqEq2tVM1VA2f3NqMTGYGXqa"));
        System.out.println(SenhaUtils.validaSenha("$2a$10$NCYZV.u2EI7KuimjvGdGT.GMAFeTCtqEq2tVM1VA2f3NqMTGYGXqa", "$2a$10$k2jpuTrf8pa7ro17fjGgWewcTtHLqoTbiPBdQe4ngAwJtDk6id.P2"));
    }
}
