INSERT INTO employee VALUES
(1,'user1@gmail.com','user1','$2a$12$I4RmPVI42WJBYIjHkAIDC.7Mfp5vfg/xfOqLmHlE/bxNVr.ykjtSC','user1'),
(2,'user2gmail.com','user2','$2a$12$I4RmPVI42WJBYIjHkAIDC.7Mfp5vfg/xfOqLmHlE/bxNVr.ykjtSC','user2');

INSERT INTO roles VALUES (1,'ROLE_USER'),(2,'ROLE_ADMIN');

INSERT INTO employee_roles VALUES (1,1),(2,2);


INSERT INTO users VALUES (1, 'user@gmail.com', 'user', '$2a$10$5cIUjVkvIcjfPDKzdsxeuuhzw6ZoK0nc1f.C8McCBBMxxCO3bAF9m', 'user'),
(2, 'admin@gmail.com', 'admin', '$2a$10$t6mK9fiIUJWpihKsRSwjruwqB4RnRkiF2ua4ZnvPyL9lx1.6OeIAW', 'admin')

INSERT INTO roles VALUES (1,'ROLE_USER'),(2,'ROLE_ADMIN');

INSERT INTO users_roles VALUES (1,1),(2,2);