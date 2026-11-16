# Academic Programming Lab · POO

Laboratorio abierto para aprender programación mediante **tutoría guiada**, **agentes especializados** y **skills pedagógicas**. Enfoque inicial: Java y Programación Orientada a Objetos; ampliable a C#, Python y C.

> **Para estudiantes:** comienza en [GUÍA DE ESTUDIO](docs/GUIA_ESTUDIANTE.md). No necesitas instalar ningún agente: puedes usar las instrucciones en ChatGPT u otra IA. Las skills ejecutables están dirigidas a entornos que admiten agentes.

## Inicio rápido
1. Abre [PROMPT_MASTER.md](PROMPT_MASTER.md) y copia el texto a una nueva conversación con tu asistente.
2. Indica: **"MODO ESTUDIANTE, Java, necesito estudiar herencia y polimorfismo; comienza con un diagnóstico y no me des la solución completa"**.
3. Responde las preguntas de conocimientos previos. Solicita pistas, pseudocódigo o solución explicada según lo necesites.
4. Estudia el caso [ECU-TRANSPORT](exercises/ecu-transport/ENUNCIADO.md). Las tres clases hijas están en `src/`; los archivos que debes crear aparecen en el enunciado.

## Para docentes
- [Guía docente](docs/GUIA_DOCENTE.md) y [rúbrica](rubrics/ecu-transport.md).
- [Reglas de orquestación](AGENTS.md), [agentes lógicos](agents/) y [skills locales](skills/).
- [Pruebas de aceptación](tests/README.md) para revisar soluciones sin repartir respuestas.
- **No se distribuyen soluciones completas en este repositorio público.** Conserva las soluciones de evaluación en un repositorio privado.

## Compatibilidad y límites
`AGENTS.md` proporciona instrucciones a agentes compatibles; `skills/*/SKILL.md` define capacidades reutilizables. En ChatGPT convencional estos archivos pueden usarse como instrucciones, pero **no crean subagentes reales automáticamente**. La búsqueda externa de skills requiere una herramienta instalada y permisos autorizados. Ningún resultado de compilación se presenta como verificado sin ejecutar un compilador.

## Contenido
- `PROMPT_MASTER.md` — metodología universal de resolución.
- `agents/` — seis roles especializados y orquestador.
- `skills/` — diagnóstico, POO, implementación, depuración y evaluación.
- `exercises/` — ejercicios con código proporcionado y consignas.
- `rubrics/` y `tests/` — criterios de evaluación y comprobación.

**Uso académico:** el estudiante debe poder explicar el código que entrega. Consulta las reglas de cada evaluación antes de usar asistencia con IA.
