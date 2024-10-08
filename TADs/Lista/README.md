## Lista
Colección lineal ordenada que permite elementos duplicados, a los cuales se puede acceder por su posición (índice). **Dos abstracciones:**
1. Una lista sin elementos (lista vacía)  
2. Una lista con algún elemento (puede ser infinita)  

*¿Qué tipo de dato conocemos que puede soportar esta estructura?*  
-> En java tenemos los arreglos (estático) y las List (dinámico)

*Algunas operaciones de las listas*
- **agregar**(T elemento): void
Agrega un elemento al final de la lista.
- **obtener**(int índice): T
Obtiene el elemento en el índice especificado.
- **largo**(): Integer
Devuelve el número de elementos en la lista.
- **remover**(int índice): T
Elimina el elemento en el índice especificado.
- **contiene**(T objeto): boolean
Verifica si la lista contiene un objeto específico.
- **vaciar**(): void
Elimina todos los elementos de la lista.