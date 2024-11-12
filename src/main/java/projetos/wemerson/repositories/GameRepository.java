package projetos.wemerson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetos.wemerson.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
