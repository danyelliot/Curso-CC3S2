const express = require('express')
const app = express()
const port = 8080

app.get('/hola', (req, res) => {
  res.send('Hola Amigos CC-3S2')
})

app.listen(port, () => {
  console.log(`Servicio REST escuchando en el puerto ${port}`)
})
