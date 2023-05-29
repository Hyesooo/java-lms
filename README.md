# 학습 관리 시스템(Learning Management System)

## 진행 방법

* 학습 관리 시스템의 수강신청 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

### 1단계 기능 목록

- [X] 질문 데이터를 완전 삭제하지 않고 데이터를 삭제 상태로 변경한다.
    - [X] 질문 삭제 시 답변도 삭제하며, 답변도 삭제 상태로 변경한다.
- [X] 삭제 가능한 상태를 확인한다.
    - [X] 로그인 사용자와 질문 작성자가 같은 경우 삭제 가능하다.
    - [X] 답변이 없는 경우 삭제 가능하다.
    - [X] 질문 작성자와 답변글의 모든 답변자가 같은 경우 삭제 가능하다.
    - [X] 질문자와 답변자가 다른 경우 답변을 삭제할 수 없다.
- [X] 질문, 답변 삭제 이력을 DeleteHistory 에 남긴다.

### 리팩터링 요구사항

- [X] QnaService의 deleteQuestion() 메서드의 단위 테스트 가능한 코드(핵심 비즈니스 로직)를 도메인 모델 객체에 구현한다.
- [X] 비즈니스 로직을 도메인 모델로 이동하는 리팩토링 단계 시 TDD로 구현한다.
- [X] 리팩토링 후 QnaServiceTest의 테스트는 모두 통과해야 한다

### 2단계 수강신청 기능 목록

- [X] 과정(Course)는 여러개의 강의(Session)을 가질 수 있다
- [X] 강의는 시작일과 종료일을 가진다
    - [X] 강의 시작일은 종료일 이전이어야 한다
- [X] 강의는 강의 커버 이미지 정보를 가진다
- [X] 강의는 무료/유료 강의로 나뉜다
- [X] 강의 상태는 준비중/모집중/종료 3가지 상태를 가진다
    - [X] 강의 수강신청은 강의상태가 모집중인 경우만 가능하다
- [X] 강의 최대 수강 인원을 초과할 수 없다

### 4단계 수강신청(요구사항 추가)

- [] 강의 진행중인 상태에서도 수강신청이 가능해야 한다
    - [] 강의 진행 상태는 준비중, 진행중, 종료로 나뉜다
    - [] 강의 모집 상태는 모집중, 비모집중으로 나뉜다
- [] 선발된 인원만 수강 가능해야 한다
    - [] 수강 신청자의 상태는 대기, 승인, 거절로 나눈다
    - [] 강사는 수강신청한 사람 중 선발된 인원만 승인할 수 있다
    - [] 강사는 수강신청한 사람 중 선발되지 않은 인원은 수강을 취소할 수 있다
