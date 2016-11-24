SELECT DISTINCT ON (company)
  table1.company,
  table1.customer,
  table1.profit
FROM (
       SELECT
         projects.id,
         projects.name,
         customers.name AS customer,
         companies.name AS company,
         projects.cost  AS profit
       FROM projects
         JOIN customers ON projects.customer_id = customers.id
         JOIN companies ON projects.company_id = companies.id
       ORDER BY profit ASC
     ) AS table1
ORDER BY company;
