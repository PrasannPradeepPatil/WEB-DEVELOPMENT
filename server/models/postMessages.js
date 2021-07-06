//IMPORT EXTERNAL MODULES
var express = require('express');
var mongoose = require('mongoose');


//SCHEMA
const postSchema = mongoose.Schema({
    title: String,
    message: String,
    creator: String,
    tags: [String],
    selectedFile: String,
    likeCount: {
        type: Number,
        default: 0,
    },
    createdAt: {
        type: Date,
        default: new Date(),
    },
})
//MODEL
var PostMessage = mongoose.model('PostMessage', postSchema);

//EXPORT
module.exports = PostMessage;
