import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Bem vindo(a) ao nosso Indicador de Filmes\n");
        String cont= " ";
        while (cont !="sair" || cont=="sim"){
            Scanner sc= new Scanner(System.in);
            System.out.printf("Escolha um gênero de filme: \n1-açao \n2-aventura \n3-ficçao cientifica \n4-drama \n5-romance \n6-comedia \n7-terror ");
            String resposta=sc.next().trim().toLowerCase();
            if (resposta.equals("1")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("açao");
                arvore.percorrer();
            } else if (resposta.equals("2")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("aventura");
                arvore.percorrer();
            } else if (resposta.equals("3")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("ficçao cientifica");
                arvore.percorrer();
            } else if (resposta.equals("4")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("drama");
                arvore.percorrer();
            } else if (resposta.equals("5")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("romance");
                arvore.percorrer();
            } else if (resposta.equals("6")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("comedia");
                arvore.percorrer();
            } else if (resposta.equals("7")) {
                ArvoreDecisaoFilmes arvore = new ArvoreDecisaoFilmes("terror");
                arvore.percorrer();
            } else {
                System.out.println("ERRO! valor inválido!");
            }
            System.out.print("Deseja outra recomendação de filme:  (Sim/Não)");
            cont= sc.next().trim();
        }
        }

        }












































