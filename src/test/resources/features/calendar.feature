Feature: Calendar Test

  Scenario Outline: User creates a calendar event
    Given User is logged in with email "<email>", password "<password>", and phone number "<phoneNumber>"
    When User navigates to the specific day "<date>"
    And User creates a new event "<eventText>"
    Then The event "<eventText>" is present in the calendar
    Examples:
      | email       | password | phoneNumber | date       | eventText         |
      | mihai@w.com | 11111    | 00003       | 2024-07-15 | Training with Jon |
#      | testuser6@gmail.com | pass123  | 00003   | 2024-07-15 | Training with Mark |
