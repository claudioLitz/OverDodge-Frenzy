#1. Interface de Usuário (UI) e Apresentação

RF01: O sistema deve exibir uma interface gráfica bidimensional (2D) para o jogador.

RF02: A interface deve conter elementos interativos clicáveis, como botões de menu (Iniciar, Opções, Sair) e seletores de fase/inimigo. 

RF03: O sistema deve fornecer feedback visual e auditivo claro para todas as interações do jogador com a UI (ex: som de clique ao selecionar uma opção). 

RF04: O sistema deve exibir um indicador de ritmo (ex: uma barra que se move, ícones que chegam a um alvo) que esteja perfeitamente sincronizado com a trilha sonora da batalha. 

RF05: O sistema deve exibir indicadores visuais claros para sinalizar o início e o fim de uma batalha.

RF06: Ao final da batalha, o sistema deve apresentar uma tela de resultados, exibindo estatísticas de desempenho do jogador, como porcentagem de acertos, erros, e pontuação final. 

##2. Mecânicas de Jogo e Ritmo

RF07: O sistema deve reproduzir uma ou mais trilhas sonoras específica durante cada batalha. 

RF08: O sistema deve alternar as trilhas sonoras com base na fase ou no inimigo selecionado. 

RF09: *

RF10: O sistema deve permitir que o jogo seja pausado e retomado a qualquer momento durante a batalha. 

##3. Personagem do Jogador (Player)

RF11: O sistema deve apresentar um personagem controlável pelo jogador na tela. 

RF12: O jogador deve poder executar ações de combate (ataque, defesa) em sincronia com os indicadores de ritmo. 

RF13: O personagem do jogador deve ser capaz de se mover livremente em um plano 2D (eixos X e Y) dentro dos limites da arena de batalha. 

RF14: O jogador deve ter acesso a habilidades como ataques, esquivas

RF15: O sistema deve modificar ou acrescentar uma característica (ex: uma esquiva perfeita deve conceder ao jogador invulnerabilidade temporária ). 

##4. Inimigos (PNJ - Personagem Não Jogável)

RF16: O sistema deve apresentar um ou mais personagens não jogáveis (inimigos) na tela.

RF17: O sistema deve executar ações de ataque contra o jogador.

RF18: O sistema deve dar precedência dos ataques.

RF19: O sistema deve sincronizar os ataques com o compasso da trilha donora.

5. Sistema de Jogo e Configurações

RF20: O sistema deve permitir ao jogador ajustar configurações gerais, como volume da música, volume de efeitos sonoros, resolução de tela e brilho.

RF21: O sistema deve salvar o progresso do jogador, incluindo fases completas e estatísticas de desempenho.

RF22: O sistema deve registrar e processar as entradas do jogador via teclado, mouse.


#Requisitos Não-Funcionais (RNF) 

Estes são os requisitos que definem a qualidade e as restrições do sistema.

RNF01: O jogo deve rodar a uma taxa de 30 quadros por segundo (FPS) constantes para garantir a fluidez visual e a precisão rítmica.

RNF02: O sistema de detecção de ritmo deve ter uma precisão de milissegundos para registrar as entradas do jogador, diferenciando acertos "perfeitos", "bons" e "erros". 

RNF03: O sistema deve implementar um sistema de detecção de colisão 2D ("hitboxes" e "hurtboxes") para gerenciar as interações entre o jogador, inimigos e seus ataques.

RNF04: Dois objetos sólidos (como o jogador e um inimigo) não podem ocupar o mesmo espaço simultaneamente.

RNF05: O personagem do jogador não deve poder se mover para fora dos limites estabelecidos da arena de combate.

RNF06: 

RNF07: O jogo deve ser compatível com o sistema operacional Windows 10 e superior. (Exemplo, você pode definir aqui para quais plataformas o jogo será).

RNF08: Os controles do jogo devem ser responsivos, com um atraso de entrada (input lag) inferior a 50ms.
