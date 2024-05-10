package com.br.fatecrl.conta.repository;

import com.br.fatecrl.conta.model.PessoaFisica;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends
        JpaRepository<PessoaFisica, Long>{}

