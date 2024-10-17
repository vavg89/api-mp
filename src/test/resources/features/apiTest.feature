@Success
Feature: API Test

  Scenario: Validar respuesta de la API
    Given el endpoint está disponible
    When hago una petición GET
    Then el código de respuesta debe ser 300
