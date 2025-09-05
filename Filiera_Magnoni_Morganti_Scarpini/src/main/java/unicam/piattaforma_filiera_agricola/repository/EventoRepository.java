package unicam.piattaforma_filiera_agricola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unicam.piattaforma_filiera_agricola.model.animatore.Evento;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findByCreatoreId(Long creatorId);
}
