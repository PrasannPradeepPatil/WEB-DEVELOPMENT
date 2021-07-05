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


//REPORTVEBVITALS()
/* #region Main */
/*
reportWebVitals()  --If you want to start measuring performance in your app, pass a function
                    to log results (for example: reportWebVitals(console.log))
                    or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
 */
/* #endregion */
reportWebVitals();
