//IMPORT MODULE
import axios from 'axios';


//CREATE , READ , UPDATE , DELETE 
/*
const url = 'http://localhost:portNoWhereMongoDBIsConnexted/routeWhereCridOperationsTakePlace'
export const createPost = (newPost) => axios.post(url, newPost);
export const getPosts = () => axios.get(url);
export const likePost = (id) => axios.patch(`${url}/${id}/likePost`);
export const updatePost = (id, updatedPost) => axios.patch(`${url}/${id}`, updatedPost);
export const deletePost = (id) => axios.delete(`${url}/${id}`);


*/

const url = 'http://localhost:5000/posts';
export const createPost = (newPost) => axios.post(url, newPost);
export const getPosts   = () => axios.get(url);
export const likePost   = (id) => axios.patch(`${url}/${id}/likePost`);
export const updatePost = (id, updatedPost) => axios.patch(`${url}/${id}`, updatedPost);
export const deletePost = (id) => axios.delete(`${url}/${id}`);


