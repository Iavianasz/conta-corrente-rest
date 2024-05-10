package com.br.fatecrl.conta.service;
import com.br.fatecrl.conta.model.PessoaJuridica;

import com.br.fatecrl.conta.repository.PessoaJuridicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaJuridicaService implements IService<PessoaJuridica> {
    private PessoaJuridicaRepository repository;

    public PessoaJuridicaService(){
    }

    @Override
    public List<PessoaJuridica> findAll() {
        return repository.findAll();
    }

    @Override
    public PessoaJuridica findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PessoaJuridica create(PessoaJuridica entity) {
        repository.save(entity);
        return entity;
    }

    @Override
    public boolean update(PessoaJuridica entity) {
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
