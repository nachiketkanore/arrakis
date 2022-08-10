import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import Books from "./components/Books"
import Trades from './components/Trades';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Securities from './components/Securities';

function App() {
  return (
    <div className="App">
    {/* <Router> */}
    <Navbar></Navbar>
    <Securities/>
    {/* <Switch > */}

    {/* <Route path="/Trades"> */}
    {/* <Trades/> */}
    {/* </Route> */}

    {/* <Route path="/"> */}
    {/* <Books/> */}
    {/* <Books/>
    <Books/>
    <Books/> */}


    {/* </Route>

    </Switch>

    </Router> */}
  
   
    </div>
  );
}

export default App;
