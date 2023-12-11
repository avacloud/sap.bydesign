# sap.bydesign
SAP ByDesign系统接口，基于apache axis2框架。

## 项目结构 | Projects
* src/main/resources/wsdl                    项目引用的wsdl文件
* src/main/java/com/sap/bydesign/client      根据wsdl生成的服务

## 使用说明 | Instructions
* 增加wsdl文件并生成代码
~~~
a. 从SAP ByDesign系统导出的wsdl文件，保持文件名称与服务一致。
b. 拷贝wsdl文件至src/main/resources/wsdl目录。
c. 配置pom.gen.xml文件，增加<execution>节点，注意<id>编号、<packageName>命名空间。
d. 根目录执行： mvn clean generate-sources -f pom.gen.xml 命令。
~~~
* 其他项目使用，pom.xml配置
~~~
<dependency>
	<groupId>com.sap.byd</groupId>
	<artifactId>bydesign.client</artifactId>
	<version>0.1.0</version>
</dependency>
~~~

## 编译&发布 | Builds
* 编译
~~~
mvn clean package install -DpomFile=./pom.xml
~~~
* 发布
~~~
mvn deploy:deploy-file \
  -Dfile=./target/bydesign.client-0.1.0.jar \
  -DpomFile=./pom.xml \
  -Durl=http://maven.avacloud.com.cn/repository/maven-3rdparty \
  -DrepositoryId=ibas-maven \
  -Dpackaging=jar
~~~

## 鸣谢 | Thanks
[硕爷](https://baike.baidu.com/item/%E9%A1%BE%E7%BB%B4%E9%92%A7/1516451 "GSGSS")<br>
[昌昌](http://baike.baidu.com/view/1831.htm "cyitianyou")<br>
[周周](http://baike.baidu.com/view/1751.htm "neilzhou0309")<br>
[牛加人等于朱](http://baike.baidu.com/view/1769.htm "NiurenZhu")<br>