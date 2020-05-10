Feature: update news
  as a customer
  i want the ability to view more update news
  using show more update feature button

  Scenario: customer can view more update by click on show more updates news button.

    Given i navegiate to bbcnews homepage
    When i click on show more update button
    And i click on the news link of my interest
    Then the news details are displayed