cd /Users/maduar/demo/java/springcloud_parent/eureka_server
source ~/.bash_profile
mvn clean package -Dmaven.test.skip=true
java -jar /Users/maduar/demo/java/springcloud_parent/eureka_server/target/eureka_server-1.0-SNAPSHOT.jar
