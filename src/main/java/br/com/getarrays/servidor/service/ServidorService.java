package br.com.getarrays.servidor.service;

import br.com.getarrays.servidor.model.Servidor;

import java.util.Collection;

public interface ServidorService {
    Servidor criarServidor(Servidor servidor);
    Servidor ping(String enderecoDeIp);
    Collection<Servidor> listarServidores(int qtdDeServidores);
    Servidor pegarServidor(Long id);
    Servidor atualizarServidor(Servidor servidor);
    Boolean deletarServidor(Long id);
}
