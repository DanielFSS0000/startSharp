#Language en
#Author: Daniel Sandoval

Feature: StarSharp application automation with screenplay
  As a user I want to assign a new business unit and create a meeting

  Background: Enter the application
    Given Authentication user
    | user  |   key     |
    | admin | serenity  |

#scenario1
  @firstCriterion
    Scenario Outline: Business Unit Assignment
      When a new business unit is assigned
      | nameBusiness   |   parentUnit     |
      | <nameBusiness> |   <parentUnit>   |
      Then Completion of assignment for business unit
      |     nameBusiness      |
      |     <nameBusiness>    |
      Examples:
      |  nameBusiness       |  parentUnit    |
      |   DANIEL TEST       |  Technology    |

    #scenario2
    @secondCriterion
    Scenario Outline: New Meeting
      When Create a new meeting by filling in all the fields
      | meetingName     |  meetingType  | meetingNumber   | startDate   | startTime   |   endDate   | endTime | location  |    unit     | organizer |    report   |   attendees  |
      | <meetingName>   |   General     | <meetingNumber> | 12/14/2022  |   15:00     | 12/15/2022  |   10:00 |   HQ-01   | DANIEL TEST | Sara Torres | Victoria Parker | Steven Lopez  |
      Then new meeting has been created successfully
      | meetingName   | meetingNumber  |
      | <meetingName> | <meetingNumber> |
      Examples:
        |    meetingName    | meetingNumber |
        | NuevotestingNequi |     970620    |


