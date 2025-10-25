Feature: Agendar viaje en línea con filtro de precios
  Como Product Owner
  Quiero agendar un viaje en línea con el filtro de precios
  Para entregar independencia a mis clientes al momento de elegir su destino

  Scenario Outline: Agendar viaje en línea con filtro de precios
    Given el usuario ingresa los datos del viaje desde <data>
    When aplica el filtro de precios y selecciona el destino parametrizado
    And completa los datos del formulario y realiza el pago
    Then el sistema muestra la confirmación del viaje agendado exitosamente

    Examples:
      | data            |
      | dataCliente |
      | dataCliente1 |
      | dataCliente2 |
      | dataCliente3 |