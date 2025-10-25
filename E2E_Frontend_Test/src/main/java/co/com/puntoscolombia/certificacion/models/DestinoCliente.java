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
        "diaIda",
        "diaRegreso",
        "pasajeroAdulto",
        "pasajeroNino"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DestinoCliente {

    @JsonProperty("diaIda")
    private String diaIda;

    @JsonProperty("diaRegreso")
    private String diaRegreso;


    @JsonProperty("pasajeroAdulto")
    private String pasajeroAdulto;

    @JsonProperty("pasajeroNino")
    private String pasajeroNino;
}