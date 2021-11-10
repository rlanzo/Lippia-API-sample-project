Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @romis
  Scenario Outline: 1) Consultar las horas registradas en el workspace
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>


    Examples:
      | jsonName       | statusCode | operation | entity         |
      | ConsultarHoras | 200        | GET       | CONSULTARHORAS |


  Scenario Outline: Agregar horas al proyecto elegido.
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName | statusCode | operation | entity       |
      | AddHoras | 201        | POST      | AGREGARHORAS |

  Scenario Outline: Editar la hora registrada en el ítem 2
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName     | statusCode | operation | entity       |
      | CambiarHoras | 200        | PUT       | EDITARRHORAS |


  Scenario Outline: Consultar las horas registradas en el proyecto elegido.
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName       | statusCode | operation | entity         |
      | ConsultarHoras | 200        | GET       | CONSULTARHORAS |

  Scenario Outline: Eliminar hora registrada en el ítem 2
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName    | statusCode | operation | entity         |
      | BorrarHoras | 204        | DELETE    | ELIMINARRHORAS |