public class ArvoreDecisaoFilmes {
    static class No {
        String conteudo;
        String[] filmes;
        No sim;
        No nao;

        No(String conteudoNo) {
            this.conteudo=conteudoNo;
            this.sim=null;
            this.nao=null;
        }

        No(String[] filmes){
            this.filmes=filmes;
            this.sim=null;
            this.nao=null;
        }
    }

    private No raiz;

    public ArvoreDecisaoFilmes() {
        construirArvore();
    }

    private void construirArvore() {
        raiz= new No("Você gosta de filmes de ação?");

        raiz.sim= new No("Você prefere filmes com heróis?");
        raiz.sim.sim= new No("Prefere mais sérios?");
        raiz.sim.sim.sim= new No(new String[]{"filme 1", "filme 2", "filme 3"});
    }

}
