"# h2CurrencyConverter" 

📌 Descrição

Aplicação de console que realiza conversão de moedas a partir de taxas reais obtidas por uma API de câmbio.
O usuário informa a moeda de origem, a moeda de destino e o valor, e o sistema retorna o valor convertido.

O projeto foi estruturado para separar responsabilidades entre:

- entrada do usuário
- consumo de API
- lógica de conversão

🛠️ Tecnologias utilizadas

- Java 17
- API de câmbio (Exchange Rates)
- Gson (para desserialização de JSON)
- IntelliJ IDEA

📂 Estrutura do projeto

- Main: ponto de entrada da aplicação e inicialização das dependências
- Menu: interação com o usuário (entrada e saída)
- ApiClient: responsável por consumir a API externa
- ConverterService: lógica de conversão de moedas
- Records (DTOs): mapeamento dos dados retornados pela API
  
▶️ Como executar

- Clone o repositório
- Certifique-se de ter o Java 17 instalado
- Adicione a dependência do Gson
- Execute a classe Main
- Siga as instruções exibidas no terminal

🧠 Aprendizados

- Durante o desenvolvimento deste projeto, foram praticados conceitos como:
- Consumo de API com HttpClient
- Desserialização de JSON com Gson
- Uso de record para DTOs
- Separação de responsabilidades
- Injeção de dependências manual
- Tratamento correto de entrada de dados com Scanner