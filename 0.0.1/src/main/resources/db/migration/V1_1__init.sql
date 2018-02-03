CREATE TABLE Movie (
    id             SERIAL PRIMARY KEY,
    title          varchar(64),
    director    varchar(64)
);

INSERT INTO Movie (title,director) VALUES ('ET','Steven Spielberg');