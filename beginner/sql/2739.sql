SELECT name, CAST(extract(day from payday) as INTEGER) as day FROM loan;
