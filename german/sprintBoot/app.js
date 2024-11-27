const express = require('express')
const path = require("path");

const app = express();

app.get("/",(req, res)=>{
    //res.send("hello world");
    res.sendFile(path.join(__dirname + "/index.html"));
});

app.listen(5000, ()=>{
    console.log("server listenin on port",5000);
});