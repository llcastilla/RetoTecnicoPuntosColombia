package co.com.puntoscolombia.certificacion.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "valor",
        "precioVuelo"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FiltroVuelo {

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("precioVuelo")
    private String precioVuelo;
}