//IMPORT EXTERNAL MODULE
var express = require('express');
//IMPORT MODULE
var {getPosts,getPost, createPost, updatePost, likePost, deletePost } = require('../controllers/posts')

const router = express.Router();

router.get('/', getPosts);
router.post('/', createPost);
router.get('/:id', getPost);
router.patch('/:id', updatePost);
router.delete('/:id', deletePost);
router.patch('/:id/likePost', likePost);


//EXPORT
module.exports = router;