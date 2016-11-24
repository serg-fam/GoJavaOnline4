SELECT *
FROM (SELECT
        projects.name          AS project_name,
        projects.cost          AS project_cost,
        avg(developers.salary) AS av_salary
      FROM projects
        JOIN projects_developers ON projects_developers.project_id = projects.id
        JOIN developers ON developers.id = projects_developers.developer_id
      GROUP BY projects.name, projects.cost) AS my_table
WHERE project_cost = (SELECT min(project_cost)
                      FROM (SELECT
                              projects.name          AS project_name,
                              projects.cost          AS project_cost,
                              avg(developers.salary) AS av_salary
                            FROM projects
                              JOIN projects_developers ON projects_developers.project_id = projects.id
                              JOIN developers ON developers.id = projects_developers.developer_id
                            GROUP BY projects.name, projects.cost) AS my_table1);