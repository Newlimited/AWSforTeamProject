USE BODYMANAGER;

# USER 
CREATE VIEW manager_info AS(
SELECT U.user_code, U.user_email,
U.user_nickname, U.user_age, U.user_phone_number
FROM user U, manager M 
WHERE U.user_email = M.manager_email
ORDER BY user_code ASC
);




# BOARD
CREATE VIEW board_view AS (
SELECT
B.board_number AS boardNumber,
M.manager_email AS boardWriterEmail,
B.board_writer_nickname AS boardWriterNickname,
B.board_title AS title,
B.board_content AS boardContent,
B.board_image_url AS boardImageUrl,
B.view_count AS viewCount,
B.board_write_datetime AS boardWriteDatetime
From board B, manager M, user U
WHERE B.board_writer_email = M.manager_email
AND M.manager_email = U.user_email
ORDER BY B.board_number DESC
);
SELECT * from board_view ;





#EXCERCISE_ROUTINE
INSERT INTO exercise_routine VALUES (1, "routine 1", "routine 2", "routine 3");
INSERT INTO exercise_routine VALUES (2, "routine 1", "routine 2", "routine 3");
INSERT INTO exercise_routine VALUES (3, "routine 1", "routine 2", "routine 3");







# MANAGER




# BODYINFO



# MENU



# MILEAGE
