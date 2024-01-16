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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCogmome() {
        return cogmome;
    }

    public void setCogmome(String cogmome) {
        this.cogmome = cogmome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Autore(String nome, String cogmome, String email, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cogmome = cogmome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cogmome='" + cogmome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
