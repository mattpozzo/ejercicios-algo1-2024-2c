## Mapa
Estructura (diccionario) que almacena pares clave-valor y no permite claves duplicadas. **Dos abstracciones:**  
1. Un mapa sin claves (mapa vacío)  
2. Un mapa con algún par clave-valor (puede ser infinito)  

*¿Qué tipo de dato conocemos que puede soportar esta estructura?*  
-> En java tenemos los registros (estático) y los maps (dinámico)

*Algunas operaciones de los mapas*
- **agregar**(K clave, V valor): void
Asocia una clave con un valor en el mapa.
- **obtener**(K clave): V
Obtiene el valor asociado con la clave especificada.
- **contieneClave**(K clave): boolean
Verifica si el mapa contiene una clave específica.
- **contieneValor**(V valor): boolean
Verifica si el mapa contiene un valor específico.
- **largo**(): Integer
Devuelve el número de pares clave-valor en el mapa.
- **remover**(K clave): V
Elimina la entrada asociada con la clave especificada.