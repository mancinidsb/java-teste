# 1. Usa uma base leve do Linux com Java 21 instalado
FROM eclipse-temurin:21-jdk-alpine

# 2. Cria uma pasta de trabalho dentro do container
WORKDIR /app

# 3. Copia o arquivo .jar que o Maven gerou para dentro do container
# O asterisco (*) serve para pegar qualquer nome de arquivo jar
COPY target/*.jar app.jar

# 4. Define o comando que vai rodar quando o container iniciar
ENTRYPOINT ["java", "-jar", "app.jar"]