package br.com.getarrays.servidor.service.implementacao;

import br.com.getarrays.servidor.model.Servidor;
import br.com.getarrays.servidor.repositorio.ServidorRepo;
import br.com.getarrays.servidor.service.ServidorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

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
    public Servidor ping(String enderecoDeIp) {
        return null;
    }

    @Override
    public Collection<Servidor> listarServidores(int qtdDeServidores) {
        return null;
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
