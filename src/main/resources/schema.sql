create table if not exists enrollee (
	id serial primary key,
    name varchar(32) not null,
    age int not null
);