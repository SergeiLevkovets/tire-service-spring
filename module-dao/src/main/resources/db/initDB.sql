DROP SCHEMA IF EXISTS `tire_service_db`;

CREATE SCHEMA IF NOT EXISTS `tire_service_db`
    CHARACTER SET `utf8`;

USE `tire_service_db`;

CREATE TABLE `tire_service_db`.`users`
(
    `id`       INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name`     VARCHAR(255) NOT NULL,
    `email`    VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `phone`    VARCHAR(255) NOT NULL
#     `role`     VARCHAR(255) NOT NULL DEFAULT 'user'
);

CREATE TABLE `tire_service_db`.`roles`
(
    `fk_user_id`    INTEGER      NOT NULL,
    `role`          VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`widths`
(
    `id`    INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `width` VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`heights`
(
    `id`     INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `height` VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`diameters`
(
    `id`       INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `diameter` VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`types`
(
    `id`   INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `type` VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`service_items`
(
    `id`         INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name`       VARCHAR(255) NOT NULL,
    `article`    VARCHAR(255) NOT NULL
);

CREATE TABLE `tire_service_db`.`tires`
(
    `id`             INTEGER    NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `fk_width_id`    INTEGER    NOT NULL,
    `fk_height_id`   INTEGER    NOT NULL,
    `fk_diameter_id` INTEGER    NULL,
    `date`           TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT `fk_to_width` FOREIGN KEY (`fk_width_id`) REFERENCES widths (`id`),
    CONSTRAINT `fk_to_height` FOREIGN KEY (`fk_height_id`) REFERENCES heights (`id`),
    CONSTRAINT `fk_to_diameter` FOREIGN KEY (`fk_diameter_id`) REFERENCES diameters (`id`)
    ON DELETE SET NULL
);

CREATE TABLE `tire_service_db`.`service_item_prices`
(
    `id`                    INTEGER         NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `fk_service_item_id`    INTEGER         NOT NULL,
    `fk_type_id`            INTEGER         NOT NULL,
    `fk_diameter_id`        INTEGER         NULL,
    `price`                 NUMERIC(10, 2)  NOT NULL,
    CONSTRAINT `fk_to_items` FOREIGN KEY (fk_service_item_id) REFERENCES service_items (`id`)
    ON DELETE CASCADE,
    CONSTRAINT `fk_to_types` FOREIGN KEY (fk_type_id) REFERENCES types (`id`),
    CONSTRAINT `fk_to_diameters` FOREIGN KEY (`fk_diameter_id`) REFERENCES diameters (`id`)
    ON DELETE SET NULL
);

CREATE TABLE `tire_service_db`.`orders`
(
    `id`         INTEGER   NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `fk_user_id` INTEGER   NOT NULL,
    `fk_tire_id` INTEGER   NOT NULL,
    `fk_type_id` INTEGER   NOT NULL,
    `date`       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT `fk_to_user` FOREIGN KEY (`fk_user_id`) REFERENCES users (`id`),
    CONSTRAINT `fk_to_tire` FOREIGN KEY (`fk_tire_id`) REFERENCES tires (`id`),
    CONSTRAINT `fk_to_type` FOREIGN KEY (fk_type_id) REFERENCES types (`id`)

);

CREATE TABLE `tire_service_db`.`orders_to_service_item_prices`
(
    `id`                       INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `fk_orders_id`             INTEGER NOT NULL,
    `fk_service_item_price_id` INTEGER NULL,
    `count`                    INTEGER NOT NULL DEFAULT 1,
    `price`      NUMERIC(10, 2) NOT NULL,
    CONSTRAINT `fk_to_order` FOREIGN KEY (`fk_orders_id`) REFERENCES `orders` (`id`),
    CONSTRAINT `fk_to_service_item_price` FOREIGN KEY (`fk_service_item_price_id`) REFERENCES `service_item_prices` (`id`)
    ON DELETE SET NULL
);

