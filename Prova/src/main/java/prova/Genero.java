package prova;

public enum Genero {
  MASCULINO ('M', "Masculino"),
  FEMININO ('F', "Feminino");

  private final char caractere;
  private final String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "\n Caractere:" + caractere + 
                "\n Texto:" + texto + '}';
    }

  

  
  
   
    
    
  
  
  
}
