package prova;

public class Medico extends Funcionario {
 protected String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\n Crm:" + crm + '}';
    }
 
    
    
}
