SELECT
	doctors.name,
	ROUND(SUM((attendances.hours * 150)+((attendances.hours * 15)*work_shifts.bonus)*.1), 1) AS salary
FROM doctors, attendances, work_shifts
WHERE
	doctors.id=attendances.id_doctor
    AND work_shifts.id=attendances.id_work_shift
GROUP BY doctors.name
ORDER BY salary DESC;