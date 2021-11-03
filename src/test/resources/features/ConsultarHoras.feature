Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @romis
  Scenario Outline: Consultar las horas registradas en el proyecto elegido.
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName       | statusCode | operation | entity         |
      | ConsultarHoras | 200        | GET       | CONSULTARHORAS |

  @romi
  Scenario Outline: Agregar horas al proyecto elegido.
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'

    Examples:
      | jsonName     | statusCode | operation | entity       | expectedResponse |
      | AgregarHoras | 201        | POST      | AGREGARHORAS | users            |

  @romi
  Scenario Outline: Editar la hora registrada en el ítem 2
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'

    Examples:
      | jsonName    | statusCode | operation | entity       | expectedResponse |
      | EditarHoras | 200        | PUT       | EDITARRHORAS | users            |

  @romi
  Scenario Outline: Consultar las horas registradas en el proyecto elegido.
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'

    Examples:
      | jsonName       | statusCode | operation | entity         | expectedResponse |
      | ConsultarHoras | 200        | GET       | CONSULTARHORAS | users            |

  @romi
  Scenario Outline: Eliminar hora registrada en el ítem 2
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'

    Examples:
      | jsonName      | statusCode | operation | entity         | expectedResponse |
      | EliminarHoras | 204        | DELETE    | ELIMINARRHORAS | users            |