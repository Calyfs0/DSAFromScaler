Select movie_name from movies where movie_id IN 

(Select m.movie_id from (Select SUM(times_played) as tp, movie_id, AVG(rating) as r from statistics group by movie_id) as t
JOIN movies m
ON m.movie_id = t.movie_id
Where t.tp > 1000 and t.r > 3)

and release_year < 2000;
