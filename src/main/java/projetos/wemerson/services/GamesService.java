package projetos.wemerson.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projetos.wemerson.dto.GameDTO;
import projetos.wemerson.dto.GameMinDTO;
import projetos.wemerson.entities.Game;
import projetos.wemerson.repositories.GameRepository;

@Service
public class GamesService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game resullt = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(resullt);
		return dto;
	}
}
