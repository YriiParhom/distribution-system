INSERT INTO role (id, name, description)
VALUES (1, 'SUPER_ADMIN', 'Имеет доступ ко всем ресурсам, а также создавать, удалять юзеров и изменять их роли');

INSERT INTO role (id, name, description)
VALUES (2, 'ADMIN', 'Имеет доступ ко всем ресурсам, можает создавать/удалять UNIVERSITY_ADMIN и DORMITORY_ADMIN. ' ||
                    'Так же может создавать/удалять/изменять Student, University, Dormitory');

INSERT INTO role (id, name, description)
VALUES (3, 'UNIVERSITY_ADMIN', 'Имеет доступ к созданию Student, Dormitory');

INSERT INTO role (id, name, description)
VALUES (4, 'DORMITORY_ADMIN', 'Может заселять/выселять уже существующих Student');

INSERT INTO role (id, name, description)
VALUES (5, 'VISOR', 'Может только просматривать наличие Students и в какое общежитие и комнату они заселены');