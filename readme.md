## maven依赖第三方jar包的管理
maven-dependency-plugin

## maven配置文件管理
maven-antrun-plugin


## log4j2说明
log4j2.xml中日志的路径配置为

## 运行示例
mvn clean package
java -Dlog.home=[日志目录] -Dspring.config.path=[spring配置文件路径] 
-Dapplication.properties.path=[配置文件路径] -jar maven-training-1.0.jar 
