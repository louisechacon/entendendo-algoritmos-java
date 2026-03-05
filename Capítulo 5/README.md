# Tabelas Hash

O capítulo fala sobre tabelas hash, uma estrutura de dados que contém chaves e valores.

## Votos
Organiza uma votação, de modo que cada pessoa poderá votar apenas uma vez. O objetivo é evitar entradas duplicadas. 

De acordo com o autor, nesse caso não é recomendado armazenar os nomes em uma lista de pessoas que já votaram, pois isso deixaria esta função muito lenta eventualmente, pois uma pesquisa simples seria utilizada para pesquisar em toda a lista. A tabela hash, por outro lado, informa instantaneamente se o nome da pessoa está ou não na lista/hash dos que já votaram.