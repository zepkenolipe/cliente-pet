package br.com.petz.clientepet.cliente.application.repository;

import br.com.petz.clientepet.cliente.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
