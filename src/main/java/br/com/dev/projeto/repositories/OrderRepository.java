package br.com.dev.projeto.repositories;

import br.com.dev.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {// -> JpaRepository<Tipo da entidade, Tipo do ID>
    // Já existe uma implementação padrão para essa interface
}
