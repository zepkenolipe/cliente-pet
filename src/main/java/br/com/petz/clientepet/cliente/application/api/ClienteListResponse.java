package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nome;
    private String cpf;
    private String email;
    private String celular;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }

    private ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.nome = cliente.getNome();
    }
}
