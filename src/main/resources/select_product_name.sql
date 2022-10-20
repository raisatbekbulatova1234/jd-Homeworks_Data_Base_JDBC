select product_name from orders
join customers c on c.id = orders.customer_id
where lower(:name) = lower(c.name);