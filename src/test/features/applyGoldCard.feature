Feature: User applies for a Cards

  @run
  Scenario Outline: Application for a Gold Card
    Given User opens Browser and navigates to Aex Url
    When User clicks on apply American Express Cart
    And User clicks on Gold Cart
    And User clicks on Demand Cart
    Then User enters its details as "<Salutation>" "<FirstName>" "<LastName>" "<DOB>" "<Email>" "<MobileNum>"
    #And User validates if new User is Created
    #And User closes the browser

    Examples:
      | Salutation | FirstName  | LastName  | DOB        | Email             | MobileNum |
      | MR         | Saint | Martin | 10/10/1999 | testauto1@abc.com | 0612345678 |