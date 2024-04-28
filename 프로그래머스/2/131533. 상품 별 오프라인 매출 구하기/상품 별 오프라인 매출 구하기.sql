-- 코드를 입력하세요
SELECT PRODUCT_CODE, sum(price * sales_amount) 
from product p, offline_sale s
where p.product_id=s.product_id
group by product_code
order by sum(price * sales_amount) desc, product_code