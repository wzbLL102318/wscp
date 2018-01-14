CREATE TABLE T_CREDIT_USER
(
ID VARCHAR(10) NOT NULL,
EMAIL VARCHAR(255) DEFAULT '',
PASSWORD VARCHAR(255) DEFAULT '',
USERNAME VARCHAR(255) DEFAULT '' ,
ROLE VARCHAR(255) DEFAULT '',
STATUS VARCHAR(1) DEFAULT '',
REGTIME VARCHAR(10) DEFAULT '',
DATETIME VARCHAR(10) DEFAULT '',
REGIP VARCHAR(255) DEFAULT '',
PRIMARY KEY (ID)
)TABLESPACE CREDIT_DATA;

Comment On Table T_Credit_User  Is  '登陆用户表';
Comment  On  Column  T_Credit_User.Id   Is  '主键';
Comment  On  Column  T_Credit_User.Email   Is  '邮箱';
Comment  On  Column  T_Credit_User.Password   Is  '密码';
Comment  On  Column  T_Credit_User.Username   Is  '用户名称';
Comment  On  Column  T_Credit_User.Role   Is  '角色';
Comment  On  Column  T_Credit_User.Status   Is  '状态';
Comment  On  Column  T_Credit_User.Regtime   Is  '注册日期';
Comment  On  Column  T_Credit_User.Datetime   Is  '生效日期';
Comment  On  Column  T_Credit_User.Regip   Is  '注册地';

--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE T_CREDIT_USER_ID_SEQ
INCREMENT BY 1 -- 每次加几个
START WITH 1 -- 从1开始计数
NOMAXVALUE -- 不设置最大值
NOCYCLE -- 一直累加，不循环
CACHE 10;

-- 为INSERT操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER T_CREDIT_USER_INS_TRG BEFORE INSERT ON T_CREDIT_USER FOR EACH ROW WHEN(NEW.ID IS NULL)
BEGIN
SELECT T_CREDIT_USER_ID_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
