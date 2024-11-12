package projetos.wemerson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetos.wemerson.dto.GameMinDTO;
import projetos.wemerson.entities.Game;
import projetos.wemerson.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GamesService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result; 
	}

}
