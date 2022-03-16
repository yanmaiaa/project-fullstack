package br.com.getarrays.servidor.service.implementacao;

import br.com.getarrays.servidor.enumeracao.Status;
import br.com.getarrays.servidor.model.Servidor;
import br.com.getarrays.servidor.repositorio.ServidorRepo;
import br.com.getarrays.servidor.service.ServidorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;

import static br.com.getarrays.servidor.enumeracao.Status.SERVIDOR_OFF;
import static br.com.getarrays.servidor.enumeracao.Status.SERVIDOR_ON;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServidorServiceImpl implements ServidorService {

    private final ServidorRepo servidorRepo;

    @Override
    public Servidor criarServidor(Servidor servidor) {
        log.info("Salvando novo servidor: {}",servidor.getNomeDoServidor());
        servidor.setNomeDoServidor(setUrlImagemDoServidor());
        return servidorRepo.save(servidor);
    }

    @Override
    public Servidor ping(String enderecoDeIp) throws IOException {
        log.info("Pinging no servidor IP: {}", enderecoDeIp);
        Servidor servidor = servidorRepo.procurarPorEnderecoDeIp(enderecoDeIp);
        InetAddress endereco = InetAddress.getByName(enderecoDeIp);
        servidor.setStatus(endereco.isReachable(10000) ? SERVIDOR_ON : SERVIDOR_OFF);
        servidorRepo.save(servidor);
        return servidor;
    }

    @Override
    public Collection<Servidor> listarServidores(int qtdDeServidores) {
        log.info("Buscando servidores");
        return servidorRepo.findAll(PageRequest.of(0,qtdDeServidores)).toList();
    }

    @Override
    public Servidor pegarServidor(Long id) {
        return null;
    }

    @Override
    public Servidor atualizarServidor(Servidor servidor) {
        return null;
    }

    @Override
    public Boolean deletarServidor(Long id) {
        return null;
    }

    private String setUrlImagemDoServidor() {
        return null;
    }
}
