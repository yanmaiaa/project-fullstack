package br.com.getarrays.servidor.repositorio;

import br.com.getarrays.servidor.model.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServidorRepo extends JpaRepository<Servidor, Long> {
    Servidor procurarPorEnderecoDeIp(String enderecoDeIp);

}
