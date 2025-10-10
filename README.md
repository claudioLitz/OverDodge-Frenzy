# Projeto: Evasão Rítmica (Protótipo)

![Status: Em Desenvolvimento](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)

Um protótipo de jogo 2D no estilo *bullet hell* onde o jogador deve sobreviver a padrões de ataque cada vez mais complexos e intensos dentro de uma arena limitada. O projeto foca em controles responsivos, mecânicas de esquiva e um sistema de dificuldade progressiva.

**Adicione um GIF do seu jogo aqui para uma ótima primeira impressão!**
*![Gameplay GIF](URL_DO_SEU_GIF_AQUI.gif)*

---

## 🎮 Core Features (Funcionalidades Principais)

-   **Movimentação com Inércia:** Sistema de movimento fluido que acelera e desacelera, exigindo que o jogador antecipe suas ações.
-   **Habilidade de Dash:** Pressione `Espaço` para um impulso rápido que concede invulnerabilidade temporária, perfeito para atravessar ataques perigosos.
-   **Modo de Foco:** Pressione `Shift` para ativar um modo de movimento de alta precisão, removendo a inércia e permitindo desvios milimétricos.
-   **Sistema de Ataques Dinâmico:** Dezenas de padrões de ataque pré-definidos (Chuva Vertical, Lasers, Bombas-Relógio, etc.) que são combinados e intensificados conforme o nível de dificuldade aumenta.
-   **Ciclo de Batalha:** O jogo alterna entre estados de `PAUSA`, `AVISO` (telegrafando o próximo ataque) e `ATIVO`, criando um ritmo claro para o combate.
-   **Dificuldade Progressiva:** O desafio aumenta automaticamente com o tempo, introduzindo novos padrões de ataque e tornando os existentes mais rápidos.
-   **Interface Clara:** Feedback visual para cooldowns de habilidades, avisos de ataque e uma arena de batalha bem definida.

---

## 🛠️ Como Executar o Protótipo

Este protótipo foi desenvolvido com **p5.js**. Você pode executá-lo de duas maneiras principais:

### 1. Usando um Servidor Local (Recomendado)

1.  **Pré-requisitos:**
    * Tenha o [Node.js](https://nodejs.org/) instalado.
    * Instale o `live-server` globalmente: `npm install -g live-server`.
    * Um editor de código como o [VS Code](https://code.visualstudio.com/).

2.  **Estrutura dos Arquivos:**
    Certifique-se de que seus arquivos estão organizados da seguinte forma:
    ```
    /seu-projeto
    ├── index.html
    ├── sketch.js       <-- Seu código do jogo vai aqui
    └── p5.js           <-- A biblioteca p5.js
    ```

3.  **Arquivo `index.html`:**
    Crie este arquivo na raiz do projeto. Ele irá carregar a biblioteca e o seu script.
    ```html
    <!DOCTYPE html>
    <html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Protótipo do Jogo</title>
        <script src="p5.js"></script>
        <script src="sketch.js"></script>
        <style>
            body { padding: 0; margin: 0; background-color: black; }
            canvas { display: block; margin: auto; }
        </style>
    </head>
    <body>
    </body>
    </html>
    ```

4.  **Execute:**
    * Abra o terminal na pasta do seu projeto.
    * Digite o comando: `live-server`.
    * Seu navegador abrirá automaticamente com o jogo rodando.

### 2. Usando o p5.js Web Editor

1.  Acesse o [Editor Web do p5.js](https://editor.p5js.org/).
2.  Copie todo o seu código do arquivo `sketch.js`.
3.  Cole o código no painel de edição do editor web.
4.  Clique no botão "Play" (▶) para rodar o projeto.

---

## ⌨️ Controles

| Tecla                | Ação                  |
| -------------------- | --------------------- |
| `WASD` ou `Setas`    | Mover o personagem    |
| `Barra de Espaço`    | Ativar Dash (esquiva) |
| `Shift`              | Ativar Modo Foco      |

---

## 📜 Requisitos do Projeto

<details>
<summary><strong>Clique para expandir/recolher os Requisitos Funcionais e Não-Funcionais</strong></summary>

### Requisitos Funcionais (RF)

#### 1. Interface de Usuário (UI) e Apresentação
-   **RF01:** O sistema deve exibir uma interface gráfica bidimensional (2D) para o jogador.
-   **RF02:** A interface deve conter elementos interativos clicáveis, como botões de menu (Iniciar, Opções, Sair) e seletores de fase/inimigo.
-   **RF03:** O sistema deve fornecer feedback visual e auditivo claro para todas as interações do jogador com a UI (ex: som de clique ao selecionar uma opção).
-   **RF04:** O sistema deve exibir um indicador de ritmo (ex: uma barra que se move, ícones que chegam a um alvo) que esteja perfeitamente sincronizado com a trilha sonora da batalha.
-   **RF05:** O sistema deve exibir indicadores visuais claros para sinalizar o início e o fim de uma batalha.
-   **RF06:** Ao final da batalha, o sistema deve apresentar uma tela de resultados, exibindo estatísticas de desempenho do jogador, como porcentagem de acertos, erros, e pontuação final.

#### 2. Mecânicas de Jogo e Ritmo
-   **RF07:** O sistema deve reproduzir uma ou mais trilhas sonoras específicas durante cada batalha.
-   **RF08:** O sistema deve alternar as trilhas sonoras com base na fase ou no inimigo selecionado.
-   **RF10:** O sistema deve permitir que o jogo seja pausado e retomado a qualquer momento durante a batalha.

#### 3. Personagem do Jogador (Player)
-   **RF11:** O sistema deve apresentar um personagem controlável pelo jogador na tela.
-   **RF12:** O jogador deve poder executar ações de combate (ataque, defesa) em sincronia com os indicadores de ritmo.
-   **RF13:** O personagem do jogador deve ser capaz de se mover livremente em um plano 2D (eixos X e Y) dentro dos limites da arena de batalha.
-   **RF14:** O jogador deve ter acesso a habilidades como ataques e esquivas.
-   **RF15:** O sistema deve modificar ou acrescentar uma característica (ex: uma esquiva perfeita deve conceder ao jogador invulnerabilidade temporária).

#### 4. Inimigos (PNJ - Personagem Não Jogável)
-   **RF16:** O sistema deve apresentar um ou mais personagens não jogáveis (inimigos) na tela.
-   **RF17:** O sistema deve executar ações de ataque contra o jogador.
-   **RF18:** O sistema deve dar precedência aos ataques.
-   **RF19:** O sistema deve sincronizar os ataques com o compasso da trilha sonora.

#### 5. Sistema de Jogo e Configurações
-   **RF20:** O sistema deve permitir ao jogador ajustar configurações gerais, como volume da música, volume de efeitos sonoros, resolução de tela e brilho.
-   **RF21:** O sistema deve salvar o progresso do jogador, incluindo fases completas e estatísticas de desempenho.
-   **RF22:** O sistema deve registrar e processar as entradas do jogador via teclado e mouse.

### Requisitos Não-Funcionais (RNF)
-   **RNF01:** O jogo deve rodar a uma taxa de 30 quadros por segundo (FPS) constantes para garantir a fluidez visual e a precisão rítmica.
-   **RNF02:** O sistema de detecção de ritmo deve ter uma precisão de milissegundos para registrar as entradas do jogador, diferenciando acertos "perfeitos", "bons" e "erros".
-   **RNF03:** O sistema deve implementar um sistema de detecção de colisão 2D ("hitboxes" e "hurtboxes") para gerenciar as interações entre o jogador, inimigos e seus ataques.
-   **RNF04:** Dois objetos sólidos (como o jogador e um inimigo) não podem ocupar o mesmo espaço simultaneamente.
-   **RNF05:** O personagem do jogador não deve poder se mover para fora dos limites estabelecidos da arena de combate.
-   **RNF07:** O jogo deve ser compatível com o sistema operacional Windows 10 e superior.
-   **RNF08:** Os controles do jogo devem ser responsivos, com um atraso de entrada (input lag) inferior a 50ms.

</details>

---

## 💻 Tecnologias Utilizadas

-   **Linguagem:** JavaScript
-   **Biblioteca Gráfica:** [p5.js](https://p5js.org/)

---
