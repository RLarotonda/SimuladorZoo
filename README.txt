===========================================================
SIMULADOR ZOO
===========================================================

Autores: Rafael Larotonda e Luana Cosmos
Disciplina: Programação Orientada a Objetos I (POOI)  
Instituição: UNICENTRO  
Professor(a): Inali Wisniewski Soares  
Data: Junho de 2025

-----------------------------------------------------------
1. DESCRIÇÃO DO JOGO / SIMULADOR
-----------------------------------------------------------
O SimuladorZoo é um simulador baseado na gestão de um zoológico.

O jogador atua como um cuidador e deve interagir diariamente com os animais e suas jaulas, realizando tarefas como alimentar, tratar, interagir e limpar. O objetivo é manter os animais saudáveis, felizes e bem alimentados ao longo dos dias.

Cada dia da simulação afeta as condições dos animais e das jaulas, exigindo decisões estratégicas do jogador.

-----------------------------------------------------------
2. COMO EXECUTAR O SIMULADOR
-----------------------------------------------------------

1. Execute a classe principal:
   java MenuSimulador
2. Começe a jogar!

-----------------------------------------------------------
3. CONCEITOS DE POO APLICADOS
-----------------------------------------------------------

✔ Encapsulamento:
- Todos os atributos são privados e acessados via getters/setters.

✔ Herança:
- A classe abstrata Animal é estendida por Leao e Elefante.

✔ Classe Abstrata:
- Animal é abstrata, obrigando subclasses a implementarem seus comportamentos.

✔ Interface:
- A interface Comandos define ações obrigatórias que o Cuidador deve implementar.

✔ Polimorfismo:
- Animais são manipulados por meio de referências do tipo Animal.
- Métodos como alimentar e interagir são chamados polimorficamente.

✔ Composição:
- Zoologico possui Jaulas, e cada Jaula possui um Animal.

✔ Exceções personalizadas:
- AlimentoErradoException
- AnimalSaudavelException

✔ Estruturas de dados:
- Uso de ArrayList para gerenciar as jaulas do zoológico.

✔ Manipulação de arquivos:
- A classe RelatorioStatus salva relatórios diários em arquivos `.txt` com base no nome do jogador e dia da simulação.

✔ Documentação JavaDoc:
- Todos os arquivos possuem cabeçalhos JavaDoc e métodos documentados.

-----------------------------------------------------------
4. FUNCIONALIDADE CRIATIVA
-----------------------------------------------------------

✔ Relatórios automáticos por dia e por jogador:
- O simulador gera arquivos diários com o status de todos os animais.

✔ Aleatoriedade no comportamento:
- A cada novo dia, os animais podem ficar mais famintos, tristes ou até doentes de forma aleatória.

✔ Separação por pacotes:
- Código organizado em pacotes: modelo e excecoes.

-----------------------------------------------------------

Obrigado por utilizar o SimuladorZoo! Volte sempre!!
