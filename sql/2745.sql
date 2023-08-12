SELECT people.name, ROUND((people.salary * 0.10), 2) as tax 
FROM people
WHERE people.salary > 3000;