import { Outlet } from 'react-router-dom'
import './App.css'
import {Navebar} from './components/Navebar.jsx'
function App() {

  return (
    <div className='App'>
      < Navebar/>
        <div className='container'>
            <Outlet/>
         </div>
    </div>
  )
}

export default App;
