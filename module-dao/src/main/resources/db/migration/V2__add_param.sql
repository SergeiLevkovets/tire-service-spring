
INSERT INTO users (name, email, password, phone) value ('root', 'root@email.com', 'root', '8 029 111 11 11');

insert into users_to_roles (user_id, role)
values
        (1, 'ROLE_USER'),
        (1, 'ROLE_ADMIN');

INSERT INTO diameters (diameter)
VALUES ('r13'),
       ('r14'),
       ('r14c'),
       ('r15'),
       ('r15c'),
       ('r16'),
       ('r16c'),
       ('r17'),
       ('r17c'),
       ('r17.5'),
       ('r18'),
       ('r19'),
       ('r19.5'),
       ('r20'),
       ('r21'),
       ('r22'),
       ('r22.5');

INSERT INTO heights (height)
VALUES ('15'),
       ('20'),
       ('25'),
       ('30'),
       ('35'),
       ('40'),
       ('45'),
       ('50'),
       ('55'),
       ('60'),
       ('65'),
       ('70'),
       ('75'),
       ('80'),
       ('85'),
       ('90'),
       ('95'),
       ('100'),
       ('105');

INSERT INTO widths (width)
VALUES ('115'),
       ('120'),
       ('125'),
       ('130'),
       ('135'),
       ('140'),
       ('145'),
       ('150'),
       ('155'),
       ('160'),
       ('165'),
       ('170'),
       ('175'),
       ('180'),
       ('185'),
       ('190'),
       ('195'),
       ('200'),
       ('205'),
       ('215'),
       ('220'),
       ('225'),
       ('230'),
       ('235'),
       ('240'),
       ('245'),
       ('250'),
       ('255'),
       ('260'),
       ('265'),
       ('270'),
       ('275'),
       ('280'),
       ('285'),
       ('290'),
       ('295'),
       ('300'),
       ('305'),
       ('310'),
       ('315'),
       ('320'),
       ('325'),
       ('330'),
       ('335'),
       ('340'),
       ('345'),
       ('350'),
       ('355'),
       ('360'),
       ('365'),
       ('370'),
       ('375'),
       ('380'),
       ('385'),
       ('390'),
       ('395'),
       ('400'),
       ('405');



INSERT INTO service_items (name, article)
VALUES
       ('Монтаж', 'mounting'),
       ('Монтаж с кольцом', 'mountingRing'),
       ('Монтаж сельхоз шины', 'mountingHeavy'),
       ('Монтаж Джип-Уаз', 'mountingSuv'),
       ('Демонтаж', 'dismantling'),
       ('Демонтаж с кольцом', 'dismantlingRing'),
       ('Демонтаж сельхоз шины', 'dismantlingHeavy'),
       ('Демонтаж Джип-Уаз', 'dismantlingSuv'),
       ('Балансировка', 'balancing'),
       ('Балансировка Джип-Уаз', 'balancingSuv'),
       ('Снятие колеса с а/м', 'wheelRemove'),
       ('Снятие сельхоз колеса с а/м', 'wheelRemoveHeavy'),
       ('Снятие колеса с Джип-Уаз', 'wheelRemoveSuv'),
       ('Снятие колес спарка', 'wheelRemoveDual'),
       ('Установка колеса на а/м', 'wheelInstall'),
       ('Установка сельхоз колеса на а/м', 'wheelInstallHeavy'),
       ('Установка колеса на Джип-Уаз', 'wheelInstallSuv'),
       ('Установка колес спарка', 'wheelInstallDual'),
       ('Взравная накачка колеса', 'explosivePumping'),
       ('Замена вентеля', 'valveReplacement'),
       ('Использование клеящихся грузов', 'balanceWeightsAdhesive'),
       ('Установка камеры', 'cameraInsert'),
       ('Чистка диска', 'cleaning'),
       ('Накачка колеса', 'pumping'),
       ('Накачка большого колеса', 'pumpingHeavy'),
       ('Использование ключа или домкрата', 'usingKeyJack'),
       ('Герметизация по ободу', 'sealing'),
       ('Диагностика колеса', 'diagnostic'),
       ('Ремонт прокола', 'punctureRepair'),
       ('Ремонт пореза', 'cutRepair'),
       ('Ремонт большого пореза', 'bigCutRepair'),
       ('Ремонт вертикального пореза', 'verticalCutRepair'),
       ('Латка up40', 'patch_up40'),
       ('Латка up50', 'patch_up50'),
       ('Латка up6', 'patch_up6'),
       ('Латка rad11', 'patch_rad11'),
       ('Латка rad19', 'patch_rad19'),
       ('Латка rad20', 'patch_rad20'),
       ('Латка rad40', 'patch_rad40'),
       ('Латка rs35', 'patch_rs35'),
       ('Латка r35', 'patch_r35'),
       ('Латка tl110', 'patch_tl110'),
       ('Латка tl115', 'patch_tl115'),
       ('Вентиль tr413', 'valve_tr413'),
       ('Вентиль tr413c', 'valve_tr413c'),
       ('Вентиль tk', 'valve_tk'),
       ('Вентиль gk135', 'valve_gk135');

INSERT INTO types (type)
VALUES ('universal'),
       ('car'),
       ('bus'),
       ('truck'),
       ('patch'),
       ('valve');


INSERT INTO service_item_prices (service_item_id, type_id, diameter_id, price)
VALUES
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'truck'), null, 5.00),
       ((SELECT id from service_items where article = 'mountingRing' ),(Select id from types where type = 'truck'), null, 4.00),
       ((SELECT id from service_items where article = 'mountingHeavy' ),(Select id from types where type = 'truck'), null, 8.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'truck'), null, 5.00),
       ((SELECT id from service_items where article = 'dismantlingRing' ),(Select id from types where type = 'truck'), null, 4.00),
       ((SELECT id from service_items where article = 'dismantlingHeavy' ),(Select id from types where type = 'truck'), null, 8.50),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'truck'), null, 5.00),
       ((SELECT id from service_items where article = 'pumping' ),(Select id from types where type = 'truck'), null, 1.00),
       ((SELECT id from service_items where article = 'pumpingHeavy' ),(Select id from types where type = 'truck'), null, 1.50),
       ((SELECT id from service_items where article = 'wheelRemove' ),(Select id from types where type = 'truck'), null, 3.00),
       ((SELECT id from service_items where article = 'wheelRemoveHeavy' ),(Select id from types where type = 'truck'), null, 5.00),
       ((SELECT id from service_items where article = 'wheelInstall' ),(Select id from types where type = 'truck'), null, 3.00),
       ((SELECT id from service_items where article = 'wheelInstallHeavy' ),(Select id from types where type = 'truck'), null, 5.00),

       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r13'), 1.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r14'), 1.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r15'), 2.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r16'), 2.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r17'), 2.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r18'), 2.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r19'), 3.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r20'), 3.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r21'), 3.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r22'), 3.50),

       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r13'), 1.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r14'), 1.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r15'), 2.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r16'), 2.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r17'), 2.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r18'), 2.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r19'), 3.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r20'), 3.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r21'), 3.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r22'), 3.50),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r13'), 3.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r14'), 3.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r15'), 3.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r16'), 4.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r17'), 4.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r18'), 5.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r19'), 6.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r20'), 6.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r21'), 7.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'car'), (Select id from diameters where diameter = 'r22'), 7.00),
       ((SELECT id from service_items where article = 'wheelRemove' ),(Select id from types where type = 'car'), null, 1.00),
       ((SELECT id from service_items where article = 'wheelInstall' ),(Select id from types where type = 'car'), null, 1.00),

       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r14'), 2.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r15'), 2.00),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r16'), 2.50),
       ((SELECT id from service_items where article = 'mounting' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r17'), 3.00),
       ((SELECT id from service_items where article = 'mountingSuv' ),(Select id from types where type = 'bus'), null, 3.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r14'), 2.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r15'), 2.00),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r16'), 2.50),
       ((SELECT id from service_items where article = 'dismantling' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r17'), 3.00),
       ((SELECT id from service_items where article = 'dismantlingSuv' ),(Select id from types where type = 'bus'), null, 3.50),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r14'), 4.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r15'), 4.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r16'), 5.00),
       ((SELECT id from service_items where article = 'balancing' ),(Select id from types where type = 'bus'), (Select id from diameters where diameter = 'r17'), 5.00),
       ((SELECT id from service_items where article = 'balancingSuv' ),(Select id from types where type = 'bus'), null, 6.00),
       ((SELECT id from service_items where article = 'wheelRemove' ),(Select id from types where type = 'bus'), null, 1.50),
       ((SELECT id from service_items where article = 'wheelRemoveSuv' ),(Select id from types where type = 'bus'), null, 2.00),
       ((SELECT id from service_items where article = 'wheelRemoveDual' ),(Select id from types where type = 'bus'), null, 3.00),
       ((SELECT id from service_items where article = 'wheelInstall' ),(Select id from types where type = 'bus'), null, 1.50),
       ((SELECT id from service_items where article = 'wheelInstallSuv' ),(Select id from types where type = 'bus'), null, 2.00),
       ((SELECT id from service_items where article = 'wheelInstallDual' ),(Select id from types where type = 'bus'), null, 3.00),

       ((SELECT id from service_items where article = 'valveReplacement' ),(Select id from types where type = 'universal'), null, 1.00),
       ((SELECT id from service_items where article = 'balanceWeightsAdhesive' ),(Select id from types where type = 'universal'), null, 1.00),
       ((SELECT id from service_items where article = 'cameraInsert' ),(Select id from types where type = 'universal'), null, 2.00),
       ((SELECT id from service_items where article = 'cleaning' ),(Select id from types where type = 'universal'), null, 1.00),
       ((SELECT id from service_items where article = 'diagnostic' ),(Select id from types where type = 'universal'), null, 2.00),
       ((SELECT id from service_items where article = 'punctureRepair' ),(Select id from types where type = 'universal'), null, 3.00),
       ((SELECT id from service_items where article = 'cutRepair' ),(Select id from types where type = 'universal'), null, 4.00),
       ((SELECT id from service_items where article = 'bigCutRepair' ),(Select id from types where type = 'universal'), null, 5.00),
       ((SELECT id from service_items where article = 'verticalCutRepair' ),(Select id from types where type = 'universal'), null, 7.00),
       ((SELECT id from service_items where article = 'sealing' ),(Select id from types where type = 'universal'), null, 2.00),
       ((SELECT id from service_items where article = 'usingKeyJack' ),(Select id from types where type = 'universal'), null, 1.00),
       ((SELECT id from service_items where article = 'pumping' ),(Select id from types where type = 'universal'), null, 0.50),
       ((SELECT id from service_items where article = 'explosivePumping' ),(Select id from types where type = 'universal'), null, 2.00),
       ((SELECT id from service_items where article = 'patch_up40' ),(Select id from types where type = 'patch'), null, 4.00),
       ((SELECT id from service_items where article = 'patch_up50' ),(Select id from types where type = 'patch'), null, 4.00),
       ((SELECT id from service_items where article = 'patch_up6' ),(Select id from types where type = 'patch'), null, 5.00),
       ((SELECT id from service_items where article = 'patch_rad11' ),(Select id from types where type = 'patch'), null, 8.00),
       ((SELECT id from service_items where article = 'patch_rad19' ),(Select id from types where type = 'patch'), null, 10.00),
       ((SELECT id from service_items where article = 'patch_rad20' ),(Select id from types where type = 'patch'), null, 11.00),
       ((SELECT id from service_items where article = 'patch_rad40' ),(Select id from types where type = 'patch'), null, 35.00),
       ((SELECT id from service_items where article = 'patch_rs35' ),(Select id from types where type = 'patch'), null, 45.00),
       ((SELECT id from service_items where article = 'patch_r35' ),(Select id from types where type = 'patch'), null, 40.00),
       ((SELECT id from service_items where article = 'patch_tl110' ),(Select id from types where type = 'patch'), null, 9.00),
       ((SELECT id from service_items where article = 'patch_tl115' ),(Select id from types where type = 'patch'), null, 11.00),
       ((SELECT id from service_items where article = 'valve_tr413' ),(Select id from types where type = 'valve'), null, 1.00),
       ((SELECT id from service_items where article = 'valve_tr413c' ),(Select id from types where type = 'valve'), null, 2.00),
       ((SELECT id from service_items where article = 'valve_tk' ),(Select id from types where type = 'valve'), null, 35.00),
       ((SELECT id from service_items where article = 'valve_gk135' ),(Select id from types where type = 'valve'), null, 25.00);



