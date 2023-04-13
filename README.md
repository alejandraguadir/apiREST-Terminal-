# apiREST-Terminal-
Proyecto de terminal para la gestión de buses, pasajeros y destinos. Para cumplir con los requerimientos, se crea los siguientes paquetes:
Model donde se crea las clases que representa a los objetos Bus, EticketPasajero, Pasajero, Viaje. En el paquete Repository se almacena y gestiona la persistencia de los datos para las anteriores clases mencionadas. En el paquete Service se maneja la lógica del negocio, BusService(se gestiona el objeto Bus, entorno a crear, eliminar y mostrar), PasajeroService (segestiona el objeto Pasajero en cuanto a registrar, eliminar y mostar pasajeros registrados) y ViajeService(se gestiona los viajes en cuanto a obtener, registrar  viajes con el bus y pasajeros asignados). En el paquete serviceInterface se declaran los métodos para implementar en los services y en el paquete Controller se maneja las solicitudes de POST, GET y DELETE para los objetos viaje, pasajero y bus.

### Para la ejecución del api Rest, se definieron las siguientes peticiones desde un localhost:
#### Gestión de buses
pst
#### GET: localhost:8001/api/v1/buses
#### DELETE: localhost:8001/api/v1/bus/{id}
#### POST: localhost:8001/api/v1/bus
#### Gestión de pasajeros
#### POST:  localhost:8001/api/v1/pasajero
#### DELETE: localhost:8001/api/v1/{id}
#### GET: localhost:8001/api/v1/pasajeros
#### Gestión de viajes
#### Devuelve viajes registrados, GET: localhost:8001/api/v1/viaje
#### Devuelve personas registradas en un viaje, GET: localhost:8001/api/v1/pasajerosParaViajar
#### Agrega un bus a viaje, POST: localhost:8001/api/v1/crearViaje
####  Agrega pasajeros a un bus, POST localhost:8001/api/v1/addPasajero
