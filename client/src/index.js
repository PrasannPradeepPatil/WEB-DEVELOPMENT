//IMPORT EXTERNAL MODULES
import React from 'react';
import ReactDOM from 'react-dom';

//IMPORT MODULE
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//RENDER()
/* #region Main */
/*
ReactDOM.render(                  -->Render App Component ka REACT ELEMENT(Virtual DOM)
  <React.StrictMode>                   inside public/index.html ka root element(Actual DOM)
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);


 */
/* #endregion */
ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

