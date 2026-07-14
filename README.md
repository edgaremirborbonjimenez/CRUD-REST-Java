# CRUD-REST-Java
El un CRUD simulado con Rest utilizando  Java Spring

📐 Usar la tabla de complejidad de EIs
Según la tabla de IFPUG para EIs:
| FTRs | DETs | Complejidad |
| ---- | ---- | ----------- |
| 1    | 1–15  | Baja (3)    |
| ≥2   | 5–15 | Media (4)   |
| ≥2   | >15  | Alta (6)    |


📐 Tabla de complejidad para EQ:
| FTRs | DETs | Complejidad |
| ---- | ---- | ----------- |
| 1    | 1–5  | Baja (3)    |
| 1    | 6–19 | Media (4)   |
| ≥2   | 6–19 | Media (4)   |

-------------------------------------------------
Formula General para obtener los Adjusted Function Points (AFP):

AFP = UFP X VAF

UFP = Unadjusted Function Points
VAF = Value Adjustment Factor

-------------------------------------------------

El VAF se calcula de 3 formas:

1.- No tomandolo en cuenta.

2.- Ingresar el valor de ajuste manualmente si es que sabes cual es.

3.- Consiguiendo el TDI (Total Degree of Influence) con la  de las 15 caracteristicas del sistema (GSC), la cual se le puede poner a 
cada una una puntuacion del 0 al 5

Las 14 Características (GSC):

    1.- Comunicación de datos: ¿Cuántos componentes de comunicación (protocolos, redes) requiere? (Tu API Rest tiene esto alto, probablemente un 4 o 5).

    2.- Procesamiento distribuido: ¿Los datos o el proceso están en varios servidores?

    3.- Rendimiento (Performance): ¿El tiempo de respuesta es crítico? (Ej. sistema en tiempo real).

    4.- Configuración del equipamiento: ¿Se debe ejecutar en hardware muy específico o limitado?

    5.- Tasa de transacciones: ¿Es un sistema con alto volumen de peticiones por segundo?

    6.- Entrada de datos en línea: ¿Los datos se ingresan interactivamente? (Sí, en tu API).

    7.- Eficiencia del usuario final: ¿Se requiere que la interfaz sea extremadamente amigable/ergonómica? (En una API Backend esto suele ser bajo, en un Frontend es alto).

    8.- Actualización en línea: ¿Los datos se actualizan en tiempo real en la BD? (Sí, tu CRUD lo hace).

    9.- Procesamiento complejo: ¿Hay mucha lógica matemática, algorítmica o de seguridad?

    10.- Reusabilidad: ¿El código se diseñó para ser reutilizado en otras aplicaciones? (Al usar Spring y Arquitectura Hexagonal o Capas, solomos buscar esto).

    11.- Facilidad de instalación: ¿Es difícil desplegarlo? (Con Docker/Spring Boot suele ser fácil).

    12,.Facilidad de operación: ¿Requiere intervención manual para operar (backups manuales, etc.)?

    13.- Múltiples sitios: ¿Se instalará en múltiples organizaciones o lugares físicos?

    14.- Facilidad de cambios: ¿Qué tan fácil es modificarlo? (Queries flexibles, parámetros definidos por usuario).


La suma de los puntos de la encuesta nos dará en "TDI"

Aplicamos la fórmula del VAF: La fórmula estándar de IFPUG es:

VAF=(TDI×0.01)+0.65

Nota: El VAF siempre oscila entre 0.65 (baja complejidad técnica) y 1.35 (altísima complejidad técnica).

----------------------------------------------------------------------------------------------------------------------

Para el ejemplo de este CRUD se va a usar estos resultados:

GSC

    1.- Comunicación de datos: ¿Cuántos componentes de comunicación (protocolos, redes) requiere? (Tu API Rest tiene esto alto, probablemente un 4 o 5).
	4

    2.- Procesamiento distribuido: ¿Los datos o el proceso están en varios servidores?
	1

    3.- Rendimiento (Performance): ¿El tiempo de respuesta es crítico? (Ej. sistema en tiempo real).
	1

    4.- Configuración del equipamiento: ¿Se debe ejecutar en hardware muy específico o limitado?
	1

    5.- Tasa de transacciones: ¿Es un sistema con alto volumen de peticiones por segundo?
	1

    6.- Entrada de datos en línea: ¿Los datos se ingresan interactivamente? (Sí, en tu API).
	4

    7.- Eficiencia del usuario final: ¿Se requiere que la interfaz sea extremadamente amigable/ergonómica? (En una API Backend esto suele ser bajo, en un Frontend es alto).
	1

    8.- Actualización en línea: ¿Los datos se actualizan en tiempo real en la BD? (Sí, tu CRUD lo hace).
	4

    9.- Procesamiento complejo: ¿Hay mucha lógica matemática, algorítmica o de seguridad?
	1

    10.- Reusabilidad: ¿El código se diseñó para ser reutilizado en otras aplicaciones? (Al usar Spring y Arquitectura Hexagonal o Capas, solomos buscar esto).
	3

    11.- Facilidad de instalación: ¿Es difícil desplegarlo? (Con Docker/Spring Boot suele ser fácil).
	3

    12,.Facilidad de operación: ¿Requiere intervención manual para operar (backups manuales, etc.)?
	3

    13.- Múltiples sitios: ¿Se instalará en múltiples organizaciones o lugares físicos?
	2

    14.- Facilidad de cambios: ¿Qué tan fácil es modificarlo? (Queries flexibles, parámetros definidos por usuario).
	1
	
	Total: 30

    VAF = (30*0.01)+0.65 = 0.95

	AFP = 17 * 0.95 = 16.15


---------------------------------------------------

Despues calculamos las horas necesarias en total para el proyecto, de ejemplo pondremos que cada punto de funcion
vale 8 hrs y la hora va a costar 100 pesos

Asi que entonces

Esfuerzo = AFP x Hours = Man-Hour

Esfuerzo = 16.15 * 8 = 129.2 Man-Hour

Costo = Man-Hour * CostPerHour

Costo = 129.2 * 100 = 12,920