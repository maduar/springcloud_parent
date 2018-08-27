cd /Users/maduar/demo/java/springcloud_parent/springcloud_admin
source ~/.bash_profile 
mvn clean package -Dmaven.test.skip=true
java -jar /Users/maduar/demo/java/springcloud_parent/springcloud_admin/target/springcloud_admin-1.0-SNAPSHOT.jar
