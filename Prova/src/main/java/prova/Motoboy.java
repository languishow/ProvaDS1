package prova;

public class Motoboy extends Funcionario {
    protected String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\n cnh:" + cnh + '}';
    }
    
    
    
    
    
}
