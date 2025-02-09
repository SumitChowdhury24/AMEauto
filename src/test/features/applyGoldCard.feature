Feature: User applies for a Cards

  @runGoldCardCreation
  Scenario Outline: Application for a Gold Card
    Given User opens Browser and navigates to Aex Url
    When User clicks on apply American Express Cart
    And User clicks on Gold Cart
    And User clicks on Demand Cart
    Then User enters its details as "<Salutation>" "<FirstName>" "<LastName>" "<DOB>" "<Email>" "<MobileNum>"
    And Adress details as "<POB>" "<Address>" "<Postcode>" "<Village>"
    And User enters bank details as "<IBAN>" "<SwiftCode>" "<AnnualIncome>"
    Then user enters details in final page "<MotherName>"
    And User clicks on Final Submission and validates if user is created
    And User closes the browser

    Examples:
      | Salutation | FirstName | LastName | DOB        | Email             | MobileNum  | POB    | Address     | Postcode | Village    | IBAN                   | SwiftCode | AnnualIncome | MotherName |
      | MR         | Saint     | Martin   | 10/10/1999 | testauto1@abc.com | 0612345678 | France | 13 Richi st | 123456   | St Gobains | GB29NWBK60161331926819 | 12345678  | 50000        | Marta      |