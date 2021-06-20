var express = require('express');
var router = express.Router();
var mongoose = require('mongoose');
const { response } = require('../app');

router.get('/',function(req, res, next) {
    // const CONNECTION_URL = 'mongodb+srv://127.0.0.1:27107/memories/memories';
    // mongoose.connect(CONNECTION_URL, { useNewUrlParser: true, useUnifiedTopology: true }  )
    // .then(()=>{res.send("Connected to mongoDb")})
    // .catch(()=>{res.send("Did not connect to mongodb")})



    const CONNECTION_URL = 'mongodb+srv://127.0.0.1:27107/memories';
    //const CONNECTION_URL  = 'mongodb://localhost:27017/memories'
    mongoose.connect(CONNECTION_URL, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => {
        app.listen(PORT, () => console.log(`Server Running on Port: http://localhost:${PORT}`))
        res.send("Connected to mongoDb")
    
    })
    .catch((error) => {
        res.send("Did not connect to mongodb");
        console.log(`${error} did not connect`);
        }
        );
  
     mongoose.set('useFindAndModify', false);

    
  });
  
module.exports = router;