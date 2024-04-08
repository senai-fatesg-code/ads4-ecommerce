#Aula 08-04 SENAI

##Status HTTP por verbos

### Status globais
* 400 - geralmente erro de negócio
* 405 - formato de envio inválido
* 407 - proxy
* 401 - não autorizado
* 403 - acesso negado
* 415 - 415 (tipo de mídia não suportado)
* 500 Erro interno do servidor
* 501 Não Implementado
* 502 Bad Gateway
* 503 serviço indisponível
* 504 Tempo limite do gateway


### POST
* 201 (Created) SHOULD
* 200 (OK) or 204 (No Content)
* 303 (See Other) - redirecionamento

### GET
https://www.rfc-editor.org/rfc/rfc9110.html#name-get
* 200 - OK - Encontrei alguma coisa
*  304 (Not Modified)  - Range é ignorado quando um GET condicional resultaria em uma resposta 304 (Não Modificada) .
* 206 (Partial Content) - , o servidor DEVE enviar uma resposta 206 (Conteúdo Parcial) com conteúdo contendo uma ou mais representações parciais que correspondam às especificações de intervalo satisfatórias solicitadas.
* 416 (Range Not Satisfiable) response. - Range fora do intervalo

###PUT
Atualiza registro. Se não encontrar registro para atualizar, cria.
* 200 (OK) or a 204 (No Content)
*  201 (Created)  - se não encontrar recurso para atualização, é criado um novo recurso.
* 409 Conflict - O código de status 409 (Conflito) indica que a solicitação não pôde ser concluída devido a um conflito com o estado atual do recurso de destino. Este código é usado em situações em que o usuário pode resolver o conflito e reenviar a solicitação. O servidor DEVE gerar conteúdo que inclua informações suficientes para que um usuário reconheça a origem do conflito.

### DELETE
* status 202 (Aceito) se a ação provavelmente será bem-sucedida, mas ainda não foi decretada,
* status 204 (Sem conteúdo) se a ação foi decretada e nenhuma informação adicional deve ser fornecida, ou
* status 200 (OK) se a ação tiver sido executada e a mensagem de resposta incluir uma representação que descreve o status.

### OPTIONS
* O método OPTIONS solicita informações sobre as opções de comunicação disponíveis para o recurso de destino, no servidor de origem ou em um intermediário interveniente. Este método permite que um cliente determine as opções e/ou requisitos associados a um recurso, ou as capacidades de um servidor, sem implicar uma ação de recurso.
* Resumindo: traz os métodos permitidos que a API responde.

### PATCH
https://www.rfc-editor.org/rfc/rfc5789
* status 204 (Sem conteúdo) é usado, porque a resposta não carrega um corpo de carga útil.
* Uma 200 (OK) resposta poderia conter um corpo de carga útil.
* 400 (solicitação incorreta) - Documento de patch malformado - O conteúdo do arquivo contém erros.
* 415 (tipo de mídia não suportado) - Documento de patch não suportado. Indica que o recurso enviado não é suportado. Exemplo: enviar json para API quando ela espera xml.
* resposta 422 (Entidade não processável) - O código de status 422 (Entidade Não Processável) significa que o servidor entende o tipo de conteúdo da entidade solicitada (portanto, um
  415 (código de status de tipo de mídia não suportado) é inadequado) e o
  a sintaxe da entidade de solicitação está correta (portanto, um 400 (Bad Request)
  o código de status é inadequado), mas não foi possível processar o código de status contido
  instruções. Por exemplo, esta condição de erro pode ocorrer se um XML
  o corpo da solicitação contém informações bem formadas (ou seja, sintaticamente corretas), mas
  instruções XML semanticamente erradas.

Requisição PATCH:

```http
PATCH /api/users/123 HTTP/1.1
Host: example.com
Content-Type: application/json
Content-Length: 26

{
    "name": "Jo"
}
```
Resposta 422 (Unprocessable Entity):

```http
HTTP/1.1 422 Unprocessable Entity
Content-Type: application/json
Content-Length: 76

{
    "error": "Unprocessable Entity",
    "message": "O nome fornecido é muito curto, deve ter pelo menos 3 caracteres"
}
```
Neste exemplo, a requisição PATCH está tentando atualizar o nome do usuário com um nome muito curto. O servidor reconhece o tipo de conteúdo e a sintaxe da entidade solicitada (ou seja, a requisição está em JSON e bem formada), mas não pode processar a instrução contida (porque o nome é muito curto). Assim, o servidor responde com um código de status 422 e uma mensagem explicativa indicando o motivo da falha.