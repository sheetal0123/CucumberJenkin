#For Cucumber+ WebDriver + Jenkin + Maven Practice


#How to run
  #mvn clean test -Dcucumber.options="--tags @uat"    | It will run all 10 steps i.e. 5 scenario
  #mvn clean test -Dcucumber.options="--tags @san"    | It will run 4 steps i.e. scenario 1 and 3
  #mvn clean test -Dcucumber.options="--tags @san --tags @reg"    | It will run only 2 steps i.e. scenario 3 only (AND case)
  #mvn clean test -Dcucumber.options="--tags @san,reg"    | It will run6 steps i.e. scenario 1,2 and 3 (OR case)
  #mvn clean test -Dcucumber.options="--tags ~@san"    | It will run all cases which are not tagged @san
  
  
  mvn clean test -Dcucumber.options="--tags ~@yahoo"    |  It will run with default FF driver
  mvn clean test -Dcucumber.options="--tags @yahoo" -Ddriver=chrome  | It will run with Chrome driver
  