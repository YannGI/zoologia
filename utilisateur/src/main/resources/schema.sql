-- DROP TABLE IF EXISTS `utilisateur`;
-- DROP TABLE IF EXISTS `categorie`;
-- DROP TABLE IF EXISTS `famille`;
-- DROP TABLE IF EXISTS `statut`;
-- DROP TABLE IF EXISTS `pays`;
-- DROP TABLE IF EXISTS `lieu`;
-- DROP TABLE IF EXISTS `animal`;
-- DROP TABLE IF EXISTS `jointure_animal_lieu`;

CREATE TABLE  IF NOT EXISTS `utilisateur` (
`iduser` int NOT NULL AUTO_INCREMENT,
`firstname` varchar(60) NOT NULL,
`lastnameutilisateur` varchar(60) NOT NULL,
`username` varchar(60) NOT NULL,
`email` varchar(100) NOT NULL UNIQUE,
`password` varchar(45) NOT NULL,
`sirette` varchar(45) NOT NULL,
`usertype` int NOT NULL,
PRIMARY KEY (`iduser`)
);

CREATE TABLE  IF NOT EXISTS `categorie` (
`idcategorie` int NOT NULL,
`nom` varchar(60) NOT NULL,
PRIMARY KEY (`idcategorie`)
);

CREATE TABLE  IF NOT EXISTS `famille` (
`idfamille` int NOT NULL,
`nom` varchar(60) NOT NULL,
PRIMARY KEY (`idfamille`)
);

CREATE TABLE  IF NOT EXISTS `statut` (
`idstatut` int NOT NULL,
`nom` varchar(60) NOT NULL,
PRIMARY KEY (`idstatut`)
);

CREATE TABLE  IF NOT EXISTS `pays` (
`idpays` int NOT NULL AUTO_INCREMENT,
`nompays` varchar(60) NOT NULL,
PRIMARY KEY (`idpays`)
);

CREATE TABLE  IF NOT EXISTS `lieu` (
`idlieu` int NOT NULL AUTO_INCREMENT,
`nomlieu` varchar(100) NOT NULL,
`gps` varchar(300) DEFAULT NULL,
`idpays` int DEFAULT NULL,
PRIMARY KEY (`idlieu`),
CONSTRAINT `FK_LIEU_PAYS` FOREIGN KEY (`idpays`) REFERENCES `pays` (`idpays`)
);

CREATE TABLE  IF NOT EXISTS `animal` (
`idanimal` int NOT NULL,
`nom` varchar(60) NOT NULL,
`taille` varchar(10) NOT NULL,
`regimalim` varchar(45) NOT NULL,
`description` varchar(250) NOT NULL,
`statfavoris` BOOLEAN NOT NULL DEFAULT FALSE,
`idcategorie` int DEFAULT NULL,
`idfamille` int DEFAULT NULL,
`idstatut` int DEFAULT NULL,
PRIMARY KEY (`idanimal`),
CONSTRAINT `FK_ANIMAL_CATEGORIE` FOREIGN KEY (`idcategorie`) REFERENCES `categorie` (`idcategorie`),
CONSTRAINT `FK_ANIMAL_FAMILLE` FOREIGN KEY (`idfamille`) REFERENCES `famille` (`idfamille`),
CONSTRAINT `FK_ANIMAL_STATUT` FOREIGN KEY (`idstatut`) REFERENCES `statut` (`idstatut`)
);

CREATE TABLE  IF NOT EXISTS `jointure_animal_lieu` (
`idanimal` int NOT NULL,
`idlieu` int NOT NULL,
PRIMARY KEY (`idanimal`,`idlieu`),
KEY `idlieu` (`idlieu`),
CONSTRAINT `jointure_animal_lieu_ibfk_1` FOREIGN KEY (`idanimal`) REFERENCES `animal` (`idanimal`),
CONSTRAINT `jointure_animal_lieu_ibfk_2` FOREIGN KEY (`idlieu`) REFERENCES `lieu` (`idlieu`)
);