package com.br.fatecrl.conta.repository;

import com.br.fatecrl.conta.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends
        JpaRepository<PessoaJuridica, Long> {
}