@tag
Feature: Iniciar seccion
  Juan Desea  entrar a  hotmail y iniciar seccion

  @tag1
  Scenario: iniciar seccion en hotmail
    Given juan puede entrar a la pagina inicial de hotmail
    When el ingresa credencial
      | user   | password   |
      | jaquintero05@hotmail.com| <password> |
    Then el validad si se inicio seccion corretamente
    
 