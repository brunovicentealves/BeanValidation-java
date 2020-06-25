package br.bruno.model.validacao.venda;

import br.bruno.model.TipoVenda;
import br.bruno.model.Venda;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TotalPorTipoValidator implements ConstraintValidator<TotalPorTipo, Venda> {

    @Override
    public void initialize(TotalPorTipo totalPorTipo) {

    }

    @Override
    public boolean isValid(Venda venda, ConstraintValidatorContext constraintValidatorContext) {

        if (venda == null){
            return  false;
        }

        boolean valido = false ;

        if (venda.getTipo()== TipoVenda.VendaPadrao && venda.getTotal()>0){
            valido=true;
        }

        if (venda.getTipo() == TipoVenda.VendaBrinde && venda.getTotal() == 0){

            valido=true;
        }

        if (!valido){
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(constraintValidatorContext.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("Tipo").addConstraintViolation();
        }


        return valido;
    }
}
