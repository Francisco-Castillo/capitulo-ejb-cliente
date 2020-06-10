# Cliente Standalone de EJB Remoto
Aplicacion que se conecta con un session bean mediante su interface remote

## Clonar proyecto

Ejecutar una terminal y clonar el repositorio

```
git clone https://github.com/Francisco-Castillo/capitulo-ejb-cliente/
```
## Añadir libreria gf-client.jar

La libreria **gf-client.jar** viene incluida en los modulos de los servidores GlassFish y Payara, el cual debe ser copiado detro de las liberias del proyecto.
Para ello se debe hacer clic con el boton secundario sobre el directorio ```Libraries``` y del menu que se despliega seleccionar ```Add JAR/Folder...```
y navegar hasta el directorio ```/ruta/instalacion/payara/glassfish/modules/gf-client.jar```, al momento de añadirla seleccionar **Absolute Path**

## Añadir Capitulo03-ejb.jar

Añadir en las librerias del proyecto el archivo ```.jar``` que se encuentra dentro de la carpeta /dist del modulo EJB

## Limpiar y construir el proyecto

Luego de limpiar y construir se debe ejecutar la clase principal ```App.java```

## Nota
Para que este cliente pueda acceder al EJB Remoto, es necesario que la aplicacion empresarial Capitulo03 este desplegada en el servidor
