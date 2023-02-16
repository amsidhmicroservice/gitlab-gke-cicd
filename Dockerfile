FROM openjdk:17-alpine
VOLUME /tmp
COPY /target/gitlab-gke-cicd-*.jar gitlab-gke-cicd.jar
COPY src src
COPY Dockerfile Dockerfile
COPY pom.xml pom.xml
ENTRYPOINT ["java", "-jar", "gitlab-gke-cicd.jar"]