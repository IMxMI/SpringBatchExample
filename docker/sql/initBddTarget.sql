-- New Database Schema (PostgreSQL)
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE utilisateur_new
(
    uuid  UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nom   VARCHAR(255)        NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE ordinateur_new
(
    uuid  UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    label VARCHAR(255) NOT NULL
);

CREATE TABLE ram
(
    uuid            UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    value           INTEGER NOT NULL,
    ordinateur_uuid UUID    NOT NULL,
    FOREIGN KEY (ordinateur_uuid) REFERENCES ordinateur_new (uuid) ON DELETE CASCADE
);

CREATE TABLE achat_new
(
    uuid             UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    utilisateur_uuid UUID NOT NULL,
    ordinateur_uuid  UUID NOT NULL,
    date_achat       DATE NOT NULL,
    FOREIGN KEY (utilisateur_uuid) REFERENCES utilisateur_new (uuid) ON DELETE CASCADE,
    FOREIGN KEY (ordinateur_uuid) REFERENCES ordinateur_new (uuid) ON DELETE CASCADE
);
