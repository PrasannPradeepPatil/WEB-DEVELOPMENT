//MODULE IMPORTS
var createError = require('http-errors');   
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var app = express();

//FILE  IMPORTS 
var indexRouter = require('./routes/index');  
var usersRouter = require('./routes/users');
var postsRouter = require('./routes/posts');  


//SET ENV VARIABLES(APPLIED TO ALL ENDPOINTS)
app.set('views', path.join(__dirname, 'views'));  //get them by app.get('varname')
app.set('view engine', 'jade');


//INBUILT MIDDLEWARE FNS(APPLIED ON  ALL ENDPOINTS)
app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));



//ROUTES MIDDLEWARE FNS(APPLIED ON GIVEN END POINTS)
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
