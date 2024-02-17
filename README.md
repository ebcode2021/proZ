# proZ

## 1. 프로젝트 소개

> 개발자용 협업관리 워크스페이스

proZ는 기존 그룹웨어를 기반으로 `메신저`와 `커뮤니티 기능`을 강화한 협업 도구다. \
개발한 웹 인터페이스를 통해 개발자는 프로젝트 진행에 있어 효율적이고 원활한 소통이 가능하다. \
대표 기능으로는 메모, 보드, 캘린더, 에디터, 로드맵, 채팅 및 알림이 있다.

<img width="800" alt="대표사진" src="https://github.com/ebcode2021/proZ/assets/84271971/04ef634d-cc29-477b-982e-b536b903bf90">

<br />
<br />

<img width="800" alt="대표사진2" src="https://github.com/ebcode2021/proZ/assets/84271971/9ce21d35-eb63-47c1-b4d0-583651a4d6b1">

<br />

## 2. 개발 기간

2021.12 - 2021.12

<br />

## 3. 개발 환경

**[백엔드]** \
  Language : Java(jdk-11) \
  Database : Oracle

**[프론트엔드]** \
  Language : html, css, javascript \
  Library : jquery, Bootstrap

**[툴 및 디자인 도구]** \
  Develop : VS Code, Eclipse, STS \
  Version management : Github, Sourcetree \
  API : OpenWeather, Firebase, STOMP, KakaoAPI, Import, GithubAPI

<br />

## 4. 멤버 구성 및 역할 분담

**[멤버 구성]**

<img width="800" alt="팀원소개"  src="https://github.com/ebcode2021/proZ/assets/84271971/50072fca-083f-4ebc-a916-a5644ed4433a">

<br />
<br />

**[멤버 별 역할]**

<img width="800" alt="멤버 별 역할" src="https://github.com/ebcode2021/proZ/assets/84271971/a356f3ec-b14b-498d-88f7-c72a8cb63d8f">

<br />

## 5. ERD

![프로Z](https://github.com/ebcode2021/proZ/assets/84271971/6d02f26a-6318-456f-a0b5-6383df47c15a)

<br />

## 6. 구현 기능

구현 기능은 크게 7가지로 나눌 수 있으며, 참여한 기능 옆에는 아이콘 🙋🏻‍♀️ 을 붙였다.

**[구현 기능 간단히 보기]**

<img width="750" alt="프로젝트 주요 기능" src="https://github.com/ebcode2021/proZ/assets/84271971/8c436515-3e1f-45e3-9a4d-ed40da108a2d">

### 1) 로그인

**[유저]**

```
로그인 / 간편 로그인(카카오, 구글) / 이메일 인증 / 회원 가입
아이디 찾기 / 비밀번호 찾기
```

<p align="center" width="100%">
	<img width="270" alt="로그인" src="https://github.com/ebcode2021/proZ/assets/84271971/705126f7-a5e6-4bc4-aa6a-acca72ea64f5" width="50%"/>	
	<img width="270" alt="회원가입" src="https://github.com/ebcode2021/proZ/assets/84271971/cae35806-34e9-4e40-9c04-3c05f358b314" width="50%>
</p>

<img width="400" height="250" alt="비밀번호 변경" src="https://github.com/ebcode2021/proZ/assets/84271971/06649f40-5d73-4cc8-b62f-70718a63ad8c" width="50%" />

<img width="400" height="250" alt="비밀번호 찾기" src="https://github.com/ebcode2021/proZ/assets/84271971/734a728c-c4f1-41e4-bc5e-8a72be5c43cd" width="50%" />

<br />

**[마이페이지]**

```
대표사진 등록 / 프로필 색상 변경 / 회원 정보 변경 / 회원 탈퇴
```

<p align="center" width="100%">
	<img width="380" alt="마이페이지1" src="https://github.com/ebcode2021/proZ/assets/84271971/0a647867-3859-436b-ad92-8c64739bd514" width="50%">
	<img width="380" alt="마이페이지2" src="https://github.com/ebcode2021/proZ/assets/84271971/21ac485d-ac98-4578-9521-9ee18eb13adc" width="50%">
</p>

### 2) 프로젝트 및 워크스페이스 🙋🏻‍♀️

**[프로젝트]**

```
프로젝트 생성 / 프로젝트 변경 / 프로젝트 이미지 등록 / 프로젝트 메인 페이지
```

**[워크스페이스]**

```
역할 추가, 수정, 설정 / 권한 수정 / 멤버 초대 / 멤버 추방
워크스페이스 카테고리 추가, 수정, 삭제 / 카테고리 순서 변경
유료결제기능
```

### 3) 메모

```
메모 추가, 수정, 삭제 / 메모지 색상 변경 / summernote 에디터
작성자, 작성시간 조회 기능
```

### 4) 보드/ 캘린더

```
게시판 추가, 수정, 삭제 / 게시글 조회 / 게시글 댓글
게시판 크기 설정 / 서브게시판
캘린더 일정 추가 / 일정 삭제
```

### 5) 에디터

```
명령어 기능(제목 스타일 기능 h1, h2, h3)
img, file, audio 첨부 가능
codeBlock, 구분선, 인용문 작성 기능
```

### 6) 로드맵

```
Git repository 연동하기
BFS 알고리즘으로 개발 로드맵 작성 / 무시할 폴더 설정
Commit 내역 불러오기
```

### 7) STOMP 🙋🏻‍♀️

```
Firebase를 사용한 실시간 채팅 / 실시간 파일 전송
프록시 서버로 CORS 문제 핸들링
유저의 온오프라인 확인
댓글 알림
```
