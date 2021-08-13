
INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');

INSERT INTO owners VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owners VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owners VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owners VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owners VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owners VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO vets VALUES (1, 'James', 'Carter');
INSERT INTO vets VALUES (2, 'Helen', 'Leary');
INSERT INTO vets VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO pets VALUES (1, '2010-07-03','Leo',  1, 1);
INSERT INTO pets VALUES (2, '2012-08-06','Basil', 6, 2);
INSERT INTO pets VALUES (3, '2011-04-17','Rosy',  2, 3);
INSERT INTO pets VALUES (4,'2010-03-07', 'Jewel',  2, 3);
INSERT INTO pets VALUES (5, '2010-11-30', 'Iggy',  3, 4);
INSERT INTO pets VALUES (6,  '2010-01-20', 'George',4, 5);
INSERT INTO pets VALUES (7, '2012-09-04', 'Samantha',  1, 6);
INSERT INTO pets VALUES (8,'2012-09-04', 'Max',  1, 3);
INSERT INTO pets VALUES (9, '2011-08-06','Lucky', 5, 5);
INSERT INTO pets VALUES (10,'2007-02-24', 'Mulligan',  2, 6);
INSERT INTO pets VALUES (11,'2010-03-09', 'Freddy',  5, 4);
INSERT INTO pets VALUES (12, '2010-06-24', 'Lucky', 2, 6);
INSERT INTO pets VALUES (13, '2012-06-08', 'Sly',  1, 1);

INSERT INTO visits VALUES (1,'2013-01-01', 'rabies shot', 1 );
INSERT INTO visits VALUES (2,'2013-01-02','rabies shot', 2);
INSERT INTO visits VALUES (3, '2013-01-03', 'neutered', 2 );
INSERT INTO visits VALUES (4,'2013-01-04','spayed', 5 );
