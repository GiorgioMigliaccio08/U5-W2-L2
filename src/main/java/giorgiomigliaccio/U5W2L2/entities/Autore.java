package giorgiomigliaccio.U5W2L2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Autore {

    private long id;
    private String nome;

    private String cogmome;

    private String email;

    private LocalDate dataDiNascita;

}
