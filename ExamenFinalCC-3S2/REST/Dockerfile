# Utilizamos una imagen base de Node.js
FROM node:12-alpine

# Establecemos el directorio de trabajo en /app
WORKDIR /app

# Copiamos los archivos necesarios para la aplicación
COPY package*.json ./

# Instalamos las dependencias
RUN npm install

# Copiamos el resto de los archivos de la aplicación
COPY . .

# Exponemos el puerto 8080
EXPOSE 8080

# Iniciamos la aplicación
CMD ["npm", "start"]

