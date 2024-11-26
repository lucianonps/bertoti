## Meus Projetos

### Em 2023-2
**A Empresa Parceira:**  Oracle.

O projeto consiste em desenvolver um sistema para acompanhar o progresso dos parceiros da Oracle no programa Oracle PartnerNetwork, além de realizar o cadastro de novos parceiros e gerenciar as informações dos parceiros já existentes da empresa.


[GIT](https://github.com/api-4-sem/api)

### Tecnologias Utilizadas

•	Spring Boot: É um framework para o desenvolvimento de aplicativos Java que facilita a criação de aplicativos robustos e escaláveis.

•	Java: É uma das linguagens de programação mais populares e amplamente utilizadas. É conhecida por sua portabilidade, robustez e segurança.

•	MySQL: É um sistema de gerenciamento de banco de dados relacional (RDBMS) de código aberto amplamente utilizado. É conhecido por sua confiabilidade, desempenho e facilidade de uso.

•	Vue.js: É um framework JavaScript progressivo utilizado para construir interfaces de usuário interativas e dinâmicas. Vue.js é apreciado por sua simplicidade e flexibilidade, permitindo aos desenvolvedores criar aplicativos escaláveis com facilidade.

•	TypeScript: É um superset da linguagem JavaScript que adiciona recursos de tipagem estática opcional e outros recursos avançados.

•	CSS : É uma linguagem de estilo utilizada para definir a apresentação de documentos HTML.


### Contribuições Pessoais

#### -Nesse projeto atuei no:

Nesse projeto atuei como desenvolvedor. minhas contribuições foram


#### -Cadastro de Parceiro:

Desenvolvi a tela de cadastro de parceiros, que foi implementada com um modal onde os dados, como código, nome, cidade, país, e informações do administrador (nome e e-mail), eram preenchidos pelo usuário.

<details>  
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-13 212916]()

A imagem acima refere-se a uma tela de cadastro de parceiro. Nele, preencheremos o nome, cidade, pais e o email para cadastrar o parceiro no sistema.

##

```js 
const parceiro = {
      codigo:this.codigo,
      nome: this.nome,
      cidade: this.cidade,
      pais: this.pais,
      adminNome:this.adminNome,
      adminEmail: this.email,
    };

    axios.post('/criar-empresas', parceiro)
      .then(response => {
        Swal.fire({
            text: "Partner cadastrado com sucesso ",
            icon: "success",
            showConfirmButton:false,
            timer:2000
        });
        this.resetForm();
      })
      .catch(error => {
        console.error('Erro ao cadastrar partner:', error);
        Swal.fire({
            title: "ops...",
            text: "Erro ao cadastrar partner",
            icon: "error",
            showCloseButton: true,
        });
      });
```
A função responsável pelo cadastro de parceiros na aplicação cria um objeto contendo os dados do parceiro, como código, nome, cidade, país, e informações do administrador (nome e e-mail). Em seguida, realiza uma requisição HTTP POST para o endpoint /criar-empresas, enviando esse objeto.
Se a requisição for bem-sucedida, uma notificação é exibida ao usuário confirmando o cadastro do parceiro e os campos do formulário são resetados. Caso ocorra um erro, uma mensagem de alerta é exibida informando o problema e pedindo ao usuário para tentar novamente.

</details>



#### -Visualização de parceiros: 

Implementei a funcionalidade de visualização de parceiros na tela, permitindo que os dados, como código, nome, cidade, país e informações adicionais, sejam carregados dinamicamente.

<details>  
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-15 205239]()

A imagem acima refere-se à visualização de parceiros, onde é possível ver os parceiros cadastrados no sistema.

##
```js

export default class VisualizacaoParceiros extends Vue {
    listaParceiros: any[] = [];

    async mounted() {
        await this.getParceiros();
    }

    async getParceiros() {
        try {
            const response = await axios.get("carregar-empresas");
            console.log(response.data);
            this.listaParceiros = response.data;
        } catch (error) {
            console.log("Erro:", error);
        }
    }
}

```
A classe VisualizacaoParceiros é responsável por exibir uma lista de parceiros cadastrados e utiliza a estrutura Vue.js para sua implementação. Dentro dela, a função getParceiros() realiza uma requisição HTTP GET para o endpoint carregar-empresas, buscando os dados dos parceiros e preenchendo a lista exibida na interface

  
</details>


#### -Dashboard: 

Desenvolvi uma funcionalidade que permite ao usuário selecionar uma empresa e, a partir dessa seleção, gerar gráficos dinâmicos. Ao escolher a empresa, os dados das trilhas relacionadas são buscados e processados, criando um gráfico categorizado com os nomes das trilhas e o progresso dos colaboradores.


<details>
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-26 175302]()

A imagem acima refere-se à tela de Dashboard, onde é possível visualizar gráficos dinâmicos.

##

```js
changeCompany(id:number){
        this.selectedCompany = id;

        axios.get(`dash/trilhas/empresa/${this.selectedCompany}`)
        .then(response => {
            const trilhas = response.data;
            console.log(trilhas)
            const data = {
                labels: trilhas.map((trilha: { nome: string }) => trilha.nome),
                values: trilhas.map((trilha: { progressoColaborador: number }) => trilha.progressoColaborador)
            };
            const categoryChartConfig = this.createCategoryChartConfig(data);
            this.createChart("category", categoryChartConfig);
        })
        .catch(error => {
            console.error("Erro ao buscar dados da categoria:", error);
            
        });
    }
```
A função changeCompany(id: number) é responsável por atualizar os dados exibidos na dashboard com base na empresa selecionada pelo usuário. Ela realiza uma requisição para obter as trilhas de treinamento relacionadas à empresa, processa os dados recebidos e configura os parâmetros necessários para criar um gráfico categorizado

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