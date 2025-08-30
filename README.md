# 🏦 测试支付系统 (Test Payment System)

> 🎯 基于 **尚硅谷支付教学资源** 开发的 **一体化支付系统**，支持前后端分离，涵盖从 **商品下单 → 发起支付 → 回调通知 → 订单状态更新** 的完整流程，帮助开发者快速掌握支付业务开发。

<p align="center">
  <img src="https://img.shields.io/github/license/OrcsaVik/shangguigu-payment?style=flat-square&logo=github&color=blue" alt="License" />
  <img src="https://img.shields.io/github/stars/OrcsaVik/shangguigu-payment?style=flat-square&logo=github&color=yellow" alt="Stars" />
  <img src="https://img.shields.io/github/forks/OrcsaVik/shangguigu-payment?style=flat-square&logo=github&color=orange" alt="Forks" />
  <img src="https://img.shields.io/github/issues/OrcsaVik/shangguigu-payment?style=flat-square&color=red" alt="Issues" />
  <img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen?style=flat-square&logo=springboot" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Vue-3.x-42b883?style=flat-square&logo=vue.js" alt="Vue 3" />
</p>
------



## 📖 项目简介 JAVA-8

本项目基于 **Spring Boot + Vue3** 构建，实现了一个完整的 **在线支付测试平台**，涵盖 **商品下单、支付发起、支付结果回调、支付状态同步** 等核心业务逻辑。

- 前端基于 **Vue3 + Vite + Element Plus**
- 后端基于 **Spring Boot3 + MyBatis Plus + Druid**
- 支持 **支付宝 / 微信支付**（沙箱环境）
- 提供 **订单管理、支付日志、回调通知** 等功能
- 适合支付业务初学者与中小型项目参考

------

## ✨ 核心功能

### 🛍️ 用户端

- 商品列表展示与下单
- 订单创建与提交
- 微信 / 支付宝模拟支付
- 查看订单状态与支付结果

### 🛠 后台管理

- 商品管理（新增 / 删除 / 修改 / 查询）
- 订单管理与支付状态追踪
- 支付日志记录与回溯
- 系统参数配置（API Key、商户号等）

### 💳 支付核心能力

- **多支付渠道支持**：支付宝 / 微信支付
- **异步回调机制**：支持幂等性处理
- **二维码支付** & **H5 支付**
- 支付状态实时同步
- 异常处理与日志追踪

------

## 🛠 技术栈

| **模块** | **技术**                    | **说明**           |
| -------- | --------------------------- | ------------------ |
| 前端     | Vue3 + Vite + Element Plus  | 前端 UI 与交互     |
| 后端     | Spring Boot3 + MyBatis Plus | 支付业务处理       |
| 数据库   | MySQL 8.0                   | 存储订单与支付数据 |
| 缓存     | Redis                       | 缓存支付状态       |
| 数据源   | Druid                       | 高性能连接池       |
| 文档工具 | Swagger3 / Knife4j          | 接口文档管理       |



------

## 🚀 快速启动

### **1. 克隆项目**

```
git clone https://github.com/yourname/payment-demo.git
cd payment-demo
```

### **2. 后端启动**

```
cd backend
mvn clean install
mvn spring-boot:run
```

### **3. 前端启动**

```
cd frontend
npm install
npm run dev
```

### **4. 访问系统**

- 前端地址：http://localhost:5173
- 后端接口：http://localhost:8090

