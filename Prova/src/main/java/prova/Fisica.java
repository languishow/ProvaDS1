package prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Fisica {
   protected LocalDate dataNascimento;
   protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero) {
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

   public int getIdade() {
     return Period.between(dataNascimento,LocalDate.now()).getYears();
   } 
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n Data de Nascimento:" + dataNascimento +
                "\n Genero:" + genero + '}';
    }
   
}
