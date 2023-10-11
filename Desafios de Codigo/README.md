# Desafio 1 - Multiplicação Simples
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável **PROD**, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).  

### Entrada
A entrada contém 2 valores inteiros.

### Saída
Exiba a variável **PROD** conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

|Entrada|Saída|
-|-
|3 <br> 9| PROD = 27|
|-30 <br> 10 | PROD = -300|
|0 <br> 9|PROD = 0|

---

# Desafio 2 - Soma Simples
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de **SOMA**.
A seguir escreva o valor desta variável.

### Entrada
A entrada contém 2 valores inteiros.

### Saída
Imprima a variável **SOMA** com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

|Entrada|Saída|
-|-
|30 <br> 10| SOMA = 40|
|-30 <br> 10 | SOMA = -20|
|0 <br> 0|SOMA = 0|

---

# Desafio 3 - Média 1
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

### Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

### Saída
Calcule e imprima a variável **MEDIA** conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error"

|Entrada|Saída|
-|-
|5.0 <br> 7.1| MEDIA = 6.43182|
|0.0 <br> 7.1 | MEDIA = 4.84091|
|10.0 <br> 10.0|MEDIA = 10.00000|

---

# Desafio 4 - Mjölnir
Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. Feito de um minério místico especial chamado Uru e forjado no coração de uma estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lendários ferreiros.

Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.

Escreva um programa que, dado um nome, e a força, em Newtons, aplicado ao tentar levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.

### Entrada 
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso de teste inicia com uma palavra, que é o primeiro nome de quem está tentando levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.

### Saída
Para cada caso de teste imprima um caractere ‘Y’, caso a pessoa tenha conseguido levantar , ou ‘N’, caso não tenha conseguido.

|Entrada|Saída|
-|-
|4 <br> Hulk 5000 <br> Tony 1000 <br> Thor 50 <br> Steve 500|<br> N <br> N <br> Y <br> N|

---

# Desafio 5 - Pedra, Papel, Ataque Aéreo
Pedra, Papel, Ataque Aéreo é um jogo antigo mas que é popular até hoje. Nele, duas ou mais pessoas fazem gestos com a mão para vencer o adversário. 

As partidas são muito simples. Os jogadores podem escolher entre o sinal de uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o sinal para o Ataque Aéreo (igual o do Papel, mas com apenas o polegar e o mindinho estendidos).

Uma partida, com dois jogadores, possuem as seguintes regras para se definir um vencedor:

- Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
- Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
- Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
- Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o - - Papel pode perder.
- Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
- Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.
Agora desenvolva um programa que, dada as escolhas de dois jogadores, informe quem venceu o jogo.

Agora desenvolva um programa que, dada as escolhas de dois jogadores, informe quem venceu o jogo.

### Desafio
A entrada consiste de N (1 ≤ N ≤ 1000) casos de teste. N deve ser lido na primeira linha da entrada. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. A primeira string representa o sinal escolhido pelo jogador 1 e a segunda string representa o sinal escolhido pelo jogador 2. Essas strings podem ser:

- “ataque”: para representar o Ataque Aéreo
- “pedra”: para representar a Pedra
- “papel”: para representar o Papel

### Saída
A saída deve conter o seguinte:

- “Jogador 1 venceu”: se o Jogador Um tiver vencido a partida
- “Jogador 2 venceu”: se o Jogador Dois tiver vencido a partida
- “Ambos venceram”: se os dois jogadores tiverem vencido a partida
- “Sem ganhador”: se não houver ganhador
- “Aniquilacao mutua”: se ocorrer Aniquilação Mútua

Cada saída de um caso de teste deve estar em uma linha.

|Exemplo de Entrada|Exemplo de Saída|
-|-
|2||
|pedra <br> pedra |Sem ganhador|
|ataque <br> papel|Jogador 1 venceu|

---

# Desafio 6 - Entrada e Saída Lendo e Pulando Nomes
Faça um programa com as características abaixo:

1. Leia 10 nomes, sem espaço em branco;
2. Imprima o terceiro nome da lista;
3. Imprima o sétimo nome da lista;
4. Imprima o nono nome da lista.

### Entrada
A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

### Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.

|Exemplo de Entrada|Exemplo de Saída|
-|-
|UnB|UNIFEI <br> UFRGS <br> UFU|
|UFMG ||
|UNIFEI||
|UECE||
|UNICAMP||
|INATEL||
|UFRGS||
|UNIFESO||
|UFU||
|PUC||