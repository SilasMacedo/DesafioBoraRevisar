#Author: arqvimedes@gmail.com

Feature: Preencher campos e validar 
  Eu enquanto usuario quero preencher os campos e enviar msg

  
  Scenario: Preencher campos
    Given que esteja no site "file:///C:/Users/arqvi/Google%20Drive/Fisica%20Bacharel/Programa%C3%A7%C3%A3o/E2ETreinamentos/pagina/Index.html"
    When preencher os campos
    Then validar msg


  