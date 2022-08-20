# Creative Ad

1.

Created a Simple API call to list the Employee Details. (SampleRestProject-0.0.1-SNAPSHOT.war) I have build this war file using maven build.

Not using a Database, But using a Mock Data.

2.
Created a Dockerfile as "Dockerfile".

Command to build the docker image:
~~~
docker image build -t employee-producer .
~~~
Command to run a image as a container:
~~~
docker container run  -p 8080:8080 -d employee-producer
~~~
Once We deploy the Container. We test the result of api to get the Employee List.
~~~
http://localhost:8080/sample/employees 
~~~

![image](https://user-images.githubusercontent.com/12591492/185739525-9b06a287-dbc2-43b1-97af-134c6a22b8b4.png)


Sample output:
~~~
[{"empId":10000,"empname":"AAAAA","address":"London","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10001,"empname":"BBBBB","address":"HongKong","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10002,"empname":"CCCCC","address":"Malaysia","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10003,"empname":"DDDDD","address":"Singapore","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10004,"empname":"EEEEE","address":"India","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10005,"empname":"FFFFF","address":"America","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0},{"empId":10006,"empname":"GGGGG","address":"Russia","joinedDate":"2022-08-20T06:18:45.603+00:00","salary":1000000.0}]
~~~


3.
4.

By using pervious Docker image , I have push into the docker repository to use in image delaration on deployment.

Command used to push the docker image:
~~~
docker push vivekjothi/employee-producer:latest
~~~

Then I have deployed the API using the depolyment and Load balancer service.
Command used to deploy the deployment:
~~~
kubectl apply -f employee-deployment.yml
kubectl expose deployment employee-producer-deployment --port=80 --target-port=8080 -type LoadBalancer
~~~
We need to test the result by "curl -v https://<external_ip>/sample/employees"

Also, I have checked that container is not running as root by using below command:
~~~
kubectl exec -it employee-producer-deployment-employee-producer -c employee-producer -- id
~~~


