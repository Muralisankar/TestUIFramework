#Author : Muralisankar
@GameCard_API_Automation
Feature: GameCard API Automation

  @TC0002
  Scenario Outline: TC0001 Validate a gamecard 
    Given Create a new gamecard with <API_Key> <Location_ID> <Card_No> <Transaction_No><Is_NewCard> <Payment_Method><Amount>
    And Verify the balance of the gamecard with <API_Key> <Location_ID> <Card_No><Transaction_No> <Is_NewCard> <Payment_Method><Amount>
    And Add amount to the gamecard with <API_Key> <Location_ID> <Card_No> <Transaction_No> <Is_NewCard> <Payment_Method> <Amount>
    Then Verify the updated balance of the gamecard with <API_Key> <Location_ID> <Card_No> <Transaction_No> <Is_NewCard> <Payment_Method> <Amount>

    Examples: 
      | API_Key                              | Location_ID 													| Card_No    | Transaction_No |Is_NewCard | Payment_Method | Amount |
      | e316a249-b5bd-4ad1-a229-d2b49620ca55 | c242396a-0307-4648-beea-c393188160ec | 5123456789 | 210901135112981|Yes        | Cash           | 10     |
      
      
      
      
      @TC0003
  Scenario Outline: TC0001 Validate a gamecard 
    Given Create a new gamecard with <API_Key>
    And Verify the balance of the gamecard with <API_Key> <Location_ID> <Card_No><Transaction_No> <Is_NewCard> <Payment_Method><Amount>
    And Add amount to the gamecard with <API_Key> <Location_ID> <Card_No> <Transaction_No> <Is_NewCard> <Payment_Method> <Amount>
    Then Verify the updated balance of the gamecard with <API_Key> <Location_ID> <Card_No> <Transaction_No> <Is_NewCard> <Payment_Method> <Amount>

    Examples: 
      | API_Key                              | Location_ID 													| Card_No    | Transaction_No |Is_NewCard | Payment_Method | Amount |
      | e316a249-b5bd-4ad1-a229-d2b49620ca55 | c242396a-0307-4648-beea-c393188160ec | 5123456789 | 210901135112981|Yes        | Cash           | 10     |
      
      
