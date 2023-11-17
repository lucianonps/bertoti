import carroFetch from "../axios/config"
import { useState, useEffect } from "react"
import { Link } from "react-router-dom"

import './Home.css'

const Home = () => {
  const [carros, setCarros] = useState([])

  const getCarros = async() => {
    try {    
      const response = await carroFetch.get("/Carros");
      const data = response.data;

      setCarros(data)

    } catch (error) {
      console.log(error);
    }
  }

  useEffect(() => {
    getCarros();
  }, [])

  return (
    <div className="movie">
      <h1>Teste</h1>
      {carros.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        carros.map((carro) => (
          <div className="carro" key={carro.id}>
            <Link to={`/Carro/${carro.id}`}> 
            <h2>{carro.marca}</h2>
            </Link>
          </div>
        ))
      )}
    </div>
  )
}

export default Home