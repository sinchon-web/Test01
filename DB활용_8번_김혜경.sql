--1. 테이블 생성
create table test(
no number primary KEY,
name VARCHAR2(20),
sal NUMBER
);

--2. test테이블 구조 확인
DESC test;

--3. 첫번째 데이터를 컬럼명을 표현하지말고 순서대로 넣으세요
insert into test
VALUES (1, '차승원', 2000);

--4. 나머지 데이터를 컬럼명을 표현하고 순서대로 삽입하시오.
insert into test (no,name,sal)
VALUES (2, '유해진', 2500);
insert into test (no,name,sal)
VALUES (3, '손호준', 1500);

--5. 현재 테이블의 데이터를 모두 조회하시오.
select * from test;

--6. no가 1인 데이터의 sal을 2500으로 변경하시오.
update test SET sal = 2500
where no=1;

--7. sal이 2000미만의 데이터의 모든 칼럼을 조회하시오
select * from test
where sal<2000;

--8. sal이 2000이상의 데이터를 모두 sal의 값을 3000으로 변경하고, 모든 데이터를 조회하시오.
update test SET sal = 3000
where sal>=2000;
select * from test;

--9. test의 모든 데이터를 삭제하시오.
delete from test;

--10. transaction을 종료하시오.
commit;
