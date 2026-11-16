# Agentes especializados

Los siguientes documentos describen **roles lógicos**. Los entornos con delegación real pueden adaptarlos a subagentes separados. En ChatGPT básico se aplican secuencialmente.

| ID | Agente | Instrucciones |
|---|---|---|
| A0 | Orquestador | [A0](orquestador.md) |
| A1 | Docente universitario | [A1](docente.md) |
| A2 | Programador | [A2](programador.md) |
| A3 | Investigador de skills | [A3](investigador.md) |
| A4 | Tutor socrático | [A4](tutor.md) |
| A5 | Verificador y depurador | [A5](verificador.md) |
| A6 | Auditor académico | [A6](auditor.md) |

El orquestador debe activar HITL y mantener un registro de decisiones. No invocar herramientas o skills sin soporte real.
