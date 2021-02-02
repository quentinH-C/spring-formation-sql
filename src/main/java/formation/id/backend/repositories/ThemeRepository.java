package formation.id.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.id.backend.entities.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

	public List<Theme> findByNom(String nom);
}
