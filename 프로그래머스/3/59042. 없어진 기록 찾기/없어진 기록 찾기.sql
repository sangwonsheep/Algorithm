-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o LEFT OUTER JOIN ANIMAL_INS i
ON i.ANIMAL_ID = o.ANIMAL_ID 
WHERE i.ANIMAL_ID is null