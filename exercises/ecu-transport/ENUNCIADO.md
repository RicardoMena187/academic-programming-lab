# Evaluación práctica de POO — ECU-TRANSPORT

**Lenguaje:** Java · **Tiempo:** 2 horas · **Total:** 10 puntos

Una empresa administra automóviles, motocicletas y camiones. Recibes tres clases hijas completas en `src/`. **No puedes modificarlas.** Implementa los archivos faltantes: `Vehiculo.java`, `Flota.java` y `Main.java`.

## Actividad 1 — Vehiculo.java (3 puntos)
A partir de las clases hijas deduce atributos comunes, encapsulamiento, constructor compatible con `super(...)`, getters necesarios y los métodos sobrescritos. El proyecto completo debe compilar sin modificar las clases recibidas.

## Actividad 2 — Flota.java (4 puntos)
Almacena vehículos de distintos tipos en `ArrayList<Vehiculo>`. Implementa:
- `agregarVehiculo(Vehiculo v)`: añade un vehículo.
- `mostrarVehiculos()`: imprime sus datos.
- `buscarPorPlaca(String placa)`: devuelve un vehículo o `null`.
- `vehiculoMayorCosto()`: devuelve el de mayor costo o `null` si está vacía.
- `calcularCostoTotal()`: suma costos, 0 si está vacía.

## Actividad 3 — Main.java (3 puntos)
Crear dos automóviles, dos motocicletas y dos camiones con datos distintos. Agregarlos a Flota, mostrar todos los objetos, buscar una placa existente, mostrar el de mayor costo y presentar costo total. No solicitar entradas por teclado.

## Entrega
Los seis archivos Java, explicación breve del diseño, evidencia real de compilación y salida de consola. Consulta la rúbrica pública en `rubrics/ecu-transport.md`.

**No se incluyen soluciones en este repositorio público.**
