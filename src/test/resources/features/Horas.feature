Feature: Api example
  As an api user I want to execute request in order to get proper responses


  Scenario Outline: Consultar las horas registradas
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And   My valid workspace id
    And   My valid project id
    When I perform a '<operation>' to '<entity>' with the endpoint '<jsonName>' and ''
    Then status code <statusCode> is obtained

    #Deberia de validar el response que devuelve?
    Examples:
      | jsonName       | statusCode | operation | entity          |
      | ConsultarHoras | 200        | GET       | CONSULTAR_HORAS |


  Scenario Outline: Agregar horas al proyecto elegido.
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And   My valid workspace id
    And   My valid project id
    And Add Hora Stard <Stard> y Hora End <End>
    When I perform a '<operation>' to '<entity>' with the endpoint '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>

    #da error 404, no encuentro donde esta el error
    Examples:
      | jsonName | statusCode | operation | entity        | Stard                    | End                      |
      | AddHoras | 201        | POST      | AGREGAR_HORAS | 2021-11-09T11:48:14.000Z | 2021-12-11T20:50:14.000Z |
      | AddHoras | 201        | POST      | AGREGAR_HORAS | 2021-10-09T11:00:14.000Z | 2021-10-11T20:00:14.000Z |

  Scenario Outline: Editar la hora registrada en el ítem 2
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And   My valid workspace id
    And   My valid project id
    When I perform a '<operation>' to '<entity>' with the endpoint '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>

    #da error 404, no encuentro donde esta el error
    Examples:
      | jsonName     | statusCode | operation | entity       |
      | CambiarHoras | 200        | PUT       | EDITAR_HORAS |


  Scenario Outline: Consultar las horas registradas nuevamente.
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And   My valid workspace id
    And   My valid project id
    When I perform a '<operation>' to '<entity>' with the endpoint '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>


    Examples:
      | jsonName       | statusCode | operation | entity          |
      | ConsultarHoras | 200        | GET       | CONSULTAR_HORAS |


  Scenario Outline: Eliminar hora registrada en el ítem 2
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And   My valid workspace id
    And   My valid project id
    When I perform a '<operation>' to '<entity>' with the endpoint '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>

    #da error 404 porque ya se elimino el proyecto
    Examples:
      | jsonName    | statusCode | operation | entity         |
      | BorrarHoras | 204        | DELETE    | ELIMINAR_HORAS |