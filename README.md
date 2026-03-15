# 🌱 환경을 생각하는 MZ들의 공간, MOAMZ
스프링부트 기반 친환경 O2O 커뮤니티 플랫폼

<img width="500" alt="moamz_logo" src="https://github.com/user-attachments/assets/f7230f08-9a71-449c-855f-6f2651ab0d5c">
<br><br>

## 📜 MOAMZ 포트폴리오 (PDF)

프로젝트의 기획, 기능 설명, ERD, 구현 과정 등을 정리한 문서입니다.

📄 **[MOAMZ Project Documentation 보기](https://github.com/taemin1997/moamz/blob/main/MOAMZ_%EA%B3%A0%ED%83%9C%EB%AF%BC_%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4.pdf)**

---

## 🖥️ 서비스 소개

MOAMZ는 환경을 생각하고 합리적인 소비를 추구하는 사용자를 위해  
**식료품 쇼핑몰과 커뮤니티 기능을 결합한 친환경 O2O 플랫폼**입니다.

단순한 거래 서비스에 그치지 않고,  
사용자 간 정보 공유와 커뮤니티 활동이 가능하도록 구성하였으며,  
거래된 상품의 중량 데이터를 기반으로 **탄소 감축량과 나무 식재 수를 환산하여 시각화**함으로써  
환경 보호에 대한 기여도를 직관적으로 확인할 수 있도록 설계했습니다.

---

## 🪄 서비스 특징

- 식료품 O2O 서비스와 커뮤니티 기능을 결합한 종합 플랫폼
- 사용자 간 활발한 교류와 정보 공유를 위한 커뮤니티 기능 제공
- 거래 상품의 중량 데이터를 기반으로 탄소 감축량 계산
- 탄소 감축량을 나무 식재 수로 환산하여 친환경 기여도를 시각화
- 카카오페이 결제 기능을 연동하여 실제 쇼핑몰 흐름에 가까운 구매 프로세스 구현

---

## 🕐 개발 기간

- 전체 개발 기간 : 2024년 9월 25일 ~ 2024년 11월 29일
- 주제 선정 및 기획 : 2024년 9월 25일 ~ 2024년 9월 30일
- 화면 설계 : 2024년 10월 1일 ~ 2024년 10월 9일
- 화면 구현 : 2024년 10월 10일 ~ 2024년 10월 16일
- DB 설계 : 2024년 10월 17일 ~ 2024년 10월 30일
- 기능 구현 : 2024년 10월 31일 ~ 2024년 11월 29일

---

## 👤 팀원 구성 및 담당

|팀장|부팀장|팀원|팀원|팀원|
|---|---|---|---|---|
|고태민|황진|김가은|조창희|박서연|
|![KakaoTalk_20241130_141424441](https://github.com/user-attachments/assets/448a506e-ad77-4184-a7ac-ed1ce3e0f7d5)|![KakaoTalk_20241203_012114591](https://github.com/user-attachments/assets/12377499-a1eb-4f2d-a455-a6b00701da17)|![KakaoTalk_20241130_141428641](https://github.com/user-attachments/assets/966c7cd5-dc22-473c-b07c-ab22fcb38063)|![KakaoTalk_20241203_014416580](https://github.com/user-attachments/assets/f64d7b54-1314-45f3-b82b-596f069b35cd)|![KakaoTalk_20241203_014416580_01](https://github.com/user-attachments/assets/fea03d6a-2351-4cf4-be3d-4f684c42cc7f)|
|[@taemin1997](https://github.com/taemin1997)|[@PANGJINI-D](https://github.com/PANGJINI-D)|[@liahkimi](https://github.com/liahkimi)|[@Changheejo](https://github.com/Changheejo)|[@syyyyp](https://github.com/syyyyp)|
|쇼핑몰<br>에코프로젝트<br>소셜링<br>레시피|채팅<br>자유게시판<br>나눔게시판<br>마이페이지(판매자)|관리자페이지|로그인<br>회원가입|메인페이지<br>서비스소개<br>공지사항<br>마이페이지(일반회원)|

---

## ⚙️ 개발 환경

- **Language** : Java 17
- **JDK** : JDK 17.0.10
- **IDE** : IntelliJ IDEA 2024.2.4
- **Framework** : Spring Boot 3.2.11
- **Database** : Oracle DB 11g
- **ORM** : MyBatis

### 협업 툴
- Notion
- GitHub
- Discord
- erdCloud

### 디자인
- [Figma](https://www.figma.com/design/TpAAI0I31pGPUmDPsjAZmZ/%5B%ED%8C%8C%EC%9D%B4%EB%B8%8C%EA%B0%80%EC%9D%B4%EC%A6%88%5D%EC%84%9C%EB%B9%84%EC%8A%A4%ED%99%94%EB%A9%B4?node-id=144-1188&node-type=canvas&t=i7WRGLK0gFvdAiJ9-0)

---

## 🚀 주요 기능

### 🛒 쇼핑몰
- 상품 등록 / 수정 / 삭제 기능
- 상품 목록 조회 및 상세 페이지 구현
- 사용자별 판매 상품 관리 기능
- 카카오페이 결제 연동을 통한 구매 기능 구현

### 🌱 에코 프로젝트
- 거래된 식료품 중량 데이터를 기반으로 탄소 감축량 계산
- 탄소 감축량을 나무 식재 수로 환산하여 시각화
- 사용자의 친환경 기여도를 직관적으로 확인할 수 있도록 구성

### 🤝 소셜링
- 사용자 간 소통을 위한 커뮤니티 기능 제공
- 게시글 작성 / 조회 / 수정 / 삭제 기능 구현

### 🍳 레시피
- 레시피 게시글 등록 및 조회 기능
- 이미지 기반 레시피 콘텐츠 공유 기능 구현

---

## 💽 ERD 구성

<details>
	<summary>ERD 이미지</summary>
  	<div markdown="1">
      <img src="https://github.com/user-attachments/assets/c4b0ae8d-dc29-4552-934e-b1b5901425ff">
  	</div>
</details>

---

## 🏷️ 내가 맡은 기능

### 🛒 쇼핑몰
- 상품 등록 / 수정 / 삭제 기능 구현
- 상품 목록 조회 및 상세 페이지 개발
- 사용자 판매 상품 관리 기능 구현
- **카카오페이 API 연동을 통한 결제 기능 구현**
- 결제 요청, 승인, 주문 처리 흐름을 연결하여 구매 프로세스 구현

### 🌱 에코 프로젝트
- 거래된 식료품 중량 데이터를 기반으로 **탄소 감축량 계산 로직 구현**
- 탄소 감축량을 **나무 식재 수로 환산하여 사용자 환경 기여도 시각화**
- 서비스의 친환경 정체성이 드러나도록 기능 설계 및 구현

### 🤝 소셜링
- 사용자 간 소통을 위한 커뮤니티 기능 구현
- 게시글 작성 / 조회 / 수정 / 삭제 기능 개발

### 🍳 레시피
- 레시피 게시글 등록 및 조회 기능 구현
- 이미지 기반 레시피 콘텐츠 공유 기능 개발

---

## 💡 What I Learned

이번 프로젝트를 통해 단순 CRUD 기능 구현을 넘어  
**쇼핑몰 서비스의 전체 흐름을 설계하고 구현하는 경험**을 할 수 있었습니다.

특히 상품 등록, 조회, 결제까지 이어지는 흐름을 직접 구현하면서  
백엔드 API 설계와 데이터베이스 구조 설계의 중요성을 이해할 수 있었습니다.

또한 카카오페이 결제 기능을 연동하면서  
외부 API를 서비스 로직과 연결하는 과정과 결제 승인 흐름에 대해 경험할 수 있었습니다.

에코 프로젝트 기능에서는 거래 데이터를 기반으로 탄소 감축 효과를 계산하고 시각화하면서  
단순한 기능 구현을 넘어 서비스에 의미 있는 가치를 담는 방법을 고민할 수 있었습니다.

이를 통해 사용자 경험과 서비스 목적을 함께 고려하는 개발 방식의 중요성을 배울 수 있었습니다.
