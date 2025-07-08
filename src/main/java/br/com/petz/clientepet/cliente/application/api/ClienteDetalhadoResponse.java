package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;
@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nome;
    private String cpf;
    private String celular;
    private Sexo sexo;
    private String email;
    private boolean aceitaTermos;
    private LocalDate DataCadastro;
}
