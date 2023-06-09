package prova;

public enum Setor {
  ENGENHARIA ("Engenharia"),
  SAUDE ("Saude"),
  JURIDICO ("Juridico"),
  OPERACOES ("Operacoes");
  
  private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getSAUDE() {
        return SAUDE;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

    public String getNome() {
        return nome;
    }
  
    
  
    
}
