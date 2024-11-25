## Meus Projetos

### Em 2023-2
**A Empresa Parceira:**  2RP.

O projeto envolve a criação de um sistema para controlar a jornada de trabalho dos colaboradores, capaz de identificar e classificar horas extras, além de gerenciar o registro e controle dessas horas extras e sobreavisos. Um dos principais desafios que a empresa enfrentava era a dificuldade em registrar com precisão as horas extras dos colaboradores. Para resolver essa questão, optamos por desenvolver um aplicativo capaz de registrar de forma abrangente as horas trabalhadas e que possa ser monitorado pela empresa.
A empresa parceira é a 2RP, reconhecida por sua atuação na análise de transações financeiras e de dados.


[GIT](https://github.com/api-3sem-pixel-api/api)

### Tecnologias Utilizadas

•	Spring Boot: É um framework para o desenvolvimento de aplicativos Java que facilita a criação de aplicativos robustos e escaláveis.

•	Java: É uma das linguagens de programação mais populares e amplamente utilizadas. É conhecida por sua portabilidade, robustez e segurança.

•	MySQL: É um sistema de gerenciamento de banco de dados relacional (RDBMS) de código aberto amplamente utilizado. É conhecido por sua confiabilidade, desempenho e facilidade de uso.

•	Vue.js: É um framework JavaScript progressivo utilizado para construir interfaces de usuário interativas e dinâmicas. Vue.js é apreciado por sua simplicidade e flexibilidade, permitindo aos desenvolvedores criar aplicativos escaláveis com facilidade.

•	TypeScript: É um superset da linguagem JavaScript que adiciona recursos de tipagem estática opcional e outros recursos avançados.

•	CSS : É uma linguagem de estilo utilizada para definir a apresentação de documentos HTML.


### Contribuições Pessoais

#### -Nesse projeto atuei no:

•	Frontend: utilizando as tecnologias de vue e typescrip ;

•	Figma;


#### -Cadastro de cliente:

Desenvolvi a tela de cadastro de cliente, que foi implementada em forma de um modal no qual os dados, como CNPJ e razão social, eram preenchidos. Para a realização desse modal, foram necessárias comunicação HTTP e criação de layout.

<details>  
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-13 212916](https://github.com/lucianonps/bertoti/assets/102562662/16803d2b-1c4a-4ca1-a51a-a75a89b31e25)

A imagem acima refere-se a um modal para cadastrar clientes. Nele, preencheremos o CNPJ e a razão social para cadastrar a empresa no sistema.

##

```vuejs
save() {
            const createCliente = {
                razaoSocialCliente: this.nomeRs,
                cnpjCliente: this.siglaCnpj, 
                ativo:this.ativo,
                idCliente: 0
            }


            http.post('/cliente', createCliente)
                .then(_ => alert('Cliente salvo !!!'))
                .catch(_ => alert('Tente Novamente '))
                .finally(() => {
                    this.clear()


                });


        },
```
A função save() pertence à tela de cadastro de cliente e é responsável por salvar as informações de um novo cliente no sistema. Ela cria um objeto com os dados do cliente, incluindo razão social, CNPJ, estado ativo/inativo e um ID inicializado em zero. Em seguida, realiza uma requisição HTTP POST para o endpoint /cliente, enviando esse objeto. Se a requisição for bem-sucedida, um alerta confirma o salvamento do cliente; caso contrário, um alerta pede ao usuário para tentar novamente. Finalmente, a função limpa os campos do formulário.

</details>



#### -Combobox: 

Implementei o combobox na tela de lançamento de hora extra para que pudesse obter os dados de CR, modalidade e cliente, possibilitando assim que sejam anexados quando a hora extra for lançada.

<details>  
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-15 205239](https://github.com/lucianonps/bertoti/assets/102562662/84ef4a5c-5204-4987-a521-11c944cf0601)

A imagem acima refere-se à implementação de um combobox. Nele, selecionamos os dados de cliente, modalidade e CR, o que nos permite preencher os outros campos da tela e consequentemente, lançar a hora com exatidão.

##
```vuejs

ComboboxModalidade() {
    http.get("/modalidade")
      .then(response => {
        this.listmodal = response.data
      })

  }

```
A função ComboboxModalidade(),ComboboxCr() e ComboboxCliente() faz parte da tela de lançamento de horas extras e é responsável por preencher um combobox (caixa de seleção) com dados específicos de acordo com o usuário autenticado.
Essa função é crucial para a tela de lançamento de horas extras, pois garante que o combobox seja populado com opções relevantes e personalizadas para o usuário atual. Ao fazer isso, facilita a seleção de critérios ou categorias específicas necessárias para o lançamento correto das horas extras.

  
</details>


#### -Relatório: 

Desenvolvi uma tela de relatório que permite ao usuário gerar um gráfico em Excel utilizando um botão. A tela inclui um campo de entrada onde o usuário pode digitar a data de início e a data de fim, permitindo filtrar os dados e gerar um relatório entre essas duas datas.


<details>
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-26 175302](https://github.com/lucianonps/bertoti/assets/102562662/1820b42b-c7f7-4281-b614-d718c1b17873)

A imagem acima refere-se à tela de relatório, onde é gerado um arquivo sobre as horas extras dos colaboradores. Nesta tela, o usuário pode inserir uma data de início e uma data de fim para filtrar os dados, permitindo a geração de um relatório detalhado entre essas duas datas. 

##

```vuejs
async gerar() {

    try {
    const response = await http.get('/relatorio',{responseType:'arraybuffer', params:this.relatorio});
    var blob = new Blob([response.data]);
    var link = document.createElement('a');
    link.href = URL.createObjectURL(blob);
    link.download ='extrato_horas.xls';
    link.click()

    
  } catch (error) {
    console.error('Erro na solicitação de relatório:', error);
    alert('Erro ao gerar relatório. Tente novamente.');
  }
}
```
A função async gerar() é responsável por gerar e baixar um relatório de horas extras dos colaboradores no formato Excel. Ela faz parte da funcionalidade da tela de relatório mencionada anteriormente, onde os usuários podem filtrar dados por data de início e fim para gerar um relatório detalhado.

##

  
</details>

#### Hard Skills
<details>
  <summary><b>Clique para ver a lista de hard skills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>VUE</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>HTML/CSS</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>SQL</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>MYSQL</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>REST</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>UX/UI design</td>
      <td>★★★★★★★★★☆</td>
    </tr>
  </table>
</details>

#### Soft Skills
<details>
  <summary><b>Clique para ver a lista de softskills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Responsabilidade</td>
      <td>★★★★★★★★★☆</td>
    </tr>
    <tr>
      <td>Trabalho em Equipe</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Resolução de Problemas</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    
  </table>
</details>