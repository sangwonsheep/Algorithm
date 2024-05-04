-- 코드를 입력하세요
SELECT book_id, AUTHOR_NAME, date_format(published_date, '%Y-%m-%d') as date
from book b, author a
where category = '경제' and b.author_id=a.author_id 
order by published_date