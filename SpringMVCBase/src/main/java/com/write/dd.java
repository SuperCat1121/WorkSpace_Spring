package com.write;

public class dd {

}

/*
	[java]
	객체 지향 언어(OOP)
	객체 : instance : 메모리에 실제 구현된 구현체
	class -> 구현하기 위한 설계도
	=> member - field : 속성 - instance variable
	                         - class variable(static)
	          - method : 기능
	          접근제한자 메모리영역 리턴타입 이름(파라미터/아규먼트){body}
	constructor : 객체 생성, 필드 초기화
	
	oop 특징
	- 추상화 abstract
	- 다형성 polimorphism
	- 상속 inheritance
	- 캡슐화 encapsulation
	
	type :
	type 변수 = 값(literal);
	
	기본타입 : call by value
	참조타입 : call by reference
	
	String -> "" => immutable
	StringBuffer => mutable
	
	opr : 
	control :
	조건
		if, switch
	반복
		for, while, do while
		
	array : type[] = {} (정적)
	               = new type[] (동적)
	복사 -> shallow copy : 얕은 복사, 주소값만 복사
	        deep copy : 깊은 복사, 값 복사
	collection : 값 여러개, 크기 가변, <generics> / List    Set     Map
	                                            순서   o      x      x
	                                            중복   o      x     k : x, v : o
	iterator : collection 뽑기
	Map.Entry :
	
	exception : 예외처리 try-catch
	io stream : byte
	thread : process 안의 작업단위
		process : 실제 메모리에 올라간 프로그램 (일하는중)
		program : 실행 파일(exe)
	network :
		uri : identifier
		urn : name
		url : location
		tcp :
		udp :
	
	[DB]
	- data 저장소
	- rdb => relation entity (attribute tuple)
	                  테이블    컬럼      로우
	- noSql - mongodb - 대표적 - {key : value}형태 (json)
	- 정규화
	- oracle 11g xe
	- SQL(Structured Query Language)
		DDL : 정의
		DML : 조작
		DCL : 제어
	- JOIN : table + table
	- SUBQUERY : query 안에 query
	(일반적으론 join 이 낫다)
	PL/SQL :
		Procedure, cursor
	
	HTML : HyperTextMarkupLanguage - document를 tag로 구조화 - DOM탐색
	CSS : Cascading StyleSheet - document를 꾸며준다
	JAVASCRIPT : script language - document의 event
	* java와 다른 특징 => function이 변수에 값으로 들어간다
	$.ajax : 비동기 통신
	
	[jsp/servlet]
	servlet : java(html)
		init() -> service() -> doGet()/doPost() -> destroy()
	jsp : html(java)
	
	redirect : 새로운 요청
	forward : 이전과 같은 요청을 다음페이지에 전달
	
	[Spring]
	-> 경량 컨테이너 (EJB -> POJO)
	1. DI/IOC
	2. AOP
	3. OCP
	
	-> Spring MVC
	동작 순서
	
	Spring 버전 별 특징 및 쓰는 이유
	3.x 클래스에서 빈 생성 가능
	4.x
	5.x 코틀린 등과 연동 가능 (확장성 증가)
	
	Spring Boot : 서버 내장(default : tomcat)
	              디펜던시 추가 쉬움
	
	[개인적으로 생각하는, 공부해보면 좋은 애들]
	언어
	- kotlin / swift : application 쪽
	- golang : 수요가 적다 (당연히 공급도 적다.) = 일단 취업되면 내가 최고
	- node.js / react.js : 웹개발에 많이 쓴다.
	- python : 많은 분야에서 쓴다.
	
	db
	- mariadb : mysql 과 거의 똑같다. 중소기업은 mysql (or mariadb) 를 많이 쓴다.
	- mongodb : 간단한 crud는 쉽다. 조금 들어가게 되면 어렵지만, 좋은 기능들이 많다.
	
	기타
	- intellij idea : 유료 (학생계정 1년 무료)
	- vscode : front-end 개발에 거의 필수로 변하는 듯
*/









