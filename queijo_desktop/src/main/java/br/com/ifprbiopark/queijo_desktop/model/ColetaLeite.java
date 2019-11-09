
package br.com.ifprbiopark.queijo_desktop.model;

import java.util.Date;


public class ColetaLeite {
    
    private Integer idColetaLeite;
    private String loteColeta;
    private Date dtColeta;
    private Produtor produtor_idProdutor;
    private double qtdLeite;

    public Integer getIdColetaLeite() {
        return idColetaLeite;
    }

    public void setIdColetaLeite(Integer idColetaLeite) {
        this.idColetaLeite = idColetaLeite;
    }

    public String getLoteColeta() {
        return loteColeta;
    }

    public void setLoteColeta(String loteColeta) {
        this.loteColeta = loteColeta;
    }

    public Date getDtColeta() {
        return dtColeta;
    }

    public void setDtColeta(Date dtColeta) {
        this.dtColeta = dtColeta;
    }

    public Produtor getProdutor_idProdutor() {
        return Produtor_idProdutor;
    }

    public void setProdutor_idProdutor(Produtor Produtor_idProdutor) {
        this.Produtor_idProdutor = Produtor_idProdutor;
    }

    public double getQtdLeite() {
        return qtdLeite;
    }

    public void setQtdLeite(double qtdLeite) {
        this.qtdLeite = qtdLeite;
    }
    
    
    
}