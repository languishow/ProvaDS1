package prova;

public class Advogado extends Funcionario {
  protected String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return 
            "\n Oab:" + oab + '}';
    }
  
    
    
}
