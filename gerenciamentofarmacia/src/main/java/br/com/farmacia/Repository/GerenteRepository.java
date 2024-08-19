package br.com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.models.Gerente;

public interface GerenteRepository extends JpaRepository<Gerente, Long>{

    // //findById
    // public Gerente findById(String id);
}
