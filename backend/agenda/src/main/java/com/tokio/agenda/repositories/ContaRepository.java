package com.tokio.agenda.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tokio.agenda.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

	Optional<Conta> findByNumero(String string);

}