--1. ���̺� ����
create table test(
no number primary KEY,
name VARCHAR2(20),
sal NUMBER
);

--2. test���̺� ���� Ȯ��
DESC test;

--3. ù��° �����͸� �÷����� ǥ���������� ������� ��������
insert into test
VALUES (1, '���¿�', 2000);

--4. ������ �����͸� �÷����� ǥ���ϰ� ������� �����Ͻÿ�.
insert into test (no,name,sal)
VALUES (2, '������', 2500);
insert into test (no,name,sal)
VALUES (3, '��ȣ��', 1500);

--5. ���� ���̺��� �����͸� ��� ��ȸ�Ͻÿ�.
select * from test;

--6. no�� 1�� �������� sal�� 2500���� �����Ͻÿ�.
update test SET sal = 2500
where no=1;

--7. sal�� 2000�̸��� �������� ��� Į���� ��ȸ�Ͻÿ�
select * from test
where sal<2000;

--8. sal�� 2000�̻��� �����͸� ��� sal�� ���� 3000���� �����ϰ�, ��� �����͸� ��ȸ�Ͻÿ�.
update test SET sal = 3000
where sal>=2000;
select * from test;

--9. test�� ��� �����͸� �����Ͻÿ�.
delete test;

--10. transaction�� �����Ͻÿ�.
commit;
