package co.com.puntoscolombia.certificacion.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "destinoCliente",
        "filtroVuelo",
        "contacto"


})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {


    @JsonProperty("destinoCliente")
    private DestinoCliente destinoCliente;

    @JsonProperty("filtroVuelo")
    private FiltroVuelo filtroVuelo;

    @JsonProperty("contacto")
    private Contacto contacto;


}