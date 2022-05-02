Select movie_title from movies where movie_id IN (Select mc.movie_id from
(Select COUNT(movie_id) as cnt, actor_id from movies_cast group by actor_id) as c
JOIN movies_cast mc
ON mc.actor_id = c.actor_id
WHERE c.cnt > 1);