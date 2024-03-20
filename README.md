# CaixaSupermercado
 
# Integrantes da equipe: 
Gabriel Barboza Lima - 2315413
Natanael Barboza Lima - 2319722

* Problemática: Lentidão no Sistema de Caixa de Supermercado 

O ‘Time de Qualidade’ de um supermercado da Cidade de Fortaleza/CE aplicou um questionário de avaliação do Software de Gestão de Clientes com os funcionário-caixas de um supermercado, e por meio dos feedbacks coletados notou-se que há um grande número de reclamações em relação à lentidão na busca pelo cadastro do cliente.

“Os clientes que fazem parte do clube de desconto demoram bastante para se identificar antes de eu passar os produtos. Eu digito o CPF informado e demora cerca de 20 a 30 segundos para processar. Noto que quanto mais a empresa cresce, mais lento fica esse sistema!!! Sem contar os maus tratos dos clientes pela demora no atendimento.” - Informou a funcionária do Caixa.

Devido às queixas de lentidão relatadas pelos entrevistados, o Gerente decidiu contratar um Analista de Sistemas para realizar a atualização do sistema, de forma que este profissional, possa propor uma saída mais eficiente na busca pelos clientes por meio da chave de busca: CPF.


# ***************************************************************************************************
Questão 01: Com base no problema descrito, selecionem uma estrutura de dados que possa ajudar a resolver o problema com relação a má experiência do uso do sistema com os operadores e clientes de caixas do supermercado - Marquem X na alternativa escolhida:

(  ) Listas 
(  ) Fila
(  ) Pilha
(x) Hash
(  ) Árvores


# ***************************************************************************************************
Questão 2: Justifiquem porque o time decidiu propor essa estrutura de dados? Quais os benefícios? Quais os pontos negativos? (No mínimo 60 e máximo 150 palavras).

Optamos pela utilização da tabela Hash, pois ela permitir uma busca rápida e eficiente pelo CPF do cliente. Com a tabela hash, os CPFs podem ser armazenados como chaves, e os dados do cliente associados a essas chaves. o ponto positivo é justamente a efetividade, os dados podem ser acessados mais rapidamente, evitando a lentidão na busca pelo cadastro do cliente durante o processo de compra no caixa do supermercado.  o ponto negativo seria as colisões, mas que mitigadas e tratadas de forma correta não nos faria descartar o uso da mesma visto que é a que mais se adequa ao problema em questão.


# ***************************************************************************************************
Questão 03: Codifiquem/implementem a solução da estrutura de dados proposta utilizando a linguagem de programação Java. Utilize os protótipos de baixa fidelidade para nortear a declaração e inicialização de variáveis e métodos.

## https://github.com/gabrielbarboza01/CaixaSupermercado.git ##
