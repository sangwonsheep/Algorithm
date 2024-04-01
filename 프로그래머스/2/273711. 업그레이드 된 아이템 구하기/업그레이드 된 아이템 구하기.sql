-- 코드를 작성해주세요
select i_end.item_id, i_end.item_name, i_end.rarity
from item_info i_start, item_info i_end, item_tree t
where i_start.rarity = 'RARE' and i_start.item_id=t.parent_item_id and t.item_id=i_end.item_id
order by i_end.item_id desc

