# 초특가 여기어떄 ( 호텔 예약 웹페이지 )
![image](https://github.com/rddckdeo/FinalProject/assets/150643230/58dcd117-7863-4ff2-aa5f-2ebca9855a1f)

## 프로젝트 소개
프로젝트 팀명 : 초특가 여기어때
<br/>
프로젝트 기간 : 2023.11.14 ~ 2023.12.21
<br/>
프로젝트 인원 : 5명 ( 프론트 2명, 백엔드 3명 )
<br/>
홈페이지 한줄 설명 : 호텔 홍보 및 객실 예약, 상품 결제, 문의 및 게시판 등의 서비스를 이용할 수 있는 홈페이지
<div align="center">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/9ccdef6a-9bbf-4b7e-88a1-c79e3c572d83" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/1cd97942-5e2f-43f1-a694-4e3d26d40325" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/8ca8b8e0-9f6b-4d43-9e00-8601f9edd318" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/2a8805a0-4c5c-4894-8aaf-44c8eb6d3239" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/a91d1d2d-29c9-45df-8cec-11efb229b2ff" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/d2740b0b-032e-43a8-a828-6492080f35a9" width="600">
    <img src="https://github.com/rddckdeo/SemiProject/assets/150643230/e66b8b78-a1d1-42d4-b74c-d56226e695fe" width="600">
</div> <br/>

## 구현된 기능 소개

![image](https://github.com/rddckdeo/SemiProject/assets/150643230/075416b0-0d18-4ba7-930e-d3bd21d621e4)

**- 초특가 여기어때 프로젝트는 가상의 호텔 ‘하루 (Haru)’ 를 홍보하며 예약 및 리뷰, 게시판 등의 서비스를 이용할 <br/> 수 있는 호텔예약 웹 사이트입니다.**
<br/>
**- 주요 기능 |** <br/>
    - 로그인, 회원가입, 비밀번호 찾기, 비밀번호 암호화, 메일API, 아이디 찾기<br/>
    - 마이페이지 ( 나의 예약, 작성 글, 정보 수정 및 탈퇴 등 )<br/>
    - 호텔 개요 ( 카카오 API ), 객실 소개, 언어 변환 서비스(영어, 중국어, 일본어)<br/>
    - 기존 예약 정보 / 객실 예약, 카카오 결제 API, 핸드폰 인증 (SMS), 마일리지 검증 및 적립, 등급 변경<br/>
    - e-shop, 상품 리스트, 상품상세 페이지, 장바구니, 카카오 결제 API, 상품 결제 내역<br/>
    - 리뷰, 리뷰작성, 별점 등록, 수정 및 삭제 기능<br/>
    - 공지사항 및 문의사항, 게시판 기능 (수정, 삭제), 댓글 기능 및 댓글 수정 삭제 기능<br/>
## ERD Cloud
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/6de85e3b-c047-4dbf-9485-ba777fd4527b)
**내가 사용한 Table |**
- 문의사항 Table
- 문의사항 답변 Table
- 공지사항 Table
- 공지사항 댓글 Table
## 기술 스택
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/d55989b0-f21c-486a-8896-9b18b3fc187d)
Eclipse Tool에 서블릿으로 기능 구현을 하였으며 MVC 모델을 통해 기능 구현
## 유스케이스
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/5c015ce4-b4ff-4832-b778-d1b233059262)
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/b2c9a297-3d98-4513-8874-6997dc261527)
## 나의 기능 소개
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/6295cbd5-fe08-4c61-97b4-d9563a284c8d)
기본적으로 공용으로 사용되는 Common css 및 header, footer, sidbar, 메인 페이지는 프론트엔드를 담당해주시는 팀원분들이 작업을 원할하게 진행해주시고 공유를 하였으며
각 인원마다 자신이 담당한 페이지의 HTML, CSS, JavaScript 등은 개인이 모두 작성을 하였습니다.


## 1. 문의게시판
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/33881015-05e2-4d31-a26c-d7a29a45a16e) <br/>
### 1. 게시판 List
- 게시글 당 페이지의 보여줄 수는 5개로 설정을 하였습니다.
- 게시글 번호, 제목, 작성자, 작성날짜, 조회수, 답변 여부, 비밀글 순으로 게시글의 간략한 정보를 볼 수 있게 설정하였습니다.
- 답변 여부
    - 문의 게시판의 경우 일반유저가 문의를 작성하고 Admin 권한을 부여받은 인원이 답변하는 것이 원칙입니다.
    - 게시판의 경우 답변이 작성되지 않았을 경우 "N"으로 표시되고 답변이 작성될 경우 "Y"로 변경됩니다.
- 조회수
    - 게시글을 클릭하여 상세 페이지로 이동될 경우 조회수가 하나씩 Count되게 기능을 만들었습니다.
  
### 2. 게시글 작성
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/1d688257-6699-4430-9877-a05a853a7116)
- 게시글에서 Category를 선택할 수 있습니다. ( 객실문의, 예약문의, 시설문의, 회원가입 및 로그인, 기타 문의 )
- 비밀글을 선택할 경우 해당 게시글은 작성한 본인과 Admin만 확인을 할 수 있습니다.
    - 권한 없는 인원이 선택할 경우 <br/>
      ![image](https://github.com/rddckdeo/SemiProject/assets/150643230/21707f7e-192b-4f6b-9672-aca988e05446)

- 파일 첨부를 하여 오류가 발생한 부분의 캡쳐, 사진 등을 올릴 수 있습니다.
- 네이버에서 제공하는 스마트 에디터를 사용하여 사용자가 글꼴, 색상, 정렬 등을 선택하여 사용할 수 있게 하였습니다.

### 3. 게시글 상세페이지
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/496b1771-2617-4520-b741-e6f555d94ce3)
- 게시글에 수정을 할 수 있는 버튼이 있습니다.
    - 게시글을 수정하면 수정한 날짜가 Update 됩니다.
- 게시글을 삭제할 수 있는 버튼이 있습니다.
### 기능 사용 gif 
<img src="https://github.com/rddckdeo/SemiProject/assets/150643230/104ef29b-a888-4b38-b7dd-be6c8588ec31" width="600" height="500">

### 4. 게시글 답변
- 문의사항이기에 Admin만 답변을 작성할 수 있습니다.
- 게시글에 답변이 없을 경우 "작성"과 "삭제" 기능만 보이게 표시하였습니다. <br/>
      ![image](https://github.com/rddckdeo/SemiProject/assets/150643230/80648e17-a994-414e-a5e3-6f44a1ed69fd)
    - 게시글에 답변이 있을 경우 기존에 답변을 "수정", "삭제" 할 수 있는 기능이 표시됩니다. <br/>
      ![image](https://github.com/rddckdeo/SemiProject/assets/150643230/d5916b98-0240-40ad-bcfb-b9d448a3ab87)
- 작성 또는 수정 기능을 눌러야 작성칸이 보이게 설정을 해두었습니다.

### 기능 사용 gif
<img src="https://github.com/rddckdeo/SemiProject/assets/150643230/1da6b80b-5053-4502-98eb-a2ef189bd79d" width="600" height="500">

### 5. 게시글 검색 기능
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/d429e04f-b0a0-4169-b034-20f12ee6436a)
- 게시글의 제목을 검색하면 일치하는 내용의 게시글을 불러옵니다.
    - 제목이 모두 일치해야 하는 것이 아닌 문자가 포함되어 있는 것을 가져오기에 검색하고 싶은 키워드만 입력해도 검색 결과가 나옵니다.

### 기능 사용 gif
<img src="https://github.com/rddckdeo/SemiProject/assets/150643230/54db7c07-e806-4e64-99f0-21ebe1365db6" width="600" height="500">

### 6. 카테고리 선택
- 게시글을 처음 작성할 때 선택한 Category 별로 선택을 하여 분류할 수 있습니다.
    - 문의게시판을 들어오게 되면 "전체"List를 자동으로 볼 수 있으며 이후 Category 별로 선택하여 확인하실 수 있습니다.

### 기능 사용 gif
<img src="https://github.com/rddckdeo/SemiProject/assets/150643230/f89daf6f-d03f-494e-8a2d-9c0fc262a500" width="600" height="500">

## 2. 공지사항
![image](https://github.com/rddckdeo/SemiProject/assets/150643230/ef10095a-b754-4caf-8d3b-f633360645a2) <br/>
### 1. 문의 게시판과 다른 점
공지사항의 경우 문의 게시판과 유사하게 기능을 만들었습니다.
- 공지사항의 경우 Admin만 작성을 할 수 있으며 admin이 아닌 인원은 게시글 작성 버튼을 사용할 수 없게 설정하엿습니다.
  ![image](https://github.com/rddckdeo/SemiProject/assets/150643230/2cb19428-9ec5-4581-9a73-bb2086f8aba9)
### 기능 사용 gif
<img src="https://github.com/rddckdeo/SemiProject/assets/150643230/a9b59cdc-dc6e-4d31-a98d-77a37be7d0dd" width="600" height="500">

## 프로젝트 후기
- 첫 프로젝트이기에 기존에 배웠던 내용을 확실히 이해하며 터득하기 위해서 노력하였습니다. 이로 인해 웹페이지를 만드는 기초적인 게시글 기능에 대해서 작성하는데 익숙해졌습니다.
다만, 다른 팀원들처럼 카카오 결제 API, 또는 지도 API 등에 대한 사용이 없었기에 개인 프로젝트 기능 구현에 대해서는 큰 임펙트가 없다 생각되는게 단점이라고 생각합니다.
하지만 어떤 것을 시작하기 전에 가장 기초적인 기능이나 개념들을 잡고 다음으로 나아가야 한다는 생각이 있기에 아쉬운 것은 어쩔 수 없지만 더 발전하여 다음에 임펙트가 있으면서 깔끔하게 코드를 작성하는
그런 개발자가 되고싶다고 생각 하였습니다.
- 게시판 기능 중 문의게시판을 작성하는데 문의마다 각각의 카테고리가 있으면 좋겠고 해당 카테고리를 통해 버튼을 누르면 해당 카테고리만 분류하여 List를 출력하게 만들었는데 처음에는 각 카테고리 별로 구분을 어떻게 주어야 할지 매우 헤매었으며 해당 부분이 제일 어려운 부분이였다고 생각합니다.
