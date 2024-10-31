
create database if not exists javafxTest;
use javafxTest;
CREATE TABLE `Pizza` (
  `id_pizza` int NOT NULL,
  `name_pizza` varchar(45) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `Filling_order_id_quantity` varchar(45) NOT NULL,
  PRIMARY KEY (`id_pizza`),
  KEY `fk_Pizza_Filling_order1_idx` (`Filling_order_id_quantity`),
  CONSTRAINT `fk_Pizza_Filling_order1` FOREIGN KEY (`Filling_order_id_quantity`) REFERENCES `Filling_order` (`id_quantity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

LOCK TABLES `Pizza` WRITE;
UNLOCK TABLES;


CREATE TABLE `Order` (
  `id_order` int NOT NULL,
  `payment_type` varchar(45) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `price` decimal(10,0) NOT NULL,
  `sale` int DEFAULT NULL,
  `Clients_id_clients` int NOT NULL,
  `Delivery_id_delivery` int NOT NULL,
  PRIMARY KEY (`id_order`),
  KEY `fk_Order_Clients_idx` (`Clients_id_clients`),
  KEY `fk_Order_Delivery1_idx` (`Delivery_id_delivery`),
  CONSTRAINT `fk_Order_Clients` FOREIGN KEY (`Clients_id_clients`) REFERENCES `Clients` (`id_clients`),
  CONSTRAINT `fk_Order_Delivery1` FOREIGN KEY (`Delivery_id_delivery`) REFERENCES `Delivery` (`id_delivery`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


LOCK TABLES `Order` WRITE;
UNLOCK TABLES;


CREATE TABLE `Filling_order` (
  `quantity` int NOT NULL,
  `id_quantity` varchar(45) NOT NULL,
  `Order_id_order` int NOT NULL,
  PRIMARY KEY (`id_quantity`),
  KEY `fk_Filling_order_Order1_idx` (`Order_id_order`),
  CONSTRAINT `fk_Filling_order_Order1` FOREIGN KEY (`Order_id_order`) REFERENCES `Order` (`id_order`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


LOCK TABLES `Filling_order` WRITE;
UNLOCK TABLES;


CREATE TABLE `Delivery` (
  `id_delivery` int NOT NULL,
  `sposob_delivery` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_delivery`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


LOCK TABLES `Delivery` WRITE;
UNLOCK TABLES;


CREATE TABLE `Clients` (
  `id_clients` int NOT NULL,
  `Surname` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `adress` varchar(100) DEFAULT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id_clients`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


LOCK TABLES `Clients` WRITE;
UNLOCK TABLES;