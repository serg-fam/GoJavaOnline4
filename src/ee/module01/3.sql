SELECT sum(developers.salary)
FROM developers_skills
  JOIN developers ON developers_skills.developer_id = developers.id
WHERE developers_skills.skill_id = (SELECT skills.id
                                    FROM skills
                                    WHERE skill = 'java');