import java.util.Arrays;
import java.util.Scanner;

public class ArvoreDecisaoFilmes {
    static class No {
        String conteudo;
        String[] filmes;
        No um;
        No dois;

        No(String conteudoNo) {
            this.conteudo=conteudoNo;
            this.um=null;
            this.dois=null;
        }

        No(String[] filmes){
            this.filmes=filmes;
            this.um=null;
            this.dois=null;
        }
    }

    public No raiz;

    public ArvoreDecisaoFilmes(String genero) {
        construirArvoreAcao(genero);
    }

    private void construirArvoreAcao(String genero) {
        if (genero.equals("açao")){
            //camada 1:
            raiz= new No("Você prefere filmes de ação mais realistas ou com elementos de fantasia?");

            //camada 2:
            raiz.um= new No("Você gosta de tramas militares ou urbanas?");
            raiz.dois= new No("Você prefere super-heróis ou universos de ficção científica?");
            //fim camada 2

            //camada 3:
            raiz.um.um= new No("Você gosta de histórias centradas em equipes (tipo Esquadrão) ou em um protagonista só?");
            raiz.um.dois= new No("Prefere ação policial ou suspense com perseguições?");

            raiz.dois.um= new No("Prefere histórias mais sérias ou com humor e leveza?");
            raiz.dois.dois= new No("Você curte ação espacial ou tecnologia futurista na Terra?");
            //fim camada 3

            //camada 4:
            raiz.um.um.um = new No(new String[] {"Os Mercenários", "Tropa de Elite 2", "12 Heróis"});
            raiz.um.um.dois = new No(new String[]{"Sniper Americano","Rambo", "Invasão ao Servidor"});

            // Realistas -> Urbanos
            raiz.um.dois.um = new No(new String[]{"Duro de Matar", "Busca Implacável", "Velocidade Máxima"});
            raiz.um.dois.dois = new No(new String[]{"Velozes e Furiosos", "Drive", "Em Ritmo de Fuga"});

            // Fantasia -> Heróis
            raiz.dois.um.um = new No(new String[]{"O Cavaleiro das Trevas", "Watchmen", "Batman Begins"});
            raiz.dois.um.dois = new No(new String[]{"Homem-Aranha: De Volta ao Lar", "Guardiões da Galáxia", "Deadpool"});

            // Fantasia -> Ficção científica
            raiz.dois.dois.um = new No(new String[]{"Guardiões da Galáxia", "Star Wars", "Duna"});
            raiz.dois.dois.dois = new No(new String[]{"Matrix", "Looper", "Minority Report"});
            //fim camada 4

        } else if (genero.equals("aventura")) {
            //camada 1:
            raiz = new No("Você prefere aventuras em mundos reais ou em mundos de fantasia?");

            //camada 2:
            raiz.um = new No("Você gosta de histórias de exploração (selvas, ruínas, viagens)?");
            raiz.dois = new No("Você prefere mundos de fantasia épicos ou mágicos mais leves?");
            //fim camada 2

            //camada 3:
            // Reais
            raiz.um.um = new No("Prefere aventuras arqueológicas ou de sobrevivência?");
            raiz.um.dois = new No("Prefere filmes com foco em jornadas de viagem ou em ação e perseguição?");

            // Fantasia
            raiz.dois.um = new No("Você prefere histórias com criaturas míticas ou com guerras e reinos?");
            raiz.dois.dois = new No("Prefere filmes com foco em magia e leveza ou em heróis em busca de algo?");
            //fim camada 3

            //camada 4:
            // Reais -> Exploração -> Arqueológicas / Sobrevivência
            raiz.um.um.um = new No("Recomendo: Indiana Jones, A Lenda do Tesouro Perdido, Tomb Raider");
            raiz.um.um.dois = new No("Recomendo: Náufrago, O Regresso, Everest");

            // Reais -> Viagem / Ação
            raiz.um.dois.um = new No("Recomendo: Viagem ao Centro da Terra, Piratas do Caribe, A Ilha Misteriosa");
            raiz.um.dois.dois = new No("Recomendo: King Kong, Jumanji, Jurassic Park");

            // Fantasia -> Épicos / Criaturas
            raiz.dois.um.um = new No(new String[]{"O Senhor dos Anéis", "O Hobbit", "As Crônicas de Nárnia"});
            raiz.dois.um.dois = new No(new String[]{"Warcraft", "Coração de Dragão", "A Bússola de Ouro"});

            // Fantasia -> Leves / Heróis
            raiz.dois.dois.um = new No(new String[]{"Stardust", "O Lar das Crianças Peculiares", "A Princesa Prometida"});
            raiz.dois.dois.dois = new No(new String[]{"Percy Jackson", "As Aventuras de Pi", "Príncipe da Pérsia"});
            //fim camada 4
        } else if (genero.equals("ficçao cientifica")) {
            //camada 1:
            raiz = new No("Você prefere histórias ambientadas no espaço ou em um futuro tecnológico na Terra?");

            //camada 2:
            raiz.um = new No("Você gosta de tramas com foco em exploração espacial ou em batalhas interplanetárias?");
            raiz.dois = new No("Você prefere futuros distópicos ou com avanços tecnológicos e inteligência artificial?");
            //fim camada 2

            //camada 3:
            // Espaço
            raiz.um.um = new No("Prefere histórias mais filosóficas ou com ação intensa?");
            raiz.um.dois = new No("Prefere universos de guerra entre espécies ou missões científicas em planetas distantes?");

            // Terra futurista
            raiz.dois.um = new No("Você gosta de histórias sobre controle social e governos opressivos?");
            raiz.dois.dois = new No("Prefere narrativas sobre robôs e IA ou sobre realidades virtuais e simulações?");
            //fim camada 3

            //camada 4:
            // Espaço -> Exploração / Batalhas
            raiz.um.um.um = new No(new String[]{"Interestelar", "2001: Uma Odisseia no Espaço", "Ad Astra"});
            raiz.um.um.dois = new No(new String[]{"Star Wars, Guardiões da Galáxia, Duna"});

            // Espaço -> Guerras / Missões
            raiz.um.dois.um = new No(new String[]{"Star Trek", "Starship Troopers", "O Quinto Elemento"});
            raiz.um.dois.dois = new No(new String[]{"Perdido em Marte", "Gravidade", "Moon"});

            // Terra -> Distopia / IA
            raiz.dois.um.um = new No(new String[]{"Blade Runner 2049", "Matrix", "Ghost in the Shell"});
            raiz.dois.um.dois = new No(new String[]{"O Doador de Memórias", "Jogos Vorazes", "Divergente"});

            // Terra -> Robôs / Realidade virtual
            raiz.dois.dois.um = new No(new String[]{"Ex Machina", "Eu", "Robô", "Her"});
            raiz.dois.dois.dois = new No(new String[]{"Matrix", "Jogador Nº 1", "Inception"});
            //fim camada 4
        } else if (genero.equals("drama")) {
            //camada 1:
            raiz = new No("Você prefere dramas baseados em histórias reais ou histórias totalmente fictícias?");

            //camada 2:
            raiz.um = new No("Você gosta de histórias de superação pessoal ou sobre problemas sociais?");
            raiz.dois = new No("Você prefere dramas românticos ou psicológicos?");
            //fim camada 2

            //camada 3:
            // Baseados em fatos reais
            raiz.um.um = new No("Prefere histórias inspiradoras ou tristes e reflexivas?");
            raiz.um.dois = new No("Prefere histórias sobre injustiça e desigualdade ou sobre transformação social?");

            // Fictícios
            raiz.dois.um = new No("Prefere romances intensos ou dramas leves sobre relacionamentos?");
            raiz.dois.dois = new No("Prefere dramas mentais profundos ou suspense psicológico?");
            //fim camada 3

            //camada 4:
            // Fatos reais -> Superação / Sociais
            raiz.um.um.um = new No(new String[]{"À Procura da Felicidade", "O Impossível", "Nasce uma Estrela"});
            raiz.um.um.dois = new No(new String[]{"A Lista de Schindler", "Menina de Ouro", "O Pianista"});

            raiz.um.dois.um = new No(new String[]{"Estrelas Além do Tempo", "12 Anos de Escravidão", "Erin Brockovich"});
            raiz.um.dois.dois = new No(new String[]{"Clube de Compras Dallas, Invictus, Spotlight"});

            // Fictícios -> Românticos / Psicológicos
            raiz.dois.um.um = new No(new String[]{"Diário de uma Paixão", "Orgulho e Preconceito", "P.S. Eu Te Amo"});
            raiz.dois.um.dois = new No(new String[]{"Questão de Tempo", "Her", "500 Dias com Ela"});

            raiz.dois.dois.um = new No(new String[]{"Cisne Negro", "Réquiem para um Sonho", "O Show de Truman"});
            raiz.dois.dois.dois = new No(new String[]{"Ilha do Medo", "O Sexto Sentido", "Garota Exemplar"});
            //fim camada 4
        } else if (genero.equals("romance")) {
            //camada 1:
            raiz = new No("Você prefere romances leves e divertidos ou intensos e emocionais?");

            //camada 2:
            raiz.um = new No("Você gosta de romances contemporâneos ou de época?");
            raiz.dois = new No("Você prefere histórias com finais felizes ou trágicos?");
            //fim camada 2

            //camada 3:
            // Romances leves
            raiz.um.um = new No("Prefere histórias urbanas modernas ou ambientadas em pequenas cidades?");
            raiz.um.dois = new No("Prefere histórias de época clássicas ou com toque de comédia?");

            // Romances intensos
            raiz.dois.um = new No("Prefere histórias de amor proibido ou reencontros e segundas chances?");
            raiz.dois.dois = new No("Prefere dramas românticos realistas ou romances com elementos fantásticos?");
            //fim camada 3

            //camada 4:
            // Leves
            raiz.um.um.um = new No(new String[]{"Simplesmente Acontece", "O Plano Imperfeito", "Amor com Data Marcada"});
            raiz.um.um.dois = new No(new String[]{"Cartas para Julieta", "O Melhor de Mim", "Um Lugar Chamado Notting Hill"});

            raiz.um.dois.um = new No(new String[]{"Orgulho e Preconceito", "Razão e Sensibilidade", "Emma"});
            raiz.um.dois.dois = new No(new String[]{"Um Senhor Estagiário", "Como Perder um Homem em 10 Dias", "O Diário de Bridget Jones"});

            // Intensos
            raiz.dois.um.um = new No(new String[]{"Titanic", "Moulin Rouge", "O Segredo de Brokeback Mountain"});
            raiz.dois.um.dois = new No(new String[]{"Querido John", "Um Amor para Recordar", "O Melhor de Mim"});

            raiz.dois.dois.um = new No(new String[]{"Blue Valentine", "Closer: Perto Demais", "La La Land"});
            raiz.dois.dois.dois = new No(new String[]{"A Forma da Água", "O Tempo Entre Nós", "Questão de Tempo"});
            //fim camada 4
        } else if (genero.equals("comedia")) {
            //camada 1:
            raiz = new No("Você prefere comédias leves e descontraídas ou com um humor mais inteligente e crítico?");

            //camada 2:
            raiz.um = new No("Você gosta de comédias românticas ou situações do cotidiano?");
            raiz.dois = new No("Você prefere sátiras e paródias ou humor ácido e social?");
            //fim camada 2

            //camada 3:
            // Leves
            raiz.um.um = new No("Prefere histórias centradas em relacionamentos ou em amizades e confusões?");
            raiz.um.dois = new No("Prefere comédias familiares ou com humor mais nonsense?");

            // Inteligentes
            raiz.dois.um = new No("Prefere sátiras sobre filmes e cultura pop ou sobre o mundo moderno e política?");
            raiz.dois.dois = new No("Prefere humor mais sarcástico e provocativo ou com crítica de costumes e sociedade?");
            //fim camada 3

            //camada 4:
            // --- Leves ---
            raiz.um.um.um = new No(new String[]{"O Diário de Bridget Jones", "Como Perder um Homem em 10 Dias", "Amor em Obras"});
            raiz.um.um.dois = new No(new String[]{"Se Beber, Não Case!", "As Branquelas", "Superbad — É Hoje"});

            raiz.um.dois.um = new No(new String[]{"Doze é Demais", "Esqueceram de Mim", "Um Faz de Conta que Acontece"});
            raiz.um.dois.dois = new No(new String[]{"Todo Mundo em Pânico", "A Mentira", "Debi & Lóide"});

            // --- Inteligentes ---
            raiz.dois.um.um = new No(new String[]{"Spaceballs", "Shrek", "Zumbilândia"});
            raiz.dois.um.dois = new No(new String[]{"Não Olhe Para Cima", "O Grande Lebowski", "Obrigado por Fumar"});

            raiz.dois.dois.um = new No(new String[]{"The Office", "Brooklyn 99", "Fleabag"});
            raiz.dois.dois.dois = new No(new String[]{"O Ditador", "Borat", "Jojo Rabbit"});
            //fim camada 4
        } else if (genero.equals("terror")) {

        }

    }

    public void percorrer(){
        Scanner sc=new Scanner(System.in);
        No atual = raiz;

        while (atual.um!=null && atual.dois!=null){
            System.out.print(atual.conteudo + "(1/2): ");
            String resposta= sc.next().trim();

            if (resposta.equals("1")){
                atual=atual.um;
            } else if (resposta.equals("2")) {
                atual=atual.dois;
            } else {
                System.out.println("ERRO! valor inválido!");
            }
        }
        System.out.println("Recomendações: " + Arrays.toString(atual.filmes));
    }
}
