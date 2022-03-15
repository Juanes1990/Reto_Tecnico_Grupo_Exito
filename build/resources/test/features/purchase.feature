Feature: Compra Productos a domicilio
  yo como cliente quiero poder ingresar a la página
  exito.com, ingresar a mi cuenta, seleccionar productos
  y finalizar la compra.

  @registeredCustomer
  Scenario: Compra productos de mercado
    Given el cliente se encuentra en la página de inicio
    When el cliente ingresa a su cuenta con email y contrasenna
    And el cliente selecciona sus productos y finaliza su compra
    Then la página debera mostrar el resumen de la compra
