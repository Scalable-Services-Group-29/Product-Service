# Product-Service
Service to Serve Product Data

Data base: Spring H2

Connect to H2 console using:
http://localhost:8080/h2-console

**APIs:**
1. DELETE: http://localhost:8080/products/delete_product?id=1
2. GET by product ID: http://localhost:8080/products/get_product?id=1
3. GET all products: http://localhost:8080/products/get_all_products
4. SAVE product: curl --request POST \
  --url http://localhost:8080/products/save_product \
  --header 'Content-Type: application/json' \
  --data '{
	"product_type": "kitchen",
	"vendor_id": 123,
	"cost": 231.34,
	"inventory_id": 12332234
}'
