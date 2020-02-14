

create table users
(
    id       integer not null auto_increment,
    email    varchar(255) not null,
    name     varchar(255) not null,
    password varchar(255) not null,
    phone    varchar(255) not null,
    primary key (id),
    constraint UK_email unique (email),
    constraint UK_phone unique (phone)
);

create table diameters
(
    id       integer not null auto_increment,
    diameter varchar(255) not null,
    primary key (id)
);

create table heights
(
    id     integer not null auto_increment,
    height varchar(255) not null,
    primary key (id)
);

create table widths
(
    id    integer not null auto_increment,
    width varchar(255) not null,
    primary key (id)
);

create table types
(
    id   integer not null auto_increment,
    type varchar(255) not null,
    primary key (id)
);

create table tires
(
    id          integer not null auto_increment,
    date        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    diameter_id integer not null,
    height_id   integer not null,
    width_id    integer not null,
    primary key (id),
    CONSTRAINT `fk_tires_to_width` FOREIGN KEY (`width_id`) REFERENCES widths (`id`),
    CONSTRAINT `fk_tires_to_height` FOREIGN KEY (`height_id`) REFERENCES heights (`id`),
    CONSTRAINT `fk_tires_to_diameter` FOREIGN KEY (`diameter_id`) REFERENCES diameters (`id`)
);

create table service_items
(
    id      integer not null auto_increment,
    article varchar(255) not null,
    name    varchar(255) not null,
    primary key (id)
);

create table service_item_prices
(
    id              integer not null auto_increment,
    price           double precision not null,
    diameter_id     integer,
    service_item_id integer not null,
    type_id         integer not null,
    primary key (id),
    constraint fk_to_diameters foreign key (diameter_id) references diameters (id),
    constraint fk_to_items foreign key (service_item_id) references service_items (id),
    constraint fk_to_types foreign key (type_id) references types (id)
);

create table orders
(
    id          integer not null auto_increment,
    date        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_price double precision not null,
    tire_id     integer not null,
    type_id     integer not null,
    user_id     integer not null,
    primary key (id),
    constraint fk_order_to_tire foreign key (tire_id) references tires (id),
    constraint fk_order_to_type foreign key (type_id) references types (id),
    constraint fk_order_to_user foreign key (user_id) references users (id)
);

create table orders_to_service_item_prices
(
    order_id integer not null,
    count    integer not null,
    service_item_price_id  integer not null,
    primary key (order_id, service_item_price_id),
    constraint fk_price_to_item foreign key (service_item_price_id) references service_item_prices (id),
    constraint fk_price_to_order foreign key (order_id) references orders (id)
);

create table users_to_roles
(
    user_id integer not null,
    role    varchar(255) not null,
     constraint fk_role_to_user foreign key (user_id) references users (id)
);
