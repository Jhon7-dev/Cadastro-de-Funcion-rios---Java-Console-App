Cadastro de Funcionários - Java Console App
Este é um sistema simples de cadastro de funcionários desenvolvido em Java, utilizando os princípios de Programação Orientada a Objetos (POO).
O sistema permite cadastrar e listar diferentes tipos de funcionários: Gerente, Estagiário e Assistente.


--- Funcionalidades ---
  Cadastro de funcionários por tipo:

-Gerente

-Estagiário

-Assistente

 -> Impressão detalhada das informações de cada funcionário

 -> Busca de funcionário por código

 -> Armazenamento dos objetos em memória com ArrayList

 -> Utilização de herança e polimorfismo

 Estrutura das Classes
🔹 Funcionario (classe base)
A classe principal que define atributos comuns a todos os funcionários:

nome

código

setor

função

salário

 --- Gerente
Extende Funcionario e adiciona:

departamento

tempo de serviço

bônus anual (calculado automaticamente)

 --- Estagiario
Extende Funcionario e adiciona:

instituição de ensino

carga horária semanal

possui bolsa (booleano)

--- Assistente
Extende Funcionario e adiciona:

responsável direto

turno de trabalho

