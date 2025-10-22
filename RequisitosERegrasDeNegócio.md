# Documento de Requisitos e Regras de Negócio

## Requisitos Funcionais (RF)

### 1. Interface de Usuário (UI) e Apresentação

- **RF01:** O sistema deve exibir uma interface gráfica bidimensional (2D) para o jogador.
- **RF02:** A sistema deve ler os inputs do cliente pelos elementos interativos clicáveis, como botões de menu (Iniciar, Opções, Sair) e seletores de fase/inimigo.
- **RF03:** O sistema deve fornecer feedback visual e auditivo claro para todas as interações do jogador com a UI (ex: som de clique ao selecionar uma opção).
- **RF04:** O sistema deve exibir um indicador de ritmo (ex: uma barra que se move, ícones que chegam a um alvo) que esteja perfeitamente sincronizado com a trilha sonora da batalha.
- **RF05:** O sistema deve exibir indicadores visuais claros para sinalizar o início e o fim de uma batalha.
- **RF06:** Ao final da batalha, o sistema deve apresentar uma tela de resultados, exibindo estatísticas de desempenho do jogador, como porcentagem de acertos, erros, e pontuação final.

### 2. Mecânicas de Jogo e Ritmo

- **RF07:** O sistema deve reproduzir uma ou mais trilhas sonoras específicas durante cada batalha.
- **RF08:** O sistema deve alternar as trilhas sonoras com base na fase ou no inimigo selecionado.
- **RF09:** *
- **RF10:** O sistema deve permitir que o jogo seja pausado e retomado a qualquer momento durante a batalha.

### 3. Personagem do Jogador (Player)

- **RF11:** O sistema deve apresentar um personagem controlável pelo jogador na tela.
- **RF12:** O sistema deve permitir executar ações de combate (ataque, defesa) em sincronia com os indicadores de ritmo.
- **RF13:** O sistema deve permitir que o personagem do jogador deve ser capaz de se mover livremente em um plano 2D (eixos X e Y) dentro dos limites da arena de batalha.
- **RF14:** O sistema deve permitir que o jogador deve ter acesso a habilidades como ataques e esquivas.
- **RF15:** O sistema deve modificar ou acrescentar uma característica (ex: uma esquiva perfeita deve conceder ao jogador invulnerabilidade temporária).

### 4. Inimigos (PNJ - Personagem Não Jogável)

- **RF16:** O sistema deve apresentar um ou mais personagens não jogáveis (inimigos) na tela.
- **RF17:** O sistema deve executar ações de ataque contra o jogador.
- **RF18:** O sistema deve dar precedência dos ataques.
- **RF19:** O sistema deve sincronizar os ataques com o compasso da trilha sonora.

### 5. Sistema de Jogo e Configurações

- **RF20:** O sistema deve permitir ao jogador ajustar configurações gerais, como volume da música, volume de efeitos sonoros, resolução de tela e brilho.
- **RF21:** O sistema deve salvar o progresso do jogador, incluindo fases completas e estatísticas de desempenho.
- **RF22:** O sistema deve registrar e processar as entradas do jogador via teclado e mouse.

---

## Requisitos Não-Funcionais (RNF)

Estes são os requisitos que definem a qualidade e as restrições do sistema.

- **RNF01:** O jogo deve rodar a uma taxa de 30 quadros por segundo (FPS) constantes para garantir a fluidez visual e a precisão rítmica.
- **RNF02:** O sistema de detecção de ritmo deve ter uma precisão de milissegundos para registrar as entradas do jogador, diferenciando acertos "perfeitos", "bons" e "erros".
- **RNF03:** O sistema deve implementar um sistema de detecção de colisão 2D ("hitboxes" e "hurtboxes") para gerenciar as interações entre o jogador, inimigos e seus ataques.
- **RNF04:** Dois objetos sólidos (como o jogador e um inimigo) não podem ocupar o mesmo espaço simultaneamente.
- **RNF05:** O personagem do jogador não deve poder se mover para fora dos limites estabelecidos da arena de combate.
- **RNF06:**
- **RNF07:** O jogo deve ser compatível com o sistema operacional Windows 10 e superior.
- **RNF08:** Os controles do jogo devem ser responsivos, com um atraso de entrada (input lag) inferior a 50ms.

---

## Regras de Negócio (RN)

### RN01 - (Precisão da Ação)
Toda ação rítmica do jogador (ataque, defesa) será classificada em uma de três categorias, baseada na sua proximidade com o pulso exato da música (conforme RNF02):
- **Perfeito:** Ação executada em uma janela de +/- 50ms do pulso. Concede 100% do dano/efeito e a maior pontuação.
- **Bom:** Ação executada em uma janela de +/- 100ms do pulso (excluindo a janela "Perfeito"). Concede 60% do dano/efeito e uma pontuação menor.
- **Erro:** Ação executada fora da janela "Bom" ou nenhuma ação quando uma era necessária. Resulta em zero dano/efeito e quebra o combo. Se for uma ação defensiva, o jogador sofre dano.

### RN02 - (Sincronia de Ataque Inimigo)
Os ataques inimigos (RF19) não são aleatórios. Eles sempre ocorrerão em batidas específicas da música, sinalizadas visualmente `X` tempos antes (ex: o inimigo brilha em vermelho um compasso antes do golpe). Isso dá ao jogador tempo para se preparar para atacar ou defender no ritmo certo.

### RN03 - (Classificação)
O jogador irá incrementar uma tabela de classificação, conforme seu desempenho, e perderá pontos com o tempo e erros.

### RN04 - (Precedência de Ações - RF18)
Se o jogador ataca no mesmo pulso em que um ataque inimigo o atingiria, a ação do jogador tem prioridade (o ataque dele conecta e ele não sofre dano). Ações de defesa (esquiva, bloqueio) devem ser executadas no pulso exato em que o ataque inimigo conectaria.

### RN05 - (Gerenciamento de Colisão - RNF03, RNF04)
Uma ação de ataque só causará dano se a *hitbox* do ataque se sobrepuser à *hurtbox* do alvo no momento da ação rítmica. Os corpos do jogador e do inimigo possuem *hurtboxes* sólidas que não podem se sobrepor, impedindo que um atravesse o outro.

### RN06 - (Limites da Arena)
O movimento do jogador (RF13) é restrito a uma área retangular definida. Se o jogador tentar se mover para além desses limites (RNF05), seu personagem irá parar na borda da arena.

### RN07 - (Condição de Vitória/Derrota)
- **Vitória:** A barra de vida do inimigo chega a zero, e o jogador volta ao menu.
- **Derrota:** A barra de vida do jogador chega a zero.

Ao final da batalha (RF05), o jogo transiciona para a tela de resultados (RF06).

### RN08 - (Pausa do Jogo - RF10)
- Ao pausar, a música e todos os efeitos sonoros param, e a simulação do jogo é congelada.
- Uma sobreposição (overlay) de menu de pausa é exibida, contendo as opções "Retomar", "Reiniciar Batalha" e "Sair para o Menu".
- Ao retomar, uma contagem regressiva visual (3, 2, 1...) é exibida para que o jogador possa se ressincronizar com o ritmo antes do jogo recomeçar.
