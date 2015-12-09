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

  #Notes:
  #C:\Users\sheetalsingh\workspace\CucumberJenkin>
  #mvn clean test -Dcucumber.options="--tags @uat"    | It will run all 10 steps i.e. 5 scenario
  #mvn clean test -Dcucumber.options="--tags @san"    | It will run 4 steps i.e. scenario 1 and 3
  #mvn clean test -Dcucumber.options="--tags @san --tags @reg"    | It will run only 2 steps i.e. scenario 3 only (AND case)
  #mvn clean test -Dcucumber.options="--tags @san,reg"    | It will run6 steps i.e. scenario 1,2 and 3 (OR case)
  #mvn clean test -Dcucumber.options="--tags ~@san"    | It will run all cases which are not tagged @san
  
  Scenario: Test5 description
    Then test5
