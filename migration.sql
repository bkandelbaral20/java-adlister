USE adlister_db;

CREATE TABLE if not exists ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(50),
    title  VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    foreign key(user_id) references users(id)
);

CREATE TABLE if not exists users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(50),
    email VARCHAR(100) NOT NULL,
    password varchar(200) NOT NULL,
    PRIMARY KEY (id)
);