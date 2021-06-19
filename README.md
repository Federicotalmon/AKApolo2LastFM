#### AKApolo2LastFM

# LastFM.

## Descripción.
Dicha librería provee información de un artista o una banda musical desde la fuente LastFM, la cual es una breve descripción de la misma.

## Métodos asociados.
**getArtist(name: String) : InfoCard**

La librería consta de un único método denominado getArtist, que recibe como parámetro el nombre del artista o banda musical. Dicho método retorna un objeto de tipo InfoCard, el cual posee los siguientes atributos : <br>
- Descripción.<br>
- Link de la descripción.<br>
- Fuente de la información.<br>
- Link a logo.<br>
- Condición de almacenamiento.<br>

## Excepciones.

En caso de no encontrarse la descripción del artista o banda solicitada se retornara un objeto **EmptyCard**, cuyos atributos son los mismo que de **InfoCard**, pero de la siguiente manera : 
<br>
- Descripción. vacia<br>
- Link de la descripción nula.<br>
- Fuente de la información nula.<br>
- Link a logo.<br>
- Condición de almacenamiento.<br>

Se mostrara un mensaje de "No Results".
