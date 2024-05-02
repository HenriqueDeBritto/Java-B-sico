package edu.henrique.mesum;
public class JavaNomeCompleto {
    public static void main(String[]args){

        String nome = "Leguminoso";
        String segundo_nome = "Prado";

        String nomeCompleto = nomeCompleto(nome, segundo_nome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String nome, String segundo_nome){
    return nome.concat(" ").concat(segundo_nome);
    }
}
