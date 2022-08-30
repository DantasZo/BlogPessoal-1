import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Navbar from './components/static/navbar/Navbar';
import Footer from './components/static/footer/Footer';

import Login from './paginas/Login/Login';
import Home from './paginas/Home/Home';

import './App.css';

function App() {
  return (
    <Router>
      <Navbar />

      <Routes>
        <Route path="/home" element={ <Home /> } />
        <Route path="/" element={ <Login /> } />
        <Route path="/login" element={ <Login /> } />
      </Routes>

      <Footer />
    </Router>
  );
}

export default App;
