<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>

    Considere el siguiente problema:

    Escriba un programa corto mediante 'recursión' para calcular la potencia de un número.

    Propiedades:
	Exponente 1, el resultado es la base.
	Exponente 0, el resultado es 1.
	Exponente 0 con base 0 es infinito.
	Exponente >=2 , el resultado es la Base por N veces el exponente.
	
    Valida:
	Exponentes positivos
	Exponentes negativos
	Base positiva
	Base negativa
    
    El resultado se debe de ser el cálculo de la operación.
    
    
    Se atiente al siguiente ejemplo:
   
    2^1 = 2
    3^1 = 3
    7^0 = 1
    8^0 = 1
    0^0 = Double.MAX_VALUE
    2^3 = 2*2*2
    
    En la carpeta 'src/main/java/es/geekshubs/academy/Potencial.java' se encuentra el fichero con 
    la definición de nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/PotencialTest.java' se encuentra el 
    fichero con la suite de test.

    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.096 sec - in es.geekshubs.academy.PotencialTest

    Results :
    
    Tests run: 17, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  6.603 s
    [INFO] Finished at: 2021-05-14T09:32:29+02:00
    [INFO] ------------------------------------------------------------------------
    
    Process finished with exit code 0
    
    ## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)


