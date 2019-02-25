@uat
Feature: Test feature file
  In order to learn cucumber jvm
  As a user
  I want to verify all its functionality

  #Background will run before every scenario
  Background: Test feature file
    Given background text

  @san
  Scenario: Test1 description
    Then test1

  @reg
  Scenario: Test2 description
    Then test2

  @san @reg
  Scenario: Test3 description
    Then test3

  @wip
  Scenario: Test4 description
    Then test4

  Scenario: Test5 description
    Then test5
