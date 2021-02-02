package formation.id.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.id.backend.entities.Theme;
import formation.id.backend.services.ThemeService;

@RestController
@RequestMapping("themes")
@CrossOrigin
public class ThemeController {
	@Autowired
	private ThemeService service;
	
	@GetMapping
	public List<Theme> findAll(){
		return this.service.findAll();
	}
	@PostMapping
	public Theme save(@RequestBody Theme entity) {
		return this.service.save(entity);
	}

	@GetMapping("{id}")
	public Theme findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
