Feature: Validate and test all categories in the application
  As a user
  I want to ensure all categories function correctly

  Scenario: Ensure that all categories functions work correctly
    Given Go to the home page
    When Click the categories section
    And User should click and navigate every category
      | All Categories                 |
      | Antiques                       |
      | Art                            |
      | Baby                           |
      | Books                          |
      | Business & Industrial          |
      | Cameras & Photo                |
      | Cell Phones & Accessories      |
      | Clothing, Shoes & Accessories  |
      | Coins & Paper Money            |
      | Collectibles                   |
      | Computers/Tablets & Networking |
      | Consumer Electronics           |
      | Crafts                         |
      | Dolls & Bears                  |
      | DVDs & Movies                  |
      | eBay Motors                    |
      | Entertainment Memorabilia      |
      | Gift Cards & Coupons           |
      | Health & Beauty                |
      | Home & Garden                  |
      | Jewelry & Watches              |
      | Music                          |
      | Musical Instruments & Gear     |
      | Pet Supplies                   |
      | Pottery & Glass                |
      | Real Estate                    |
      | Specialty Services             |
      | Sporting Goods                 |
      | Sports Mem, Cards & Fan Shop   |
      | Stamps                         |
      | Tickets & Experiences          |
      | Toys & Hobbies                 |
      | Travel                         |
      | Video Games & Consoles         |
      | Everything Else                |
    Then Verify that user should be navigated to the correct page for each category

