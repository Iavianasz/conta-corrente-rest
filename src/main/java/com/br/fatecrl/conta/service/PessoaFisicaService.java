package com.br.fatecrl.conta.service;

import com.br.fatecrl.conta.model.PessoaFisica;
import com.br.fatecrl.conta.repository.PessoaFisicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaFisicaService implements IService<PessoaFisica> {
    private PessoaFisicaRepository repository;

    public PessoaFisicaService(){
    }

    @Override
    public List<PessoaFisica> findAll() {
        return repository.findAll();
    }

    @Override
    public PessoaFisica findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PessoaFisica create(PessoaFisica entity) {
        repository.save(entity);
        return entity;
    }

    @Override
    public boolean update(PessoaFisica entity) {
        if (repository.existsById(entity.getId())) {
            repository.save(entity);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
