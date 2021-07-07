//IMPORT EXTERNAL MODULE
var express = require('express');
//IMPORT MODULE
var {getPosts,getPost, createPost, updatePost, likePost, deletePost } = require('../controllers/posts')

const router = express.Router();


//
/*
router.post('/endPoint/:param1/:param2',(req,res)=>{})   -->takes req from url with endponts; performs post ie create operation; sends resonse to url 
router.get('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url ; performs get operation; sends resonse  to url 
router.put('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url; performs put operation; sends resonse to url 
router.delete('/endPoint/:param1/:param2',(req,res)=>{}) -->takes req from url with endponts ; performs delete operation; sends resonse to url 
                                                            req.query                            --> returns {param1:value1,param2:Value2 ;params , values sent by URL query}
                                                            req.body                             --> returns {body sent by url }                   
                                                                                                                                                                                                                
                                                            res.status(errcode).send("Message")  --> send status error code to client
                                                            res.send(object)                     --> send object to client

                                                            next()                                --> send response to next middleware 


*/
router.get('/', getPosts);
router.post('/', createPost);
router.get('/:id', getPost);
router.patch('/:id', updatePost);
router.delete('/:id', deletePost);
router.patch('/:id/likePost', likePost);


//EXPORT
module.exports = router;