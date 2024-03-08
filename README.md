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

## 프로젝트 후기
- 첫 프로젝트이기에 기존에 배웠던 내용을 확실히 이해하며 터득하기 위해서 노력하였습니다. 이로 인해 웹페이지를 만드는 기초적인 게시글 기능에 대해서 작성하는데 익숙해졌습니다.
다만, 다른 팀원들처럼 카카오 결제 API, 또는 지도 API 등에 대한 사용이 없었기에 개인 프로젝트 기능 구현에 대해서는 큰 임펙트가 없다 생각되는게 단점이라고 생각합니다.
하지만 어떤 것을 시작하기 전에 가장 기초적인 기능이나 개념들을 잡고 다음으로 나아가야 한다는 생각이 있기에 아쉬운 것은 어쩔 수 없지만 더 발전하여 다음에 임펙트가 있으면서 깔끔하게 코드를 작성하는
그런 개발자가 되고싶다고 생각 하였습니다.
- 게시판 기능 중 문의게시판을 작성하는데 문의마다 각각의 카테고리가 있으면 좋겠고 해당 카테고리를 통해 버튼을 누르면 해당 카테고리만 분류하여 List를 출력하게 만들었는데 처음에는 각 카테고리 별로 구분을 어떻게 주어야 할지 매우 헤매었으며 해당 부분이 제일 어려운 부분이였다고 생각합니다.
