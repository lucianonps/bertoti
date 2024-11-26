
## Meus Projetos

### Em 2023-1
**A Empresa Parceira:**  Faculdade de Tecnologia de São José dos Campos - FATEC.

A assistente BoardClass é uma assistente virtual web. Seu objetivo é auxiliar professores com o gerenciamento de turmas, alunos e disciplinas: permitindo a criação de novas turmas/disciplinas, agendamento de provas, adição de novos alunos, entre outras funcionalidades.
Ela funciona recebendo o comando por voz (por meio do professor) e realizando em seguida o que foi pedido. Em alguns casos, é necessário que o professor dê o comando por voz e então tenha que inserir manualmente os dados para que a ação seja concluída. Por exemplo na criação de um aluno, ele deve inserir as informações do aluno por meio do teclado do próprio computador.


[GIT](https://github.com/joaovtmarques/assistente_virtual_boardclass)

#### Tecnologias Utilizadas

-Design: Figma
-Ecossistema: Node.js
-Front End: React
-Back End: AdonisJS
-Banco de dados: PostgreSQL

### Contribuições Pessoais

#### -Nesse projeto atuei no:

Nesse projeto, atuei como desenvolvedor, contribuindo ativamente para a implementação, otimização e entrega de funcionalidades essenciais. Minhas responsabilidades incluíram o desenvolvimento de soluções, melhorias no código, e a colaboração com a equipe para garantir a qualidade e eficiência do sistema.


#### - Comando de voz:
Contribuí no desenvolvimento da funcionalidade de comando de voz, sendo responsável pela criação e estilização da interface utilizando HTML e JavaScript, além de realizar a integração com o banco de dados para armazenar e recuperar informações relacionadas ao uso dessa funcionalidade

<details>  
<summary> Saiba mais </summary>

  ![Captura de tela 2024-05-26 175302](https://github.com/lucianonps/bertoti/blob/main/portifolio-bd/1sem/co-api.png)

A imagem acima mostra a tela de comando de voz, que contém um botão para iniciar o reconhecimento de voz. A partir dos comandos falados, o sistema é capaz de realizar ações específicas, como redirecionar o usuário para a tela correspondente ao comando e transcrever todo o conteúdo falado, exibindo-o na interface em tempo real

##
```js
<children>
window.addEventListener('DOMContentLoaded', function() {
            var speakBtn = document.querySelector('#speakBtn');
            var resultSpeaker = document.querySelector('#resultSpeak');
            // testa se o navegador suporta o reconhecimento de voz
            if (window.SpeechRecognition || window.webkitSpeechRecognition) {
                // captura a voz
                var SpeechRecognition = SpeechRecognition || webkitSpeechRecognition;
                var recognition = new SpeechRecognition();
                // inicia reconhecimento
                speakBtn.addEventListener('click', function(evt) {
                    recognition.start();
                }, false);
                // resultado do reconhecimento
                recognition.addEventListener('result', function(evt) {
                    var resultSpeak = evt.results[0][0].transcript;
                    console.log(resultSpeak);
                    resultSpeaker.innerHTML = resultSpeak;
                    if (resultSpeak.match(/buscar por/)) {
                        resultSpeaker.innerHTML = 'Redirecionando...';
                        setTimeout(function() {
                            var resultado = resultSpeak.split('buscar por');
                            window.location.href = 'https://www.google.com.br/search?q=' + resultado[1];
                        }, 2000);
                    }
                    // window.location.href = 'http://' + result;
                }, false);
            } else {
                alert('Este navegador não suporta esta funcionalidade ainda!');
            }
        }, false);
 </children>
```

Ao clicar no botão associado, o reconhecimento de voz é iniciado, capturando o comando falado pelo usuário. A função processa o comando reconhecido, exibindo o texto capturado na tela e verificando se ele contém a palavra-chave "buscar por". Caso a palavra-chave seja detectada, o sistema redireciona o usuário para uma busca no Google com base no termo informado. Se o navegador não oferecer suporte ao reconhecimento de voz, uma mensagem alerta o usuário sobre a incompatibilidade.

```html
<children>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Speech Recognition App</title>
    <!-- BOOTSTRAP -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <p>fale e vai aparecer na tela </p>
                <p>É necessário ter um microfone.</p>
            </div>
        </div>
        <button class="btn btn-success btn-lg" id="speakBtn">Falar</button>
        <div id="resultSpeak">Retorno</div>
    </div>
 </children>
```
Implementei uma interface para captura de comandos de voz, utilizando HTML e Bootstrap para criar um layout responsivo e intuitivo. A funcionalidade inclui um botão que inicia o reconhecimento de voz e uma área de exibição dinâmica para mostrar o texto transcrito em tempo real.

</details>



#### -Notas: 
Fui responsável pelo desenvolvimento da funcionalidade de gerenciamento de notas, na qual implementei as funcionalidades de obtenção e exibição dos registros de notas no sistema, utilizando uma chamada assíncrona para buscar os dados e exibir alertas em caso de erro.

<details>  
<summary> Saiba mais </summary>
  
##
```js
export const Note = () => {
  const [notes, setNotes] = useState([]);
  const [alert, setAlert] = useState({
    type: "warning",
    text: "alert message",
    show: false,
  });

  useEffect(() => {
    const getNotes = async () => {
      try {
        const notes = await api.get("notes", {});

        setNotes(notes.data.notes);
      } catch (e) {
        onShowAlert("warning", 12);
      }
    };

    getNotes();
  }, []);

  function onCloseAlert(help) {
    setAlert({
      type: "",
      text: "",
      show: false,
    });
  }

  function onShowAlert(type, index) {
    setAlert({
      type: type,
      text: Globals.messages[index].message,
      show: true,
    });
  }

```
A função Note() é responsável por gerenciar a exibição e manipulação das notas no sistema. Ela realiza uma consulta à API para obter as notas, que são então armazenadas no estado notes e exibidas na interface. Caso ocorra algum erro durante a obtenção das notas, um alerta é exibido ao usuário com uma mensagem informando sobre o problema. A funcionalidade permite que as notas sejam carregadas dinamicamente e fornece feedback ao usuário em caso de falhas na operação

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
      <td>Node.js</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>React</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>AdonisJS</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>PostgreSQL</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>FIGMA</td>
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
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Responsabilidade</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Trabalho em Equipe</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Resolução de Problemas</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    
  </table>
</details>