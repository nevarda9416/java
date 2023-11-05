use java_web_33;
SELECT * FROM products p INNER JOIN colors c ON p.id = c.product_id;
SELECT p.id, p.name, c.type FROM products p LEFT JOIN colors c ON p.id = c.product_id WHERE p.id = 2;
# Dua ra cau lenh theo made_in co bao nhieu san pham
SELECT p.made_in, COUNT(id) AS amount FROM products p GROUP BY p.made_in ORDER BY amount DESC;
SELECT p.id, p.name, p.made_in, c.type FROM products p LEFT JOIN colors c ON p.id = c.product_id WHERE c.type = 'do';
SELECT p.name, COUNT(c.type) AS amount_type FROM products p INNER JOIN colors c ON p.id = c.product_id GROUP BY p.name ORDER BY amount_type ASC;