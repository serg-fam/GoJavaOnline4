SELECT
  projects.name,
  sum(developers.salary) AS salary_sum
FROM projects_developers
  JOIN projects ON projects_developers.project_id = projects.id
  JOIN developers ON projects_developers.developer_id = developers.id
GROUP BY projects.name
ORDER BY salary_sum DESC
LIMIT 1;