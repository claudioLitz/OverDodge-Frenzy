# 🌀 Evasão Rítmica (Protótipo)

![Status](https://img.shields.io/badge/status-Em%20Desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)
![Made with p5.js](https://img.shields.io/badge/made%20with-p5.js-red)

> 🎯 *Um jogo 2D no estilo **bullet hell** onde o jogador deve sobreviver a padrões de ataque cada vez mais intensos dentro de uma arena limitada. O projeto foca em controles responsivos, esquivas precisas e dificuldade progressiva.*

---

## 🚀 Funcionalidades Principais

- 🌀 **Movimentação com Inércia** — movimentação fluida que exige antecipação e precisão.  
- ⚡ **Dash (`Espaço`)** — impulso rápido com invulnerabilidade temporária.  
- 🎯 **Modo Foco (`Shift`)** — remove a inércia e permite desvios milimétricos.  
- 💥 **Padrões de Ataque Dinâmicos** — chuva vertical, lasers, bombas-relógio e muito mais.  
- 🔄 **Ciclo de Batalha** — alterna entre `PAUSA`, `AVISO` e `ATIVO`, criando ritmo de combate.  
- 📈 **Dificuldade Progressiva** — ataques mais intensos conforme o tempo passa.  
- 🧭 **Interface Clara** — feedback visual, avisos de ataque e cooldowns bem definidos.

---

## 🛠️ Como Executar o Protótipo

Este projeto utiliza [p5.js](https://p5js.org/).  
Você pode executar de duas formas:

### ✅ 1. Usando um Servidor Local (Recomendado)

#### 📦 Pré-requisitos
- [Node.js](https://nodejs.org/) instalado  
- Instalar o live-server:
  ```bash
  npm install -g live-server
  /seu-projeto
├── index.html
├── sketch.js       <-- Código principal do jogo
└── p5.js           <-- Biblioteca p5.js
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Protótipo do Jogo</title>
    <script src="p5.js"></script>
    <script src="sketch.js"></script>
    <style>
        body { margin: 0; background: black; }
        canvas { display: block; margin: auto; }
    </style>
</head>
<body></body>
</html>
live-server


***⌨️ Controles***

Tecla	Ação
WASD ou Setas	Mover o personagem
Espaço	Dash (esquiva)
Shift	Modo Foco

📜 Requisitos do Projeto
<details> <summary>📌 <strong>Clique para expandir Requisitos Funcionais e Não-Funcionais</strong></summary>

*⚙️ Requisitos Funcionais*

RF01 — Interface gráfica 2D com botões interativos

RF02 — Feedback visual e sonoro em interações

RF03 — Indicadores visuais de ritmo sincronizados com a música

RF04 — Ciclo de batalha com avisos e pausas

RF05 — Habilidades de movimentação, dash e foco

RF06 — Inimigos com padrões de ataque sincronizados ao compasso

🧪 Requisitos Não-Funcionais

RNF01 — Rodar a 30 FPS estáveis

RNF02 — Precisão de input com atraso < 50ms

RNF03 — Sistema de colisão 2D eficiente

RNF04 — Compatibilidade mínima: Windows 10+

RNF05 — Arena com limites físicos bem definidos

</details>

💻 Tecnologias Utilizadas

Tecnologia	Função
🟨 JavaScript	Linguagem base
🖼️ p5.js
	Biblioteca gráfica para renderização 2D
💻 VS Code	Ambiente de desenvolvimento (sugestão)

🧭 Roadmap (Próximos Passos)

 Sistema de pontuação e ranking

 Fases e padrões de ataque mais variados

 Este projeto está licenciado sob a MIT License
.

 Animações de impacto e feedback visual aprimorado

 Sons e trilhas sonoras customizados

 Suporte para gamepad

 
