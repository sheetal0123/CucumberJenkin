#For Cucumber+ WebDriver + Jenkin + Maven Practice


#How to run
  #mvn clean test -Dcucumber.options="--tags @uat"    | It will run all 10 steps i.e. 5 scenario
  #mvn clean test -Dcucumber.options="--tags @san"    | It will run 4 steps i.e. scenario 1 and 3
  #mvn clean test -Dcucumber.options="--tags @san --tags @reg"    | It will run only 2 steps i.e. scenario 3 only (AND case)
  #mvn clean test -Dcucumber.options="--tags @san,reg"    | It will run6 steps i.e. scenario 1,2 and 3 (OR case)
  #mvn clean test -Dcucumber.options="--tags ~@san"    | It will run all cases which are not tagged @san
  
  
  mvn clean test -Dcucumber.options="--tags ~@yahoo"    |  It will run with default FF driver
  mvn clean test -Dcucumber.options="--tags @yahoo" -Ddriver=chrome  | It will run with Chrome driver
  
  
  
  
  
 
#reporting
1. simple json, html, xml reports are working fine
  
2. pro plugin report need to try for jenkins - Later
https://docs.cucumber.io/cucumber/reporting/#third-party-plugins
need to add dependency + cucumber.yml + entry in runcuketest
  
3. 3rd party which is generally used
https://damienfremont.com/2016/05/09/how-to-cucumber-test-report-plugin-2-with-maven-and-java/

  
4. Need to try following trivago as well
https://github.com/trivago/cluecumber-report-plugin  