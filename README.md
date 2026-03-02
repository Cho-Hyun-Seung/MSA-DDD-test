# 📦 Product & Order Microservices

간단한 Product / Order 마이크로서비스 예제입니다.
Nginx를 Gateway로 사용하며, Swagger UI를 통해 API를 확인할 수 있습니다.

---

## 🏗 Architecture

```
Client
   ↓
Nginx (Gateway)
   ↓
┌──────────────────┐
│  product-service │
│  order-service   │
└──────────────────┘
```

- **product-service** : 상품 API 제공
- **order-service** : 주문 API 제공 (Feign을 통해 product-service 호출)
- **nginx** : API Gateway 역할
- **Swagger UI** : product-service에서 통합 제공

---

## 🚀 실행 방법

### 1️⃣ Docker 실행

```bash
docker-compose up --build
```

### 2️⃣ 접속 주소

- Gateway: http://localhost
- Swagger UI: http://localhost/swagger-ui/index.html

---

## 📖 Swagger 사용법

Swagger UI 접속:

```
http://localhost/swagger-ui/index.html
```

상단에서 서비스 선택:

- `product-service`
- `order-service`

각 서비스의 API 명세를 확인하고 테스트할 수 있습니다.

---

## 🔗 API 엔드포인트

### 📦 Product API

Base URL:

```
http://localhost/api/product
```

예시:

```bash
GET /api/product/1
```

---

### 🛒 Order API

Base URL:

```
http://localhost/api/orders
```

예시:

```bash
POST /api/orders
```

Order 생성 시 내부적으로 product-service를 호출합니다.

---

## 🔄 서비스 간 통신

`order-service`는 **OpenFeign**을 사용하여
`product-service`와 내부 통신을 수행합니다.

- 내부 호출 주소: `http://product-service:8080`
- Nginx를 거치지 않습니다.