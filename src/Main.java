import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escolha um gênero de filme: ");
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

    }
}
