//IMPORT EXTERNAL MODULES
var express = require('express');
var router = express.Router();

//ROUTES MIDDLEWARE FNS(routerLIED ON GIVEN END POINTS)
/* #region Main */
/*
router.fnName('/endPoint/:param1/:param2',(req,res,next)=>{}) -->For fiven endpoint ,apply fnNmae() 
                                          req.param                            --> returns {param1:value1,param2:Value1 params described after endpoint , values sent by URL params}
                                          req.query                            --> returns {param1:value1,param2:Value2 ;params , values sent by URL query}
                                          req.body                             --> returns {body sent by url }                   
                                                                                                                                                                                               
                                          res.status(errcode).send("Message")  --> send status error code to client
                                          res.send(object)                     --> send object to client

                                          next()                                --> send response to next middleware 


router.get('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url ; performs get operation; sends resonse  to url 
router.put('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url; performs put operation; sends resonse to url 
router.post('/endPoint/:param1/:param2',(req,res)=>{})   -->takes req from url with endponts; performs post operation; sends resonse to url 
router.delete('/endPoint/:param1/:param2',(req,res)=>{}) -->takes req from url with endponts ; performs delete operation; sends resonse to url 
                                                        


//GET
http:127.0.0.3000/course/1 

courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
router.get('/courses/:id', (req, res) =>{        
    //LOOKUP FOR COURSE WITH ID
    //IF NOT EXIST RETURN 404
    const course = courses.find((course) => {course.id === parseInt(req.params.id)})
    if(!course)                                     //ERROR HANDLING(USE JOI INSTEAD) 
        res.status(404).send('object not found')   
        return 
    }         

    //RETURN COURSE WITH ID
    res.send(course)
  })
router.listen(3000,()=>{console.log("Listenong on port 3000")})


//PUT
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
router.put('/courses/:id' (req,res) => {    
      //LOOKUP FOR COURSE WITH ID
     //IF NOT EXIST RETURN 404
     const course = courses.find((course) => {course.id === parseInt(req.params.id)})
     if(!course) {                                    //ERROR HANDLING(USE JOI INSTEAD) 
        res.status(404).send('object not found')   
        return;
     }   

    //VALIDATE BODY
    //IF INVALID RETURN 400
    if(!req.body.name || req.body.name.length < 3){  ////ERROR HANDLING(USE JOI INSTEAD)
       res.status(400).send('Bad request')
    return 
    }



    //UPDATE COURSE WITH ID BY BODY 
    //RETURN  COURSE
    course.name = req.body.name
    res.send(course)                  
})

//POST
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
router.get('/courses' (req,res) => {    
    if(!req.name ){                          //ERROR HANDLING(USE JOI INSTEAD)                       
        res.status(400).send('Bad request')
        return 
    }

     //ADD COURSE WITH ID AND  BODY 
    //RETURN  COURSE
    const course = {
        id:course.length + 1,
        name:req.body.name                     //add the line router.use(express.json())
    }

    courses.push(course)
    res.send(course) //updated object must be sent back in body of response

                                      
})


//DELETE
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
router.put('/courses/:id' (req,res) => {    
     //LOOKUP FOR COURSE  with id 
     //IF NOT EXIST RETURN 404
     const course = courses.find((course) => {course.id === parseInt(req.params.id)})
     if(!course) {                                    //ERROR HANDLING(USE JOI INSTEAD) --inspect --> networks -->select all --> refresh with cntrl + R 
        res.status(404).send('object not found')   
        return;
     }   




    //DELETE COURSE WITH IF 
    //RETURN  COURSE
    const index = courses.indexOf(course);
    courses.splice(index,1)
    res.send(course)

                                      
})


//ERROR HANDLING WITH JOI
if(!req.body.name || req.body.name.length < 3){
       res.status(400).send('Bad request')
    return 
}

const Joi = require('JOI') -- returns class Joi  npm install joi --save
const schema = {
    name: Joi.String().                      -- joi provides a "FLUENT API"
}
const res = Joi.validate(res.body,schema)         -- returns {error:some error , value:some value}  if value is correct error will be null and vice versa
if(res.error){
    res.status(400).send(res.error.details[0].message)
    return ;
}                                          

*/
/* #endregion */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });

  
});


//EXPORT
module.exports = router;
