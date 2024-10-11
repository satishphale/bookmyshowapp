# BookMyShow App
This is backend app for bookmyshow. Developed in java spring-boot and mysql database.

#### Prerequisites:
Docker Desktop installed with kubernetes option enabled.

### Setup 
#### Docker:
 1. Run **mvn clean package** in root directory of project where pom.xml is present. maven will create target folder with .jar (e.g. demo-0.0.1-SNAPSHOT.jar) project file
 2. Update the Dockerfile in project folder with jar file name in target folder.
 3. Run **docker build -t my-spring-boot-app:latest .** command in project folder. This will build the image and tag it as my-spring-boot-app:latest
 4. Test locally using **docker run -p 8080:8080 my-spring-boot-app:latest**
 5. Access the application by visiting http://localhost:8080 to make sure it works.

#### Kubernetes
1. Tag docker image created in above step using **docker tag my-spring-boot-app:latest <your-dockerhub-username>/my-spring-boot-app:latest**
2. Push the image to dockerhub using **docker push <your-dockerhub-username>/my-spring-boot-app:latest**
3. Update Kubenetes/deployment.yml file image property with dockerimage name (e.g.<your-dockerhub-username>/my-spring-boot-app:latest)
4. Deploy on kubernetes with following commands:
   1. kubectl apply -f deployment.yaml
   2. kubectl apply -f service.yaml
5. Check status of deplyment
   1. kubectl get deployments
   2. kubectl get services
6. Once deployed, Kubernetes will expose your application via the LoadBalancer service.
You can retrieve the external IP by running: **kubectl get svc**


&copy; satish phale