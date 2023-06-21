package Checkpoint;

import java.time.LocalDate;

public class Aluguel {

    private Integer idAluguel;
    private Cliente cliente;
    private Roupa roupa;
    private LocalDate dataInicio;
    private LocalDate dataFim;


    public Aluguel(Integer idAluguel, Cliente cliente, Roupa roupa, LocalDate dataInicio, LocalDate dataFim) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.roupa = roupa;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }


    public Double calcularAluguel() {
        return this.getRoupa().getPrecoRoupa();
    }

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
