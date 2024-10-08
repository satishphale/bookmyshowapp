# BookMyShow App
This is backend app for bookmyshow. Developed in java spring-boot.


### Setup 
#### Docker:
###### 1. run **mvn clean package** in root directory of project where pom.xml is present. maven will create target folder with .jar (e.g. demo-0.0.1-SNAPSHOT.jar) project file
###### 2. Update the Dockerfile in project folder with jar file name in target folder.
###### 3. Run **docker build -t my-spring-boot-app:latest .** command in project folder. This will build the image and tag it as my-spring-boot-app:latest
