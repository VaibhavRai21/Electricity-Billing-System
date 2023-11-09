create DataBase Bill_system;
use Bill_system;
create table signup(
meter_no varchar(20),
username varchar(10),
name varchar(30),
password varchar(20),
usertype varchar(20)); 

select * from signup;

create table new_customer(
name varchar(30),
meterno varchar(20),
address varchar(50),
city varchar(20),
state varchar(20),
email varchar(20),
phone varchar(12));

select * from new_customer;


create table meter_info(
meter_number varchar(20),
meter_location varchar(30),
phasecode varchar(20),
billtype varchar(20),
days varchar(20));

select * from meter_info;
