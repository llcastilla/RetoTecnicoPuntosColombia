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
        "nombre",
        "correo",
        "seguroSocial",
        "telefono",
        "codigoPromocional"

})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Contacto {

    @JsonProperty("nombre")
    private String nombre;


    @JsonProperty("correo")
    private String correo;

    @JsonProperty("seguroSocial")
    private String seguroSocial;

    @JsonProperty("telefono")
    private String telefono;

    @JsonProperty("codigoPromocional")
    private String codigoPromocional;

}