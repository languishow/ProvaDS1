package prova;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua do fogo", "5", "apartamento 102", "40430560", "Salvador", UnidadeFederativa.BAHIA);
        Juridica juridica = new Juridica("430440800","340", "Gabriel", "71992020375", "gr24903@gmail.com", endereco);
        Cliente cliente = new Cliente(5, LocalDate.of(2005, Month.MARCH, 14), Genero.FEMININO);
        Motoboy motoboy = new Motoboy("2430", "043365789-21", "456789451", "65783", Setor.OPERACOES, 1000);
        Medico medico = new Medico("4030", "093456789-28", "430450660", "83957", Setor.SAUDE, 1200);
        Advogado advogado = new Advogado("5030","049687345-29", "435650750", "56789", Setor.JURIDICO, 1600);
        
        
        System.out.println("Endereco.toString");
        System.out.println("");
        System.out.println("Juridica");
        System.out.println("");
        System.out.println("Cliente");
        System.out.println("");
        System.out.println("Motoboy");
        System.out.println("");
        System.out.println("Medico");
        System.out.println("");
        System.out.println("Advogado");
        }

                
 
       
    }
 
