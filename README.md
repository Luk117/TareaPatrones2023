# TareaPatrones2023


# State

El primer problema que intentamos solucionar era un cambio de estados en la inscripción de la matrícula de un estudiante en una academia. Ya que un estudiante inicialmente se matricula, luego su matrícula es procesada (en esta se validan los datos del estudiante), para finalmente encontrarse en un estado de inscrito, donde se le confirma al estudiante que ya está inscrito en el curso y no es necesario retornar los datos de matrícula porque estos fueron enviados a la siguiente etapa.

Para esto, se creó una interfaz con los métodos avanzar, retornar y consultar. Luego se creó una clase para cada estado, la cual implementa la interfaz y sobreescribe el método. En el método de avanzar se daba la instrucción de cambiar el estado del estudiante a la siguiente etapa.

Matricula ---> Procesando -----> Inscrito.

Esto siendo útil en caso de querer agregar más estados, sin la necesidad de modificar en gran medida el código, permitiendo que este sea más comprensible y aplicando el concepto de patrón de diseño de comportamiento state.

# Builder 

El segundo problema que se buscó resolver es sobre la interacción de las diferentes personas que hacen parte en una academia, como lo es un profesor, un administrativo y un estudiante. Gracias a que cada uno de ellos contiene diferentes atributos y por ende una información distinta dependiendo de su rol en la academia. Para la solución de este, se implementó el patrón de diseño creacional Builder, por medio de este pudimos permitir la obtención de información según rol y negar el acceso a la información específica de un rol al que no pertenecen. 

Se puede observar en la carpeta Builder en las clases Usuario y Main.

# Proxy

El tercer problema que deseamos resolver es que las imágenes subidas al servidor por parte de los estudiantes sobre el comprobante de pago, tenga los mismos formatos, haciendo referencia a png o jpg, se decidió utilizar el patrón de diseño estructural de Proxy, gracias a que de esta forma se permitirá aceptar o no las imágenes esperadas.

Hay un servidor (la interfaz) en donde se tiene un método subirImagen(), mientras que en la clase ServicioImagen se hace la validación de la imagen por medio del tipo de archivo que sea, por ejemplo, si es jpg o png la imagen se podrá cargar, pero si no es de este formato aperecerá un mensaje que indique al estudiante que debe subir la imagen con el formato correcto. 

Por otro lado, en el Main se hace el ejercicio de subir tres imágenes, cada una con un formato diferente, sabiendo que la tercera imagen no tiene el formato correcto, el servidor no le va a permitir subir la imagen.


