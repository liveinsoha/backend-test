
# Spring 애플리케이션 이미지 빌드
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
WORKDIR /usr/src/app

# Spring Boot JAR 파일을 이미지에 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# 환경 변수 설정
#ENV MYSQL_HOST=localhost
#ENV MYSQL_PORT=3306
#ENV MYSQL_USERNAME=test
#ENV MYSQL_PASSWORD=test1234
#ENV MYSQL_DATABASE=testdb

# Spring Boot 애플리케이션 실행
CMD ["java","-jar","app.jar"]