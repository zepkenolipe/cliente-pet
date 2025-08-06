package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);

    List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente );

    PetClienteDetalheResponse buscaPetDoClienteComID(UUID idCliente, UUID idPet);

    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);
}
