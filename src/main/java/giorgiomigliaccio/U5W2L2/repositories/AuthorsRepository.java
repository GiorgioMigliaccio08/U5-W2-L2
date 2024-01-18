package giorgiomigliaccio.U5W2L2.repositories;

import giorgiomigliaccio.U5W2L2.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public class AuthorsRepository extends JpaRepository<Autore, Integer> {
    extends JpaRepository<Author, Integer>
}
