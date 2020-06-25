package br.bruno.model;

import br.bruno.model.validacao.venda.TotalPorTipo;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@TotalPorTipo(message = "O tipo não permite o valor informado")
public class Venda {

    @NotNull(message = "A lista de itens  não poder nula ")
    @Size(min = 1, message = "A lista de itens deve  conter pelo menos um item ")
    @Valid
    private List<ItemVenda> itens;

    @NotNull(message = "A data da venda não pode ser nula ")
    private Date data;

    @DecimalMin(value = "0" , message = "O valor da venda deve ser igual ou maior  que Zero ")
    private float total;

    @NotNull(message = "o Tipo da venda não pode ser nulo ")
    private TipoVenda tipo;

    public Venda() {
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public TipoVenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoVenda tipo) {
        this.tipo = tipo;
    }
}
