## Cola
Elementos o nodos encadenados linealmente con una estructura FIFO. **Dos abstracciones:**  
1. Una cola sin elementos (cola vacía)  
2. Una cola con algún elemento (puede ser infinita)  

*¿Qué tipo de dato conocemos que puede soportar esta estrucutra?*  
-> En java tenemos los arreglos (estático) y las List (dinámico)

*Algunas operaciones de las colas*
- **encolar**(T: member): void
Agrega un elemento a la cola.
- **desencolar**(): T
Remueve y devuelve el elemento en el frente de la cola.
- **asomar**(): T
Devuelve el elemento en el frente de la cola sin eliminarlo.
- **largo**(): Integer
Devuelve el número de elementos en la cola.
- **esVacia**(): boolean
Verifica si la cola está vacía.
- **vaciar**(): void
Elimina todos los elementos de la cola.