INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Isaque Santos', 'isaque@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Bootcamp HTML', 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2021-07-26T00:00:00Z', TIMESTAMP WITH TIME ZONE '2022-07-26T00:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2021-07-31T00:00:00Z', TIMESTAMP WITH TIME ZONE '2022-12-31T00:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES ('Fórum', 'Tire aqui suas dúvidas', 2, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 2, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 0, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1);

INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 1', 'Nesse capítulo vamos começar o desenvolvimento', 1, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1, null);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 2', 'Nesse capítulo vamos dar continuidade no desenvolvimento 1', 2, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1, 1);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 3', 'Nesse capítulo vamos dar continuidade no desenvolvimento 2', 3, 'https://www.kindpng.com/picc/m/463-4634183_courses-icon-black-and-white-png-download-transparent.png', 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2021-07-26T00:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2021-07-26T00:00:00Z', null, true, false);
