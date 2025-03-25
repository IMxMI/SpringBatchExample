-- Old Database Schema (MySQL)
CREATE TABLE ordinateur
(
    id    INTEGER PRIMARY KEY AUTO_INCREMENT,
    label VARCHAR(255) NOT NULL,
    ram1  INTEGER      NULL,
    ram2  INTEGER      NULL,
    ram3  INTEGER      NULL,
    ram4  INTEGER      NULL
);

CREATE TABLE utilisateur
(
    id    INTEGER PRIMARY KEY AUTO_INCREMENT,
    nom   VARCHAR(255)        NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE achat
(
    id             INTEGER PRIMARY KEY AUTO_INCREMENT,
    utilisateur_id INTEGER NOT NULL,
    ordinateur_id  INTEGER NOT NULL,
    date_achat     DATE    NOT NULL,
    FOREIGN KEY (utilisateur_id) REFERENCES utilisateur (id) ON DELETE CASCADE,
    FOREIGN KEY (ordinateur_id) REFERENCES ordinateur (id) ON DELETE CASCADE
);

-- Insert sample data
INSERT INTO ordinateur (label, ram1, ram2, ram3, ram4)
VALUES ('PC Gamer', 16, 16, NULL, NULL),
       ('Workstation', 32, NULL, NULL, NULL),
       ('Old Laptop', 8, 4, NULL, NULL),
       ('Server', 64, 64, 64, 64);

INSERT INTO utilisateur (nom, email)
VALUES ('Alice Dupont', 'alice.dupont@example.com'),
       ('Bob Martin', 'bob.martin@example.com'),
       ('Charlie Dubois', 'charlie.dubois@example.com');

INSERT INTO achat (utilisateur_id, ordinateur_id, date_achat)
VALUES (1, 1, '2023-05-10'),
       (2, 2, '2023-06-15'),
       (3, 3, '2023-07-20');