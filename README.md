# Projeto_Gulliver
projeto gulliver fiap

#APis
Pensando na arquitetura de microsservices, desenvolvemos nossa própria api para realizar cadastros de novos usuarios em nosso sistema.
A ideia é evitar que nosso serviço fique monolitico, facilitando assim, a integração do backend da aplicação.

A api foi desenvolvida 100% serverless, e sua arquitetura está no ambiente da AWS, contando com o serviço do API Gateway, Dynamodb e Lambda function. Para melhor organização, os serviços foram criados via cloudFormation, para facilitar o desenvolvimento ServerLess.

#Endpoints:
Inicialmente, nossa api conta com 3 endpoints, getPessoa/, cadastro/ e getPessoa/All.

##getPessoa/:
Responsavel por obter os dados de um usuario atraves do seu id.

##getPessoa/All:
Lista todos usuarios cadastrados no sistema.

##cadastro/
Cria um novo usuario, tendo que ser passado no body os seguintes valores:
{"id": Int, "nome" : string,"sobrenome": string,"endereco": string,"idade": string}

##Futuramente ...
Iremos implementar outros endpoints para interligação dos nossos serviços.

endpoint base: https://3cx3fbyzkj.execute-api.us-east-1.amazonaws.com/Prod/
<img width="638" alt="image" src="https://user-images.githubusercontent.com/73648247/188493407-ebec1d4c-da15-437c-bbb5-02499b06f37a.png">
