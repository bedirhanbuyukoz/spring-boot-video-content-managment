## Spring Boot Video Content Manager

## Endpoints

#### Sign-Up


```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 71

{
    "name":"user",
    "username":"user",
    "password":"user"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 51

{
    "username":"user",
    "password":"user"
}
```


#### Make-Admin
```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

#### Save Video
```
POST /api/video HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 162

{
    "title":"Test Video 11",
    "price":10,
    "description":  "Test description 11",
    "author":"Test author 11",
    "licences":"new license 2022"
}
```

#### Delete Video
```
DELETE /api/video/7 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
```

#### Get All Video
```
GET /api/video HTTP/1.1
Host: localhost:8080
```


#### Save Purchase
```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
Content-Type: application/json
Content-Length: 55

{
    "userId":4,
    "videoId":1,
    "price":10
}
```

#### Get User Purchases
```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
```
