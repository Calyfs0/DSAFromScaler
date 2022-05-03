Select CONCAT(d.director_first_name,d.director_last_name) as director_name, m.movie_title from


(Select * from movies_directors where movie_id IN(Select movie_id from movies_cast where role = 'SeanMaguire')) as cte
JOIN movies m
ON cte.movie_id = m.movie_id
JOIN directors d
ON d.director_id = cte.director_id;
