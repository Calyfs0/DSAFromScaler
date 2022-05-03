select m.movie_title, m.movie_year, CONCAT(d.director_first_name,d.director_last_name) as director_name, CONCAT(a.actor_first_name,a.actor_last_name) as actor_name, mc.role
 from movies m join
movies_directors md
ON md.movie_id = m.movie_id
join directors d
ON d.director_id = md.director_id
join movies_cast mc
ON mc.movie_id = m.movie_id
join actors a 
ON a.actor_id = mc.actor_id
where m.movie_time < 100;