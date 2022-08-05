-- noinspection SqlResolveForFile

insert into customers (id, name) VALUES (1, 'Bob');
insert into customers (id, name) values (2, 'Henry');
insert into customers (id, name) values (3, 'Mich');
insert into customers (id, name) values (4, 'Johnny');

insert into movies (id, title, price_code) values (1, 'Star Wars: Episode I - The Phantom Menace', 0);
insert into movies (id, title, price_code) values (2, 'The Green Knight', 1);
insert into movies (id, title, price_code) values (3, 'Wild Tales', 0);
insert into movies (id, title, price_code) values (4, 'Moonrise Kingdom', 2);
insert into movies (id, title, price_code) values (5, 'Dune', 1);

insert into rentals (id, days_rented, movie_id) values (1, 1, 1);
insert into rentals (id, days_rented, movie_id) values (2, 2, 2);
insert into rentals (id, days_rented, movie_id) values (3, 3, 3);
insert into rentals (id, days_rented, movie_id) values (4, 4, 4);
insert into rentals (id, days_rented, movie_id) values (5, 5, 5);

insert into customers_rentals (customer_id, rentals_id) values (1, 1);
insert into customers_rentals (customer_id, rentals_id) values (2, 2);
insert into customers_rentals (customer_id, rentals_id) values (3, 3);
insert into customers_rentals (customer_id, rentals_id) values (4, 4);
insert into customers_rentals (customer_id, rentals_id) values (4, 5);
