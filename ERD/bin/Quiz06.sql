

/* Create Sequences */

CREATE SEQUENCE SEQ_customer_customer_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_delivery_delivery_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_delivery_detail_delivery_detail_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_inventory_inventory_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_iostatus_iostatus_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_orders_order_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_order_order_no INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_product_product_no INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE customer
(
	customer_no number(10,0) NOT NULL,
	customer_name varchar2(50) NOT NULL,
	contract_date date NOT NULL,
	discount_rate number(10,4) DEFAULT 0 NOT NULL,
	PRIMARY KEY (customer_no)
);


CREATE TABLE delivery
(
	delivery_no number(10,0) NOT NULL,
	order_no number(10,0) NOT NULL,
	PRIMARY KEY (delivery_no)
);


CREATE TABLE delivery_detail
(
	delivery_detail_no number(10,0) NOT NULL,
	delivery_no number(10,0) NOT NULL,
	delivery_info varchar2(50),
	delivery_time date,
	PRIMARY KEY (delivery_detail_no)
);


CREATE TABLE inventory
(
	inventory_no number(10,0) NOT NULL,
	product_no number(10,0) NOT NULL,
	product_year date NOT NULL,
	product_qty number(10,0) NOT NULL,
	PRIMARY KEY (inventory_no)
);


CREATE TABLE iostatus
(
	iostatus_no number(10,0) NOT NULL,
	inventory_no number(10,0) NOT NULL,
	io_qty number(10,0),
	-- 
	-- 
	io_date date,
	io varchar2(10),
	PRIMARY KEY (iostatus_no)
);


CREATE TABLE orders
(
	order_no number(10,0) NOT NULL,
	customer_no number(10,0) NOT NULL,
	sale date DEFAULT sysdate NOT NULL,
	PRIMARY KEY (order_no)
);


CREATE TABLE order_mangement
(
	inventory_no number(10,0) NOT NULL,
	order_no number(10,0) NOT NULL,
	product_qty number(10,0) NOT NULL,
	PRIMARY KEY (inventory_no, order_no)
);


CREATE TABLE product
(
	product_no number(10,0) NOT NULL,
	product_name varchar2(50) NOT NULL,
	product_group varchar2(50),
	product_price number(10,0) NOT NULL,
	product_info varchar2(100),
	PRIMARY KEY (product_no)
);



/* Create Foreign Keys */

ALTER TABLE orders
	ADD FOREIGN KEY (customer_no)
	REFERENCES customer (customer_no)
;


ALTER TABLE delivery_detail
	ADD FOREIGN KEY (delivery_no)
	REFERENCES delivery (delivery_no)
;


ALTER TABLE iostatus
	ADD FOREIGN KEY (inventory_no)
	REFERENCES inventory (inventory_no)
;


ALTER TABLE order_mangement
	ADD FOREIGN KEY (inventory_no)
	REFERENCES inventory (inventory_no)
;


ALTER TABLE delivery
	ADD FOREIGN KEY (order_no)
	REFERENCES orders (order_no)
;


ALTER TABLE order_mangement
	ADD FOREIGN KEY (order_no)
	REFERENCES orders (order_no)
;


ALTER TABLE inventory
	ADD FOREIGN KEY (product_no)
	REFERENCES product (product_no)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_customer_customer_no BEFORE INSERT ON customer
FOR EACH ROW
BEGIN
	SELECT SEQ_customer_customer_no.nextval
	INTO :new.customer_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_delivery_delivery_no BEFORE INSERT ON delivery
FOR EACH ROW
BEGIN
	SELECT SEQ_delivery_delivery_no.nextval
	INTO :new.delivery_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_delivery_detail_delivery_detail_no BEFORE INSERT ON delivery_detail
FOR EACH ROW
BEGIN
	SELECT SEQ_delivery_detail_delivery_detail_no.nextval
	INTO :new.delivery_detail_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_inventory_inventory_no BEFORE INSERT ON inventory
FOR EACH ROW
BEGIN
	SELECT SEQ_inventory_inventory_no.nextval
	INTO :new.inventory_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_iostatus_iostatus_no BEFORE INSERT ON iostatus
FOR EACH ROW
BEGIN
	SELECT SEQ_iostatus_iostatus_no.nextval
	INTO :new.iostatus_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_orders_order_no BEFORE INSERT ON orders
FOR EACH ROW
BEGIN
	SELECT SEQ_orders_order_no.nextval
	INTO :new.order_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_order_order_no BEFORE INSERT ON order
FOR EACH ROW
BEGIN
	SELECT SEQ_order_order_no.nextval
	INTO :new.order_no
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_product_product_no BEFORE INSERT ON product
FOR EACH ROW
BEGIN
	SELECT SEQ_product_product_no.nextval
	INTO :new.product_no
	FROM dual;
END;

/




/* Comments */

COMMENT ON COLUMN iostatus.io_date IS '
';



