package br.com.ifprbiopark.queijo_desktop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static Conexao unique;

    public Connection conexao;

    private Conexao() {
        try {
            conexao = DriverManager.getConnection("jdbc:sqlite:bancoqueijos.db");

            Statement statement = conexao.createStatement();
                   
            // criando tabelas
            statement.execute("  CREATE TABLE IF NOT EXISTS atributos (" +
                                "  idAtributo INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "  nomeAtributo VARCHAR(45) NOT NULL)");
            
            statement.execute("  CREATE TABLE IF NOT EXISTS pessoa (" +
                                "  idPessoa INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "  nome VARCHAR(45) NOT NULL," +
                                "  endereco VARCHAR(50) NOT NULL," +
                                "  tipoFiscal VARCHAR(1) NOT NULL," +
                                "  cadastro VARCHAR(14) NOT NULL," +
                                "  telefone VARCHAR(15)," +
                                "  tipoPessoa VARCHAR(45) NOT NULL)");

            statement.execute("  CREATE TABLE IF NOT EXISTS coletaleite (" +
                                "  idColetaLeite INTEGER PRIMARY KEY," +
                                "  loteColeta VARCHAR(45) NOT NULL," +
                                "  dtColeta DATE NOT NULL," +
                                "  Produtor_idProdutor INTEGER NOT NULL REFERENCES pessoa (idPessoa)," +
                                "  qtdLeite DOUBLE NOT NULL," +
                                "  Pessoa_idPessoa INTEGER NOT NULL REFERENCES pessoa (idPessoa)");
            
            statement.execute("  CREATE TABLE IF NOT EXISTS entradaatributo (" +
                                "  idEntradaAtributo INTEGER PRIMARY KEY," +
                                "  valor VARCHAR(10) NOT NULL," +
                                "  Atributos_idAtributo INTEGER NOT NULL REFERENCES atributos(idAtributo)," +
                                "  ColetaLeite_idColetaLeite INTEGER NOT NULL REFRENCES coletaleite (idColetaLeite)");

            statement.execute("  CREATE TABLE IF NOT EXISTS fermento (" +
                                "  idFermento INTEGER PRIMARY KEY," +
                                "  tipoFermento VARCHAR(45) NOT NULL," +
                                "  Marca VARCHAR(45) NOT NULL)");

            statement.execute("  CREATE TABLE IF NOT EXISTS processamento (" +
                                "  idProcessamento INTEGER PRIMARY KEY," +
                                "  TipoProcessamento VARCHAR(45) NOT NULL)");

            statement.execute("  CREATE TABLE IF NOT EXISTS tipoqueijo (" +
                                "  idTipoQueijo INTEGER PRIMARY KEY," +
                                "  nomeTipo VARCHAR(45) NOT NULL)");

            statement.execute("  CREATE TABLE IF NOT EXISTS fabricacaoqueijo (" +
                                "  idFabricacaoQueijo INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "  TipoQueijo_idTipoQueijo INTEGER NOT NULL REFRENCES tipoqueijo(idTipoQueijo)," +
                                "  dataFabricacao DATE NOT NULL," +
                                "  loteQueijo VARCHAR(45) NOT NULL," +
                                "  ColetaLeite_idColetaLeite INTEGER NOT NULL REFERENCES coletaleite(idColetaLeite)," +
                                "  Processamento_idProcessamento INTEGER NOT NULL REFERENCES processamento(idProcessamento)," +
                                "  tempoProcessamento INTEGER NOT NULL," +
                                "  temperaturaProcessamento INTEGER NOT NULL," +
                                "  temperaturaPreMaturacao INTEGER NOT NULL," +
                                "  Fermento_idFermento INTEGER NOT NULL REFERENCES fermento (idFermento)," +
                                "  qtdFermento NUMERIC(14,2) NOT NULL," +
                                "  tempoMaturacao INTEGER NOT NULL," +
                                "  phMaturacao NUMERIC(14,2) NOT NULL," +
                                "  temperaturaCoagulacao INTEGER NOT NULL," +
                                "  qtdClCalcio NUMERIC(14,2) NOT NULL," +
                                "  qtdCoagulante NUMERIC(14,2) NOT NULL," +
                                "  tempoCoagulacao INTEGER NOT NULL," +
                                "  phCorte NUMERIC(14,2) NOT NULL," +
                                "  phEnformagem NUMERIC(14,2) NOT NULL," +
                                "  phFinal NUMERIC(14,2) NOT NULL," +
                                "  dessoragem INTEGER NOT NULL," +
                                "  temperaturaDessoragem INTEGER NOT NULL," +
                                "  tipoSalga VARCHAR(45) NULL DEFAULT NULL," +
                                "  dataMaturacao DATE NULL DEFAULT NULL," +
                                "  temperaturaMaturacao INTEGER NULL DEFAULT NULL," +
                                "  dataLavagem DATE NULL DEFAULT NULL," +
                                "  tipoTratamento VARCHAR(45) NULL DEFAULT NULL," +
                                "  tempoTratamento INTEGER NULL DEFAULT NULL," +
                                "  qtdPecas INTEGER NOT NULL," +
                                "  pesoMPecas NUMERIC(14,2) NOT NULL," +
                                "  pesoTotal NUMERIC(14,2) NOT NULL," +
                                "  observacoes LONGTEXT NULL DEFAULT NULL," +
                                "  Responsavel_idResponsavel INTEGER NOT NULL REFERENCES pessoa (idPessoa)");

//            statement.execute("CREATE TABLE IF NOT EXISTS `pessoa` ("
//                    + "  `idPessoa` INTEGER PRIMARY KEY,"
//                    + "  `nome` VARCHAR(45) NOT NULL,"
//                    + "  `endereco` VARCHAR(50) NOT NULL,"
//                    + "  `tipoFiscal` VARCHAR(1) NOT NULL,"
//                    + "  `cadastro` VARCHAR(14) NOT NULL,"
//                    + "  `tipoPessoa` VARCHAR(45) NOT NULL)");

//            statement.execute("CREATE TABLE IF NOT EXISTS `coletaleite` ("
//                    + "  `idColetaLeite` INTEGER PRIMARY KEY,"
//                    + "  `loteColeta` VARCHAR(45) NOT NULL,"
//                    + "  `dtColeta` DATE NOT NULL,"
//                    + "  `qtdLeite` DOUBLE NOT NULL,"
//                    + "  `Pessoa_idPessoa` INTEGER NOT NULL,"                    
//                    + "  CONSTRAINT `fk_ColetaLeite_Pessoa1`"
//                    + "    FOREIGN KEY (`Pessoa_idPessoa`)"
//                    + "    REFERENCES `mydb`.`pessoa` (`idPessoa`))");

        } catch (SQLException ex) {
            conexao = null;
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Conexao getInstance() {
        if (unique == null) {
            unique = new Conexao();
        }
        return unique;
    }

    public ResultSet executarConsulta(String sql) {
        PreparedStatement pstm;
        ResultSet rs;
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    NamedParameterStatement NamedParameterStatement(String sql) throws SQLException {
        return new NamedParameterStatement(conexao, sql);
    }

    NamedParameterStatement NamedParameterStatement(String sql, int RETURN_GENERATED_KEYS) throws SQLException {
        return new NamedParameterStatement(conexao, sql, RETURN_GENERATED_KEYS);
    }

}
