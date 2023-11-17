import cinemaFetch from "../axios/config";
import { useState, useEffect } from "react";

import './Delete.css'


const Delete = () => {
    const [carro, setcarro] = useState([]);
    const getCarro = async () => {
        try {
            const response = await cinemaFetch.get(`/Carros`);
            const data = response.data;
            setcarro(data);
        } catch (error) {
            console.log(error);
        }
    };
    const deleteCarro = async (id) => {
        if (window.confirm('vai excluir esse Carro ?')) {
        try {
            await cinemaFetch.delete(`/Carros/${id}`);
            const filteredMovies = carro.filter((movie) => movie.id !== id);
            setcarro(filteredMovies);
        } catch (error) {
            console.log(error);
        }
        }
    };
    
    useEffect(() => {
        getCarro();
    }, []);

  return (
    <div className="admin">
      <h1>Carros</h1>
      {carro.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        carro.map((carros) => (
          <div className="linha" key={carros.id}>
            <h2>{carros.modelo}</h2>
            <div className="actions">

              <button
                className="bot delete-bott"
                onClick={() => deleteCarro(carros.id)}
              >
                Excluir
              </button>
            </div>
          </div>
        ))
      )}
    </div>
  )
}

export default Delete