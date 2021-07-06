//IMPORT EXTERNAL MODULES
var express = require('express');            //sudo npm install express  --save(while project creation)
var mongoose = require('mongoose')           //sudo npm install mongoose --save(while creating project) 
var cors = require('cors');                  //sudo npm install cors     --save(while creating project)  
var cookieParser = require('cookie-parser'); //sudo npm install (while project creation)
var logger = require('morgan');              //sudo npm install (while project creation)
var debug = require('debug');                //sudo npm install (while project creation)
var createError = require('http-errors');    //sudo npm install (while project creation)
var jade = require('jade');                  //sudo npm install (while project creation)
var path = require('path');                  //sudo npm install (while project creation)





var app = express();

//IMPORTS MODULES
var indexRouter = require('./routes/index');  
var usersRouter = require('./routes/users');
var postsRouter = require('./routes/posts');  


//SET ENV VARIABLES(APPLIED TO ALL ENDPOINTS)
/* #region Main */
/*
//SETTING ENV VAR
export/set envVarName=3000  //linux/windows


//GETTING ENV VAR 
process.env.NODE_ENV  -->returns value set for envVarName ; if not set return undefined
OR
const express = require('express')-->npm install express --save   
const app = express()  
app.get('env')        -->returns value set for envVarName ; if not set return undefined
*/
/* #endregion */
app.set('views', path.join(__dirname, 'views'));  //get them by app.get('varname')
app.set('view engine', 'jade');


//INBUILT MIDDLEWARE FNS(APPLIED ON  ALL ENDPOINTS)
/* #region Main */
/*
var express = require('express');           //sudo npm install express --save 
var path = require('path'); 
var logger = require('morgan');

app.use(logger('dev'));         -->For every endpoint,apply logger() fn
app.use(express.json());        -->For every endpoint,apply json() fn
*/
/* #endregion */
app.use(express.json({limit:"30mb",extended:true}));         //express.json()     fn parses req body(raw body) into json populates req.body with json ;returns a middleware fn  ; limit sets the limit of req body ;extended allows to choose between parsing req body with the querystring library (when false) or the qs library (when true). 
app.use(express.urlencoded({limit:"30mb",extended: true }));//express.urlencoded()fn parses req body(encoded)  into json populates req.body with json ;returns a middleware fn  ; limit sets the limit of req body ;extended allows to choose between parsing req body with the querystring library (when false) or the qs library (when true). 
app.use(express.static(path.join(__dirname, 'public')));   //express.static()     fn serves static file in public folder
app.use(cookieParser());                                   //cookieParser()      fn parse cookie header populate req.cookies with an object keyed by the cookie names.
app.use(logger('dev'));
app.use(cors());


//ROUTES MIDDLEWARE FNS(APPLIED ON GIVEN END POINTS)
/* #region Main */
/*

var indexRouter = require('./routes/index');  
var usersRouter = require('./routes/users');
app.use('/',indexRouter)                          -->For endpoint /    ;apply the functions inside routes/indexRouter  and inside indexRouter  / =  /  
app.use('/users', usersRouter);                   -->For endpoint /user;apply the functions inside routes/usersRouter  and inside usersRouter  / =  /user  
*/
/* #endregion */
app.use('/', indexRouter);                                
app.use('/users', usersRouter);
app.use('/posts',postsRouter)        


//CUSTOM MIDDLEWARE FNS(APPLIED ON  ALL ENDPOINTS) 
/* #region Main */
/*
app.use(function(req, res, next) {      -->For all endpoints; apply the function
  next(createError(404));                 req.query                            --> returns {param1:value1,param2:Value2 ;params , values sent by URL query}
                                          req.body                             --> returns {body sent by url }                   
                                                                                                                                                                                               
                                          res.status(errcode).send("Message")  --> send status error code to client
                                          res.send(object)                     --> send object to client

                                          next()                                --> send response to next middleware 
});

*/
/* #endregion */
app.use(function(req, res, next) {       // catch 404 and forward to error handler
  next(createError(404));
});
app.use(function(err, req, res, next) {  // error handler
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

//MONGODB
/*

*/
const CONNECTION_URL = 'mongodb+srv://js_mastery:123123123@practice.jto9p.mongodb.net/test';
const PORT = process.env.PORT|| 5000;
mongoose.connect(CONNECTION_URL, { useNewUrlParser: true, useUnifiedTopology: true })
.then(() => app.listen(PORT, () => console.log(`Server Running on Port: http://localhost:${PORT}`)))
.catch((error) => console.log(`${error} did not connect`));

mongoose.set('useFindAndModify', false);

//EXPORTS
module.exports = app;              
