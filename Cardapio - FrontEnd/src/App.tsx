import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { FoodData } from './Interface/FoodData';
import { Card } from './components/cards/card';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();

  return (
    <div className="container">
      <h1>Cardárpio</h1>
      <div className="card-grid">
        {data?.map(foodData => 
        <Card 
        price={foodData.price} 
        title={foodData.title} 
        image={foodData.image}
        />
      )}
    </div>
  </div>
  )
}

export default App
