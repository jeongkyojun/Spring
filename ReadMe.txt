Spring Practice Repository

메이븐 설정 최신화
https://mvnrepository.com/

☆ 는 메이븐 설정에 따라 수정하기

# Spring Maven Lib Version : pom.xml # 
https://docs.spring.io/spring-framework/docs/current/javadoc-api/

- java 버전관리
java-version>1.8 ☆
org.springframework-version>5.3.19 *☆
org.aspectj-version>1.9.9.1 ☆
org.slf4j-version>1.7.36 ☆
aspectjweaver>${org.aspectj-version} - aop경우

- log4j
☆ log4j 부분을 아래 값으로 변경, 최신으로 업데이트
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.17.2</version>

- 그 외 버전 설정
log4j>2.17.2 *****
junit>4.13.2

- dependency 설정 추가(lombok)
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.22</version>
</dependency>

- 그 외 dependency 의존 관리
spring-test>${org.springframework-version} - test경우
spring-jdbc>${org.springframework-version}
commons-dbcp2>2.9.0
mysql-connector-java>8.0.28
commons-fileupload>1.4 - upload경우
mybatis>3.5.9
mybatis-spring>2.0.7
jackson-databind>2.13.2.2
springfox-swagger-ui>3.0.0 or 2.10.5
springfox-swagger2>3.0.0 or 2.10.5

- java-version 실시간 변경 설정
source>${java-version} <- 수정 *****
target>${java-version} <- 수정 *****
