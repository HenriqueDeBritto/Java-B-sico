package edu.henrique.mesum.variaveis;

public class EstudoDeVariaveis {
    public static void main(String[]args){
        boolean numiro = true;
        boolean numirodoi = false;

        System.out.println("Bo dia");
        if (numiro) {
            if(numirodoi){
                System.out.println("ambos são verdadeiros");
            }else{
                System.out.println("numirodoi é falso");
            }
        }else{
            System.out.println("numiro não é verdadeiro");
        }
    }
}
