package br.com.yago.apilojavirtual.services;

import br.com.yago.apilojavirtual.domain.Pedido;
import br.com.yago.apilojavirtual.repositories.PedidoRepository;
import br.com.yago.apilojavirtual.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}