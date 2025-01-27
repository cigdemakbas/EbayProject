Feature: SearchBox Functionality with multiple input

  @regression
  Scenario Outline: Verify search box functionality with multiple input
    Given Go to the home page
    When I enter searchBox
    And User enter the
      | KeyWord  | <KeyWord> |
      | DropDown | <DropDown> |


    Examples:
      | KeyWord         | DropDown |
      | iPhone          | Art      |
      | Nike Shoes      | Baby     |
      | Handmade Crafts | Books    |
      | RandomText123   | Art      |

