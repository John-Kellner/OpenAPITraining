Start Prism Mock Server  (Restfull Webservices)


```
prism mock APIStellenbewertung.yaml
```


lOGIN 

```
 curl -X 'POST'   'http://localhost:4010/login'   -H 'accept: application/json'   -H 'Content-Type: application/json'   -d '{
  "username": "j.kellner",
  "password": "password1234"
}'
```


Openapi Generator 

```
npm install @openapitools/openapi-generator-cli -g
```


```
openapi-generator-cli version-manager set 7.19.0
```

```
npm install @openapitools/openapi-generator-cli -D
```
```
npx @openapitools/openapi-generator-cli generate -i StellenbewertungAuth.yaml -g ruby -o /tmp/test/
```

Auflistung von Sprachen
```
npx @openapitools/openapi-generator-cli list
```