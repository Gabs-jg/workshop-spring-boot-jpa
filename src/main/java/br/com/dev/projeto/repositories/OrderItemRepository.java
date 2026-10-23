package br.com.dev.projeto.repositories;

import br.com.dev.projeto.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {// -> JpaRepository<Tipo da entidade, Tipo do ID>
    // Já existe uma implementação padrão para essa interface
}
