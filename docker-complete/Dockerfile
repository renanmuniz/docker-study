#Na imagem docker abaixo:
FROM node

#Diretorio onde os comandos RUN serao executados:
WORKDIR /app

#Copie todos os arquivos do projeto (".") para a pasta "/app" do container
COPY  . /app

#Comandos RUN sao executados na criacao da imagem
RUN npm install

#Apenas documenta qual porta de comunicacao entre o container e o sistema operacional que o esta executando. Boas práticas manter esse comando.
EXPOSE 80

#Comandos CMD nao sao executados na criacao da imagem, so na criacao do container
CMD ["node", "server.js"]