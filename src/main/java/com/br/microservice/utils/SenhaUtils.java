package com.br.microservice.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    public static String gerarBCript(String senha) {
        if (null == senha) {
            return null;
        }

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(senha);
    }

    public static boolean validaSenha(String senha, String senhaEncoded) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(senha, senhaEncoded);
    }
}
