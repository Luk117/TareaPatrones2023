# TareaPatrones2023


# State

El problema que intentamos solucionar era un cambio de estados en la inscripcion de la matricula de un estudiante en una academia. Ya que un estudiante inicialmente se matricula, luego su matricula es procesada (en esta se validan los datos del estudiante) para finalmente encontrarse en un estado de inscrito donde se le confirma al estudiante que ya esta inscrito en el curso y no es necesario retornar los datos de matricula ya que estos fueron enviados a la siguiente etapa.

Para esto se creo una interfaz con los metodos avanzar, retornar y consultar. Luego se creo una clase para cada estado la cual implementa la interfaz y sobreescribe el metodo. En el metodo de avanzar se daba la instruccion de cambiar el estado del estudiante a la siguiente etapa

Matricula ---> Procesando -----> Inscrito.

Esto siendo util en caso de querer agregar mas estados sin la necesidad de modificar en gran medida el codigo y permitir que este sea mas comprensible.
