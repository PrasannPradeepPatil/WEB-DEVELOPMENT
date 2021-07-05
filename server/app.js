//IMPORT EXTERNAL MODULES
var createError = require('http-errors');   
var express = require('express');           //sudo npm install express --save 
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var app = express();

//IMPORTS MODULES
var indexRouter = require('./routes/index');  
var usersRouter = require('./routes/users');
var postsRouter = require('./routes/posts');  


//SET ENV VARIABLES(APPLIED TO ALL ENDPOINTS)
app.set('views', path.join(__dirname, 'views'));  //get them by app.get('varname')
app.set('view engine', 'jade');


//INBUILT MIDDLEWARE FNS(APPLIED ON  ALL ENDPOINTS)
/* #region Main *//*
var express = require('express');           //sudo npm install express --save 
var path = require('path'); 
var logger = require('morgan');

app.use(logger('dev'));         -->For every endpoint,apply logger() fn
app.use(express.json());        -->For every endpoint,apply json() fn


*//* #endregion */




app.use(logger('dev'));
app.use(express.json());                                   //json() fn parses req body(raw body) into json and sets req.body to json ; sends res to next middleware fn called router() 
app.use(express.urlencoded({ extended: false }));         //urlencoded()fnparses req body(encoded) into json and sets req.body to json ; sends res to next middleware fn called router()  
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public'))); //static() fn takes req from url with endpoint foldername ka static file(not foldername); sends the static content of foldername to url



//ROUTES MIDDLEWARE FNS(APPLIED ON GIVEN END POINTS)
 
/* #region Main *//*
var indexRouter = require('./routes/index');  
var usersRouter = require('./routes/users');
app.use('/',indexRouter)                          -->For endpoint /  go to go to routes/indexRouter  and inside indexRouter  / =  /  
app.use('/users', usersRouter);                   -->For endpoint /user  go to go to routes/usersRouter  and inside usersRouter  / =  /user  
*//* #endregion */



app.use('/', indexRouter);                                
app.use('/users', usersRouter);
app.use('/posts',postsRouter)        


//CUSTOM MIDDLEWARE FNS(APPLIED ON  ALL ENDPOINTS) 
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




//EXPORTS
module.exports = app;              
