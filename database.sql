
create table Streets(
	id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) not null,
    length int not null,
    is_narrow boolean,
    is_noisy boolean,
    distance_from_metro int
);

create table Houses(
	id int PRIMARY KEY AUTO_INCREMENT,
    number_of_floors int not null,
    number_of_entrances int not null,
    material varchar(20) not null,
	color varchar(20) not null,
    house_condition varchar(20) not null,
    street_id int,
    FOREIGN KEY (street_id)  REFERENCES Streets (id)
);

create table Flats(
	id int PRIMARY KEY AUTO_INCREMENT,
    number_of_rooms int not null,
    floor int,
    price int not null,
    ceiling_height int not null,
    apartment_area int not null,
    house_id int,
    FOREIGN KEY (house_id)  REFERENCES Houses (id)
);