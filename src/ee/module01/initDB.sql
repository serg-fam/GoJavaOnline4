CREATE TABLE developers (
  id         INT PRIMARY KEY NOT NULL,
  first_name TEXT            NOT NULL,
  last_name  TEXT,
  age        INT
);

CREATE TABLE skills (
  id    INT PRIMARY KEY NOT NULL,
  skill TEXT            NOT NULL
);
CREATE TABLE companies (
  id   INT PRIMARY KEY NOT NULL,
  name TEXT
);
CREATE TABLE customers (
  id   INT PRIMARY KEY NOT NULL,
  name TEXT
);
CREATE TABLE projects (
  id          INT PRIMARY KEY NOT NULL,
  name        TEXT,
  customer_id INT REFERENCES customers (id),
  company_id  INT REFERENCES companies (id)
);
CREATE TABLE developers_skills (
  id           INT PRIMARY KEY NOT NULL,
  developer_id INT REFERENCES developers (id),
  skill_id     INT REFERENCES skills (id)
);
CREATE TABLE projects_developers (
  id           INT PRIMARY KEY NOT NULL,
  project_id   INT REFERENCES projects (id),
  developer_id INT REFERENCES developers (id)
);