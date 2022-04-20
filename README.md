# Product-Service
Service to Serve Product Data

Data base: Spring H2

Connect to H2 console using:
http://localhost:8080/h2-console

**APIs:**
1. DELETE: http://localhost:9002/products/delete_product?id=1
2. GET by product ID: http://localhost:9002/products/get_product?id=1
3. GET all products: http://localhost:9002/products/get_all_products
4. SAVE product: curl --request POST \
  --url http://localhost:9002/products/save_product \
  --header 'Content-Type: application/json' \
  --data '{
	"product_type": "kitchen",
	"vendor_id": 123,
	"cost": 231.34,
	"inventory_id": 12332234
}'

**DOCKER SETUP**
(Steps required to run the service in docker)
1. Use gradle -> build to build the jar file for the ProductService
2. Run "docker build --build-arg JAR_FILE=build/libs/Product-Service-0.0.1-SNAPSHOT.jar -t scalable-services/product-service-spring-boot-docker ." command in the terminal to create the docker image for product service
3. Run "docker run -p 9002:9002 -t scalable-services/product-service-spring-boot-docker" command to run the docker image which was created in previous step
