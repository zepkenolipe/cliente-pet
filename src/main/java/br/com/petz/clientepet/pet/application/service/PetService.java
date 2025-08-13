package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);

    List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente);

    PetClienteDetalheResponse buscaPetDoClienteComID(UUID idCliente, UUID idPet);

    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);

    void alteraPetDoClienteComId(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
