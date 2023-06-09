package prova;

public enum UnidadeFederativa {
  BAHIA ("Bahia", "BA"),
  SAO_PAULO ("Sao_Paulo", "SP"),
  RIO_DE_JANEIRO ("Rio_De_Janeiro", "RJ");
  
  private final String nome;
  private final String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
          
    
}
