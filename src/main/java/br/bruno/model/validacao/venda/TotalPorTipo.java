package br.bruno.model.validacao.venda;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {TotalPorTipoValidator.class})
@Documented
public @interface TotalPorTipo {


    String message() default "Valor invalido para o tipo da venda.";

    Class<?>[]groups() default {};

    Class <? extends Payload>[] payload() default {};




}
