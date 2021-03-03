

/* Create Sequences */

CREATE SEQUENCE SEQ_board_bno INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_comment_cno INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_lecture_lno INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_reply_rno INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE admins
(
	id varchar2(50) NOT NULL,
	regdate date DEFAULT sysdate,
	PRIMARY KEY (id)
);


CREATE TABLE board
(
	bno number(10,0) NOT NULL,
	id varchar2(50) NOT NULL,
	titile varchar2(50),
	contends varchar2(50),
	regdate date DEFAULT sysdate,
	PRIMARY KEY (bno)
);


CREATE TABLE lecture
(
	lno number(10,0) NOT NULL,
	teacher varchar2(50) NOT NULL,
	l_list varchar2(50) NOT NULL,
	PRIMARY KEY (lno)
);


CREATE TABLE lecture_list
(
	member_id varchar2(50) NOT NULL,
	lno number(10,0) NOT NULL,
	PRIMARY KEY (member_id, lno)
);


CREATE TABLE members
(
	member_id varchar2(50) NOT NULL,
	info varchar2(50),
	regdate date DEFAULT sysdate,
	PRIMARY KEY (member_id)
);


CREATE TABLE reply
(
	rno number(10,0) NOT NULL,
	contends varchar2(50),
	regdate date DEFAULT sysdate,
	bno number(10,0) NOT NULL,
	member_id varchar2(50) NOT NULL,
	PRIMARY KEY (rno)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bno)
	REFERENCES board (bno)
;


ALTER TABLE lecture_list
	ADD FOREIGN KEY (lno)
	REFERENCES lecture (lno)
;


ALTER TABLE admins
	ADD FOREIGN KEY (id)
	REFERENCES members (member_id)
;


ALTER TABLE board
	ADD FOREIGN KEY (id)
	REFERENCES members (member_id)
;


ALTER TABLE lecture_list
	ADD FOREIGN KEY (member_id)
	REFERENCES members (member_id)
;


ALTER TABLE reply
	ADD FOREIGN KEY (member_id)
	REFERENCES members (member_id)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_board_bno BEFORE INSERT ON board
FOR EACH ROW
BEGIN
	SELECT SEQ_board_bno.nextval
	INTO :new.bno
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_comment_cno BEFORE INSERT ON comment
FOR EACH ROW
BEGIN
	SELECT SEQ_comment_cno.nextval
	INTO :new.cno
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_lecture_lno BEFORE INSERT ON lecture
FOR EACH ROW
BEGIN
	SELECT SEQ_lecture_lno.nextval
	INTO :new.lno
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_reply_rno BEFORE INSERT ON reply
FOR EACH ROW
BEGIN
	SELECT SEQ_reply_rno.nextval
	INTO :new.rno
	FROM dual;
END;

/%3CmxGraphModel%3E%3Croot%3E%3CmxCell%20id%3D%220%22%2F%3E%3CmxCell%20id%3D%221%22%20parent%3D%220%22%2F%3E%3CmxCell%20id%3D%222%22%20value%3D%22%EA%B0%95%EC%9D%98%EB%B2%88%ED%98%B8%22%20style%3D%22ellipse%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3Balign%3Dcenter%3Bsketch%3D0%3Bshadow%3D0%3BfontStyle%3D4%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22400%22%20y%3D%2230%22%20width%3D%22100%22%20height%3D%2240%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3C%2Froot%3E%3C%2FmxGraphModel%3E




