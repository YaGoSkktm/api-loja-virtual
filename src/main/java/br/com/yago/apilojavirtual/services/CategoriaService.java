package br.com.yago.apilojavirtual.services;

import java.util.Optional;

import br.com.yago.apilojavirtual.domain.Categoria;
import br.com.yago.apilojavirtual.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}