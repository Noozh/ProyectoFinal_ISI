package urjc.isi.dao.interfaces;


import java.util.List;

import urjc.isi.entidades.Peliculas;

//Con esta interfaz obligamos a que se implmenten
//ciertos métodos exclusivos de Peliculas

public interface PeliculasDAO extends GenericDAO<Peliculas>{

	/**
	 * Obtiene todas las peliculas en las que ha trabajado un actor
	 * @param Nombre del actor por el que se desea buscar
	 * @return
	 */
	public List<Peliculas> selectAllWhereActor(String name);
  //Seleccionar peliculas del genero ...

	public List<Peliculas> selectAllWhereDirector(String name);

	public List<Peliculas> selectAllWhereGuionista(String name);
	
	//Ranking
	public List<Peliculas> selectBest10();
		
	public List<Peliculas> selectRankingByActor(String name);
	public List<Peliculas> selectRankingByDirector(String name);
	public List<Peliculas> selectRankingByGuionista(String name);
	public List<Peliculas> selectRankingByGenero(String name);

	public List<Peliculas> selectPeliculasForAdultos();
}
