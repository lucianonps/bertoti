import { Link } from "react-router-dom"
import './navebar.css'
export const Navebar = () => {
  return (
    <nav className='navebar'>
        <h2>
            <Link to={'/'}>CONCESSIONÁRIA</Link>
        </h2>
        <ul>
            <li>
                <Link to={'/'}>Home</Link>
            </li>
            <li>
                <Link to={'/new'} className="new-btn">Novo Post</Link>
            </li>
            <li>
                <Link to={'/delete'} className="new-btn">Delete</Link>
            </li>
        </ul>
    </nav>
  )
}
