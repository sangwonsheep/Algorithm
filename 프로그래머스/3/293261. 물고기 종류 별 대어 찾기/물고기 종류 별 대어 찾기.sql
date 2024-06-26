-- FISH_INFO 잡은 물고기 정보, FISH_NAME_INFO 물고기의 이름에 대한 정보
SELECT I.ID AS ID, N.FISH_NAME AS FISH_NAME, I.LENGTH AS LENGTH
FROM FISH_INFO I, FISH_NAME_INFO N
WHERE I.FISH_TYPE=N.FISH_TYPE AND (I.FISH_TYPE, I.LENGTH) IN (SELECT FISH_TYPE, MAX(LENGTH)
                                             FROM FISH_INFO
                                             GROUP BY FISH_TYPE)
ORDER BY I.ID
