package prova;

import java.time.LocalDate;

public class Cliente extends Fisica {
    protected int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero) {
        super(dataNascimento, genero);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

 
    @Override
    public String toString() {
        return "\n + protocoloAtendimento:" + protocoloAtendimento + '}';
    }

   


    }
    
