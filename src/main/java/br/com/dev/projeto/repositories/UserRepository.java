package br.com.dev.projeto.repositories;

import br.com.dev.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {// -> JpaRepository<Tipo da entidade, Tipo do ID>
    // Já existe uma implementação padrão para essa interface
}
