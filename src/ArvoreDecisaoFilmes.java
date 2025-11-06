import java.util.Arrays;
import java.util.Scanner;

public class ArvoreDecisaoFilmes {
    static class No {
        String conteudo;
        String[] filmes;
        No anterior;
        No um;
        No dois;

        No(String conteudo, No anterior) {
            this.conteudo=conteudo;
            this.anterior=anterior;
            this.um=null;
            this.dois=null;
        }

        No(String[] filmes, No anterior){
            this.filmes=filmes;
            this.anterior=anterior;
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
            raiz= new No("Você prefere filmes de ação mais realistas ou com elementos de fantasia?", raiz);

                //camada 2:
                raiz.um= new No("Você gosta de tramas militares ou urbanas?",raiz);
                raiz.dois= new No("Você prefere super-heróis ou universos de ficção científica?",raiz);


                    //camada 3:
                    raiz.um.um= new No("Você gosta de histórias centradas em equipes (tipo Esquadrão) ou em um protagonista só?", raiz.um);
                    raiz.um.dois= new No("Prefere ação policial ou suspense com perseguições?", raiz.um);

                    raiz.dois.um= new No("Prefere histórias mais sérias ou com humor e leveza?", raiz.dois);
                    raiz.dois.dois= new No("Você curte ação espacial ou tecnologia futurista na Terra?", raiz.dois);


                        //camada 4:
                        raiz.um.um.um = new No(new String[] {"Os Mercenários", "Tropa de Elite 2", "12 Heróis"}, raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"Sniper Americano","Rambo", "Invasão ao Servidor"}, raiz.um.um);

                        // Realistas -> Urbanos
                        raiz.um.dois.um = new No(new String[]{"Duro de Matar", "Busca Implacável", "Velocidade Máxima"}, raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"Velozes e Furiosos", "Drive", "Em Ritmo de Fuga",}, raiz.um.dois);

                        // Fantasia -> Heróis
                        raiz.dois.um.um = new No(new String[]{"O Cavaleiro das Trevas", "Watchmen", "Batman Begins"}, raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"Homem-Aranha: De Volta ao Lar", "Guardiões da Galáxia", "Deadpool"}, raiz.dois.um);

                        // Fantasia -> Ficção científica
                        raiz.dois.dois.um = new No(new String[]{"Guardiões da Galáxia", "Star Wars", "Duna"}, raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"Matrix", "Looper", "Minority Report"}, raiz.dois.dois);


        } else if (genero.equals("aventura")) {
            //camada 1:
            raiz = new No("Você prefere aventuras em mundos reais ou em mundos de fantasia?", raiz);

                //camada 2:
                raiz.um = new No("Você gosta de histórias de exploração (selvas, ruínas, viagens)?", raiz);
                raiz.dois = new No("Você prefere mundos de fantasia épicos ou mágicos mais leves?", raiz);


                    //camada 3:
                    // Reais
                    raiz.um.um = new No("Prefere aventuras arqueológicas ou de sobrevivência?", raiz.um);
                    raiz.um.dois = new No("Prefere filmes com foco em jornadas de viagem ou em ação e perseguição?", raiz.um);

                    // Fantasia
                    raiz.dois.um = new No("Você prefere histórias com criaturas míticas ou com guerras e reinos?", raiz.dois);
                    raiz.dois.dois = new No("Prefere filmes com foco em magia e leveza ou em heróis em busca de algo?", raiz.dois);


                        //camada 4:
                        // Reais -> Exploração -> Arqueológicas / Sobrevivência
                        raiz.um.um.um = new No(new String[]{"Indiana Jones, A Lenda do Tesouro Perdido, Tomb Raider"}, raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"Náufrago, O Regresso, Everest"},raiz.um.um);

                        // Reais -> Viagem / Ação
                        raiz.um.dois.um = new No(new String[]{"Viagem ao Centro da Terra, Piratas do Caribe, A Ilha Misteriosa"}, raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"King Kong, Jumanji, Jurassic Park"}, raiz.um.dois);

                        // Fantasia -> Épicos / Criaturas
                        raiz.dois.um.um = new No(new String[]{"O Senhor dos Anéis", "O Hobbit", "As Crônicas de Nárnia"}, raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"Warcraft", "Coração de Dragão", "A Bússola de Ouro"},raiz.dois.um);

                        // Fantasia -> Leves / Heróis
                        raiz.dois.dois.um = new No(new String[]{"Stardust", "O Lar das Crianças Peculiares", "A Princesa Prometida"}, raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"Percy Jackson", "As Aventuras de Pi", "Príncipe da Pérsia"}, raiz.dois.dois);

        } else if (genero.equals("ficçao cientifica")) {
            //camada 1:
            raiz = new No("Você prefere histórias ambientadas no espaço ou em um futuro tecnológico na Terra?", raiz);

                //camada 2:
                raiz.um = new No("Você gosta de tramas com foco em exploração espacial ou em batalhas interplanetárias?", raiz);
                raiz.dois = new No("Você prefere futuros distópicos ou com avanços tecnológicos e inteligência artificial?", raiz);


                    //camada 3:
                    // Espaço
                    raiz.um.um = new No("Prefere histórias mais filosóficas ou com ação intensa?", raiz.um);
                    raiz.um.dois = new No("Prefere universos de guerra entre espécies ou missões científicas em planetas distantes?",raiz.um);

                    // Terra futurista
                    raiz.dois.um = new No("Você gosta de histórias sobre controle social e governos opressivos?", raiz.dois);
                    raiz.dois.dois = new No("Prefere narrativas sobre robôs e IA ou sobre realidades virtuais e simulações?", raiz.dois);


                        //camada 4:
                        // Espaço -> Exploração / Batalhas
                        raiz.um.um.um = new No(new String[]{"Interestelar", "2001: Uma Odisseia no Espaço", "Ad Astra"}, raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"Star Wars, Guardiões da Galáxia, Duna"}, raiz.um.um);

                        // Espaço -> Guerras / Missões
                        raiz.um.dois.um = new No(new String[]{"Star Trek", "Starship Troopers", "O Quinto Elemento"}, raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"Perdido em Marte", "Gravidade", "Moon"}, raiz.um.dois);

                        // Terra -> Distopia / IA
                        raiz.dois.um.um = new No(new String[]{"Blade Runner 2049", "Matrix", "Ghost in the Shell"}, raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"O Doador de Memórias", "Jogos Vorazes", "Divergente"}, raiz.dois.um);

                        // Terra -> Robôs / Realidade virtual
                        raiz.dois.dois.um = new No(new String[]{"Ex Machina", "Eu", "Robô", "Her"}, raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"Matrix", "Jogador Nº 1", "Inception"}, raiz.dois.dois);

        } else if (genero.equals("drama")) {
            //camada 1:
            raiz = new No("Você prefere dramas baseados em histórias reais ou histórias totalmente fictícias?", raiz);

                //camada 2:
                raiz.um = new No("Você gosta de histórias de superação pessoal ou sobre problemas sociais?",raiz);
                raiz.dois = new No("Você prefere dramas românticos ou psicológicos?",raiz);


                    //camada 3:
                    // Baseados em fatos reais
                    raiz.um.um = new No("Prefere histórias inspiradoras ou tristes e reflexivas?",raiz.um);
                    raiz.um.dois = new No("Prefere histórias sobre injustiça e desigualdade ou sobre transformação social?",raiz.um);

                    // Fictícios
                    raiz.dois.um = new No("Prefere romances intensos ou dramas leves sobre relacionamentos?",raiz.dois);
                    raiz.dois.dois = new No("Prefere dramas mentais profundos ou suspense psicológico?",raiz.dois);


                        //camada 4:
                        // Fatos reais -> Superação / Sociais
                        raiz.um.um.um = new No(new String[]{"À Procura da Felicidade", "O Impossível", "Nasce uma Estrela"},raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"A Lista de Schindler", "Menina de Ouro", "O Pianista"},raiz.um.um);

                        raiz.um.dois.um = new No(new String[]{"Estrelas Além do Tempo", "12 Anos de Escravidão", "Erin Brockovich"},raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"Clube de Compras Dallas, Invictus, Spotlight"},raiz.um.dois);

                        // Fictícios -> Românticos / Psicológicos
                        raiz.dois.um.um = new No(new String[]{"Diário de uma Paixão", "Orgulho e Preconceito", "P.S. Eu Te Amo"},raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"Questão de Tempo", "Her", "500 Dias com Ela"},raiz.dois.um);

                        raiz.dois.dois.um = new No(new String[]{"Cisne Negro", "Réquiem para um Sonho", "O Show de Truman"},raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"Ilha do Medo", "O Sexto Sentido", "Garota Exemplar"},raiz.dois.dois);

        } else if (genero.equals("romance")) {
            //camada 1:
            raiz = new No("Você prefere romances leves e divertidos ou intensos e emocionais?", raiz);

                //camada 2:
                raiz.um = new No("Você gosta de romances contemporâneos ou de época?",raiz);
                raiz.dois = new No("Você prefere histórias com finais felizes ou trágicos?",raiz);


                    //camada 3:
                    // Romances leves
                    raiz.um.um = new No("Prefere histórias urbanas modernas ou ambientadas em pequenas cidades?",raiz.um);
                    raiz.um.dois = new No("Prefere histórias de época clássicas ou com toque de comédia?",raiz.um);

                    // Romances intensos
                    raiz.dois.um = new No("Prefere histórias de amor proibido ou reencontros e segundas chances?",raiz.dois);
                    raiz.dois.dois = new No("Prefere dramas românticos realistas ou romances com elementos fantásticos?",raiz.dois);


                        //camada 4:
                        // Leves
                        raiz.um.um.um = new No(new String[]{"Simplesmente Acontece", "O Plano Imperfeito", "Amor com Data Marcada"},raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"Cartas para Julieta", "O Melhor de Mim", "Um Lugar Chamado Notting Hill"},raiz.um.um);

                        raiz.um.dois.um = new No(new String[]{"Orgulho e Preconceito", "Razão e Sensibilidade", "Emma"},raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"Um Senhor Estagiário", "Como Perder um Homem em 10 Dias", "O Diário de Bridget Jones"},raiz.um.dois);

                        // Intensos
                        raiz.dois.um.um = new No(new String[]{"Titanic", "Moulin Rouge", "O Segredo de Brokeback Mountain"},raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"Querido John", "Um Amor para Recordar", "O Melhor de Mim"},raiz.dois.um);

                        raiz.dois.dois.um = new No(new String[]{"Blue Valentine", "Closer: Perto Demais", "La La Land"},raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"A Forma da Água", "O Tempo Entre Nós", "Questão de Tempo"},raiz.dois.dois);

        } else if (genero.equals("comedia")) {
            //camada 1:
            raiz = new No("Você prefere comédias leves e descontraídas ou com um humor mais inteligente e crítico?",raiz);

                //camada 2:
                raiz.um = new No("Você gosta de comédias românticas ou situações do cotidiano?",raiz);
                raiz.dois = new No("Você prefere sátiras e paródias ou humor ácido e social?",raiz);


                    //camada 3:
                    // Leves
                    raiz.um.um = new No("Prefere histórias centradas em relacionamentos ou em amizades e confusões?",raiz.um);
                    raiz.um.dois = new No("Prefere comédias familiares ou com humor mais nonsense?",raiz.um);

                    // Inteligentes
                    raiz.dois.um = new No("Prefere sátiras sobre filmes e cultura pop ou sobre o mundo moderno e política?",raiz.dois);
                    raiz.dois.dois = new No("Prefere humor mais sarcástico e provocativo ou com crítica de costumes e sociedade?",raiz.dois);


                        //camada 4:
                        // --- Leves ---
                        raiz.um.um.um = new No(new String[]{"O Diário de Bridget Jones", "Como Perder um Homem em 10 Dias", "Amor em Obras"},raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"Se Beber, Não Case!", "As Branquelas", "Superbad — É Hoje"},raiz.um.um);

                        raiz.um.dois.um = new No(new String[]{"Doze é Demais", "Esqueceram de Mim", "Um Faz de Conta que Acontece"},raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"Todo Mundo em Pânico", "A Mentira", "Debi & Lóide"},raiz.um.dois);

                        // --- Inteligentes ---
                        raiz.dois.um.um = new No(new String[]{"Spaceballs", "Shrek", "Zumbilândia"},raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"Não Olhe Para Cima", "O Grande Lebowski", "Obrigado por Fumar"},raiz.dois.um);

                        raiz.dois.dois.um = new No(new String[]{"The Office", "Brooklyn 99", "Fleabag"},raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"O Ditador", "Borat", "Jojo Rabbit"},raiz.dois.dois);

        } else if (genero.equals("terror")) {
            //camada 1:
            raiz = new No("Você prefere filmes de terror psicológico ou com monstros e seres sobrenaturais?",raiz);

                //camada 2:
                raiz.um = new No("Você gosta de histórias mais mentais e perturbadoras ou de suspense e tensão crescente?",raiz);
                raiz.dois = new No("Você prefere fantasmas e possessões ou criaturas e assassinos?",raiz);


                    //camada 3:
                    // Psicológico
                    raiz.um.um = new No("Prefere histórias que exploram traumas e a mente humana ou situações de isolamento e loucura?",raiz.um);
                    raiz.um.dois = new No("Prefere mistério com final surpreendente ou tensão constante sem muitas explicações?",raiz.um);

                    // Sobrenatural
                    raiz.dois.um = new No("Prefere casas assombradas e possessões demoníacas ou espíritos vingativos e maldições?",raiz.dois);
                    raiz.dois.dois = new No("Prefere criaturas monstruosas ou serial killers e slasher?",raiz.dois);


                        //camada 4:
                        // --- Psicológico ---
                        raiz.um.um.um = new No(new String[]{"Cisne Negro, Hereditário, Mãe!, O Babadook"},raiz.um.um);
                        raiz.um.um.dois = new No(new String[]{"O Iluminado", "Ilha do Medo", "O Farol"},raiz.um.um);

                        raiz.um.dois.um = new No(new String[]{"Fragmentado", "Corra!", "Os Outros"},raiz.um.dois);
                        raiz.um.dois.dois = new No(new String[]{"It Follows", "A Bruxa", "O Enigma de Outro Mundo"},raiz.um.dois);

                        // --- Sobrenatural ---
                        raiz.dois.um.um = new No(new String[]{"Invocação do Mal, Sobrenatural, O Exorcista"},raiz.dois.um);
                        raiz.dois.um.dois = new No(new String[]{"O Chamado", "Ju-On: O Grito", "A Maldição da Residência Hill"},raiz.dois.um);

                        raiz.dois.dois.um = new No(new String[]{"Um Lugar Silencioso, Cloverfield, O Monstro da Lagoa Negra"},raiz.dois.dois);
                        raiz.dois.dois.dois = new No(new String[]{"Halloween", "Pânico", "O Massacre da Serra Elétrica"},raiz.dois.dois);

        }

    }

    public void percorrer(){
        Scanner sc=new Scanner(System.in);
        No atual = raiz;

        while (atual.um!=null && atual.dois!=null){
            System.out.print(atual.conteudo + "(1/2): ");
            String resposta= sc.next().trim();
            if (resposta.equals("voltar") && atual!=raiz){
                atual= atual.anterior;
            } else if (resposta.equals("1")){
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
