source ~/.bash_profile 
cd /Users/maduar/demo/java/springcloud_parent/springcloud_client
mvn clean install -Dmaven.test.skip=true
java -jar /Users/maduar/demo/java/springcloud_parent/springcloud_client/target/springcloud_client-1.0-SNAPSHOT.jar
