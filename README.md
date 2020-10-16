**Teste de Java Básico com Spring-Boot**


Prova de avaliação dos conhecimentos básicos de linguagem Java.

Para fazer a prova é necessário ter o java 11 e o maven 3.

O candidato deve ser implementar 2 desafios:

* Criar um serviço REST que recebe como parametros peso e altura, retornando o **IMC** que pode ser calculado pela formula abaixo:
  
    ` imc = Peso/Altura²`

* Dada uma classe Cliente, uma classe Gerente e uma classe Robo, todas devem ter um nome no qual deve atender aos seguintes requisitos:
`Não é necessário expor um serviço, queremos ver a lógica e organização`
    - Nome não pode ser nulo
    - Nome não pode ser vazio
    - Nome não pode conter espaços extras no início e no fim
    - Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João".
    - Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva".
    - Retornar o nome todo em letras maiúsculas.
    - Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva".

---

Para requisitar o serviço desenvolvido, basta requistar a endpoint (http://localhost:8080/imc/calcular/{peso}/{altura}).

Será retornado o resultado conforme exemplo a seguir:
```json
// request exemplo:
// http://localhost:8080/imc/calcular/102.00/1.80

{
   "resultado": 31.48
}
```