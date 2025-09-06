package unicam.piattaforma_filiera_agricola.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CarrelloRepository extends JpaRepository<Carrello, Integer> {
    Carrello findByUserId(int userId);

    @Modifying
    @Transactional
    @Query("DELETE FROM ElementoCarrello ec WHERE ec.elemento.id = :idElemento")
    void rimuoviElementoDaCarrelli(int idElemento);
}
