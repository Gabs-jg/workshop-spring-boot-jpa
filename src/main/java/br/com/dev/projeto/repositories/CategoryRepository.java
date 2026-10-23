package br.com.dev.projeto.repositories;

import br.com.dev.projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {// -> JpaRepository<Tipo da entidade, Tipo do ID>
    // Já existe uma implementação padrão para essa interface
}
