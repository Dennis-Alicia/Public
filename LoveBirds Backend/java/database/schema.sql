BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

-- for now profile images are photo urls.

CREATE TABLE profiles (
    profile_id SERIAL PRIMARY KEY,
    user_id SERIAL,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    age int CHECK ( age > 17 AND age < 105 ) NOT NULL,
    location varchar(85) NOT NULL,
    sex BOOLEAN NOT NULL,
    biography varchar(500) NOT NULL,
    favorite_food varchar(100) NOT NULL,
    profile_image varchar NOT NULL,
    CONSTRAINT FK_user FOREIGN KEY(user_id) REFERENCES users(user_id)
);

-- profile_id is the id of the principal user while liked_profile_id is the id of the liked profile.
-- Deciphering matches should be easy like this.

CREATE TABLE likes (
    id SERIAL PRIMARY KEY,
    profile_id SERIAL,
    liked_profile_id int NOT NULL,
    CONSTRAINT FK_profile_id FOREIGN KEY(profile_id) REFERENCES profiles(profile_id)
);

CREATE TABLE conversations (
    conversation_id SERIAL PRIMARY KEY,
    profile_id SERIAL,
    receiver_id int NOT NULL,
    CONSTRAINT FK_profile_id FOREIGN KEY(profile_id) REFERENCES profiles(profile_id)
);

CREATE TABLE messages (
    message_id SERIAL PRIMARY KEY,
    conversation_id SERIAL,
    message_content varchar(5000) NOT NULL,
    CONSTRAINT FK_conversation_id FOREIGN KEY(conversation_id) REFERENCES conversations(conversation_id)
);

COMMIT TRANSACTION;
