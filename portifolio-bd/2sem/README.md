
## Meus Projetos

### Em 2023-1
**A Empresa Parceira:**  2RP.

O projeto envolve a criação de um sistema para controlar a jornada de trabalho dos colaboradores, capaz de identificar e classificar horas extras, além de gerenciar o registro e controle dessas horas extras e sobreavisos. Um dos principais desafios que a empresa enfrentava era a dificuldade em registrar com precisão as horas extras dos colaboradores. Para resolver essa questão, optamos por desenvolver um aplicativo capaz de registrar de forma abrangente as horas trabalhadas e que possa ser monitorado pela empresa.
A empresa parceira é a 2RP, reconhecida por sua atuação na análise de transações financeiras e de dados.


[GIT](https://github.com/api-2-sem/api)

#### Tecnologias Utilizadas
- Java: Linguagem principal utilizada no nosso projeto. A linguagem foi amplamente adotada tanto na manipulação dos dados quanto na crição de eventos atrelados a exibição de dados desses.

- CSS: Utilizado na estilização das telas. Foi escolhido pois se adequava com a ferramenta de criação de layout SceneBuilder  

- MySQL: Sua confiabilidade, desempenho e facilidade de uso garatiram sua escolha.Permite realizar a persistência e integridade dos dados do sistema.


### Contribuições Pessoais

#### -Nesse projeto atuei no:

Nesse projeto atuei como desenvolvedor. minhas contribuições foram


#### - Desenvolvimento da Tela de Lançamento de Horas:
Contribuí no desenvolvimento da tela de lançamento de horas, sendo responsável pela estilização com css e FXML, integração com o banco de dados e pela implementação da funcionalidade de preenchimento dos comboboxes.

<details>  
<summary> Saiba mais </summary>
  
##

```FXML
<children>
                        <TableView fx:id="table_lancamento" centerShape="false" editable="true" layoutX="18.0" layoutY="115.0" prefHeight="401.0" prefWidth="800.0" AnchorPane.leftAnchor="18.0" AnchorPane.rightAnchor="42.0">
                          <columns>
                              <TableColumn fx:id="col_cr" prefWidth="93.6000394821167" styleClass="rp-column" text="CR" />
                            <TableColumn fx:id="col_projeto" prefWidth="75.0" styleClass="rp-column" text="Projeto" />
                              <TableColumn fx:id="col_cliente" prefWidth="75.0" styleClass="rp-column" text="Cliente" />
                              <TableColumn fx:id="col_modalidade" prefWidth="138.3999786376953" styleClass="rp-column" text="Modalidade" />
                              <TableColumn fx:id="col_inicio" prefWidth="111.20001220703125" styleClass="rp-column" text="Inicio" />
                              <TableColumn fx:id="col_fim" prefWidth="75.0" styleClass="rp-column" text="Fim" />
                              <TableColumn fx:id="col_justificativa" prefWidth="75.0" styleClass="rp-column" text="Justificativa" />
                              <TableColumn fx:id="col_motivo" prefWidth="75.0" styleClass="rp-column" text="Motivo" />
                              <TableColumn fx:id="col_acoes" prefWidth="75.0" styleClass="rp-column" text="Ações" />
                              <TableColumn fx:id="col_id" editable="false" prefWidth="93.6000394821167" styleClass="rp-column" text="ID" visible="false" />
                          </columns>
                           <columnResizePolicy>
                              <TableView fx:constant="CONSTRAINED_RESIZE_POLICY" />
                           </columnResizePolicy>
                        </TableView>
                        <Label layoutX="258.0" layoutY="31.0" prefHeight="39.0" prefWidth="354.0" text="Lançamento de Horas Extras" textFill="#483fee">
                           <font>
                              <Font size="27.0" />
                           </font>
                        </Label>
                        <Button fx:id="btn_adicionarLinha" layoutX="14.0" layoutY="538.0" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="62.0" mnemonicParsing="false" onAction="#criarNovaLinha" prefHeight="40.0" prefWidth="62.0" styleClass="MYButton" text="+" />
                        <Button fx:id="btn_lancar" layoutX="123.0" layoutY="538.0" mnemonicParsing="false" onAction="#lancarHoras" prefHeight="40.0" prefWidth="155.0" styleClass="MYButton" text="Lançar" />
 </children>
```
Este código em FXML define a interface gráfica para uma tela de lançamento de horas extras no framework JavaFX.Ele inclui os seguintes elementos principais:
TableView,Label e Botões. 

```java
<children>
private void carregarComboBox() {
        this.comboBox_cr = crDAO.obterCombobox();
        this.comboBox_modalidade = modalidaeDAO.obterCombobox();
        this.comboBox_motivo = motivoDAO.obterCombobox();
        this.comboBox_cliente = clienteDAO.obterCombobox();
    }
 </children>
```
Implementei um método para carregar os valores de diversos comboboxes na interface, utilizando DAOs específicos para buscar dados do banco de dados. Essa funcionalidade permite preencher dinamicamente os campos relacionados a CR, modalidade, motivo e cliente.

</details>



#### -ExtratoHoraDAO: 
Fui responsável pelo desenvolvimento do DAO (Data Access Object) para o extrato de horas, no qual implementei as funcionalidades de obtenção e lançamento de registros de horas trabalhadas.

<details>  
<summary> Saiba mais </summary>
  
##
```java
public class ExtratoHoraDAO extends BaseDAO {

    public ExtratoHoraDAO(Connection connection) {
        super(connection);
    }

    public ArrayList<ExtratoHoraModel> obterExtratosLancados(int userId){
        String sql = "select b.Nome Cr, " +
                        "a.Projeto, " + 
                        "c.Descricao Modalidade, " +
                        "a.DataHora_Inicio Inicio, " + 
                        "a.DataHora_Fim Fim, " +
                        "d.Descricao Motivo, " + 
                        "a.Id_Modalidade Id_Modalidade, " + 
                        /* "d.Possivel_Edicao PossivelEditar, " +  */
                        "c.Descricao Modalidade, " +
                        "a.Id IdExtrato, " +
                        "e.Razao_Social NomeCliente, " +
                        "a.Justificativa Justificativa, " +
                        "a.Id_Etapa_Extrato " + 
                    "from Extrato_Hora a  " + 
                    "inner join Cr b on a.Id_Cr = b.Id " + 
                    "inner join Modalidade c on c.Id = a.Id_Modalidade " + 
                    "inner join Motivo d on d.Id = a.Id_Motivo " +
                    "inner join Cliente e on e.Id = a.Id_Cliente " +
                    "where a.Id_Usuario = " + userId; 

        return this.executarQuery(sql, resultSet -> {
            try {
                var model = new ExtratoHoraModel();
                
                model.setCr(resultSet.getString(1));
                model.setProjeto(resultSet.getString(2));
                model.setModalidade(resultSet.getString(3));
                
                var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                var inicio = resultSet.getString(4);
                model.setDataHoraInicio(LocalDateTime.parse(inicio, formatter));
                var fim = resultSet.getString(5);
                model.setDataHoraFim(LocalDateTime.parse(fim, formatter));
                
                model.setMotivo(resultSet.getString(6));
                model.setIdModalidade(resultSet.getInt(7));
                model.setModalidade(resultSet.getString(8));
                model.setId(resultSet.getInt(9));
                model.setCliente(resultSet.getString(10));
                model.setJustificativa(resultSet.getString(11));
                model.setStatus(resultSet.getInt(12));

                return model;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        });
    }

    public int lancarHora(ExtratoHoraModel model) {
        String sql = "INSERT INTO Extrato_Hora(Projeto, Id_Cliente, Id_Etapa_Extrato, Id_Cr, Id_Usuario, Id_Modalidade, Id_Motivo, DataHora_Inicio, DataHora_Fim, Justificativa) " +
                "VALUES ('" + model.getProjeto() + "'," 
                    + model.getIdCliente() + ","
                    + 1 + ","
                    + model.getIdCr() + "," 
                    + model.getIdUsuario() + "," 
                    + model.getIdModalidade() + "," 
                    + model.getIdMotivo() + ",'" 
                    + model.getDataHoraInicio().toString() + "','"
                    + model.getDataHoraFim().toString() + "','" 
                    + model.getJustificativa() + "')";

        return executeUpdate(sql);
    }
}

```
Foi implementada a função de recuperação de extratos de horas lançadas, realizando uma consulta no banco de dados com base no ID do usuário e retornando informações como projeto, cliente, modalidade, datas de início e fim, motivo e justificativa. Também foi desenvolvida a funcionalidade de inserção de novos registros de horas, permitindo o lançamento de horas com dados detalhados, como projeto, cliente, modalidade, motivo e justificativa, diretamente no banco de dados.

  
</details>


#### -Relatório: 
Fui responsável pela criação de um controlador para a geração de relatórios no formato CSV, que realiza a consulta dos dados de extrato de horas no banco de dados com base em parâmetros como projeto, data de início e data de término. O controlador organiza essas informações e as exporta em um arquivo CSV, facilitando a análise e o acompanhamento das horas registradas.


<details>
<summary> Saiba mais </summary>
  
![Captura de tela 2024-05-26 175302](https://github.com/lucianonps/bertoti/blob/main/portifolio-bd/2sem/image.png)

A imagem acima mostra a tela de visualização, que inclui um botão para gerar o relatório. será gerado em formato CSV com base nos dados filtrados pelos parâmetros fornecidos.

##

```java
 @FXML
    private ComboBox<?> tuUsuario;

    @FXML
    private TextField tpProjeto;

    @FXML
    private DatePicker dataInicio;

    @FXML
    private DatePicker dataFim;

    @FXML
    public void GerarRelatorio(ActionEvent event) {
        String csvFilePath = "relatorio.csv";
        Connection connection = new ConnectionFactory().recuperarConexao();
        ExtratoHoraDAO extrato = new ExtratoHoraDAO(connection);

        var projeto = tpProjeto.getText();
        LocalDate datai = dataInicio.getValue();
        LocalDate dataF = dataFim.getValue();
        ArrayList<ExtratoHoraModel> dados = extrato.obterRelatorioGerente(datai, dataF, projeto, 1);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath))) {
            writer.write("Projeto,Modalidade, Hora de Inicio, Hora Final, Motivo ");
            writer.newLine();

            for (ExtratoHoraModel extrat : dados) {
                String projet = extrat.getProjeto();
                String modalidade = extrat.getModalidade();
                LocalDateTime inicio = extrat.getDataHoraInicio();
                LocalDateTime fim = extrat.getDataHoraFim();
                String motivo = extrat.getMotivo();

                writer.write(projet + "," + modalidade + "," + inicio + "," + fim + "," + motivo);
                writer.newLine();
            }

            MensagemRetorno.RelatorioGerado();

            System.out.println("Arquivo CSV gerado com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
```
A função GerarRelatorio() é responsável por gerar e salvar um relatório de extratos de horas no formato CSV. Ela consulta o banco de dados com base nos parâmetros fornecidos pelo usuário, como o projeto e as datas de início e fim, e exporta os dados em um arquivo CSV. Essa funcionalidade permite aos usuários obter um relatório detalhado contendo informações sobre o projeto, modalidade, horário de início e fim, e motivo do lançamento de horas.

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
      <td>SceneBuilder/HTML/CSS</td>
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
      <td>JAVA</td>
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