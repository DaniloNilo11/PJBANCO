package com.example.demo;

import java.util.List;

/**
 * LeituraRetorno
 */
public interface LeituraRetorno {

    List<Boleto> lerArquivo(String nomeArquivo);
}