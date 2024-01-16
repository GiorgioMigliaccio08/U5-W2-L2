package giorgiomigliaccio.U5W2L2.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Blog {
    private long id;
    private String categoria;

    private String titolo;

    private String contenuto;

    private int tempoDiLettura ;
}
