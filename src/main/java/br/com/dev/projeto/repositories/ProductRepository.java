package br.com.dev.projeto.repositories;

import br.com.dev.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {// -> JpaRepository<Tipo da entidade, Tipo do ID>
    // Já existe uma implementação padrão para essa interface
}
