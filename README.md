<img src="docs/logo_crowdar.png" alt="Crowdar Logo" width="350" style="margin-right: 100px;" /> <img src="docs/logo_lippia.png" alt="Lippia Logo" width="250" style="float: right; margin-left: 100px;" />

# Test Manager Performance - Proyecto K6

## Estructura del Proyecto

La estructura del proyecto ha sido reorganizada de la siguiente manera:

```
project-root/
├── config/                         # Configuraciones generales del proyecto
│   └── config.js
├── scenarios/                      # Scripts de escenarios de prueba
│   ├── demoFront/                  # Pruebas para la UI de Frontend
│   │   └── demoFrontk6.js
│   └── backend/                    # Pruebas para la API y Backend
│       ├── demok6.js
├── services/                       # Servicios que interactúan con la API o bases de datos
│   ├── getProject.js
│   ├── getProjectLtm.js
│   └── postRunLtm.js
├── auth/                           # Módulo para autenticación
│   └── token.js
├── reports/                        # Generación de reportes
│   ├── html                        # Reportes en formato HTML
│   └── summaries                   # Resúmenes de ejecuciones de pruebas
├── utils/                          # Utilidades generales
│   └── testsCache                  # Almacenamiento de caché
├── docs/                           # Documentación del proyecto
├── package.json
├── package-lock.json
├── .gitlab-ci.yml
└── README.md
```

## Descripción de Carpetas y Archivos

- **config/**: Contiene las configuraciones generales del proyecto, como los perfiles de prueba (peakLoad, stress, spike, soak).
- **scenarios/**: Contiene scripts de prueba organizados por tipo (frontend y backend).
- **services/**: Servicios que interactúan con APIs externas, como `getProject.js` y `postRunLtm.js`.
- **auth/**: Módulo de autenticación para obtener `accessToken` para las pruebas.
- **reports/**: Carpeta para almacenar los reportes generados, tanto en HTML como en resúmenes de texto.
- **utils/**: Utilidades generales del proyecto, como `testsCache`.
- **ci/**: Archivos de configuración para integración continua con GitLab CI/CD.
- **docs/**: Documentación del proyecto, incluyendo este README y los logos.

## Instrucciones de Ejecución

### Scripts de Prueba

Se han definido scripts en el archivo **package.json** para facilitar la ejecución de las pruebas:

- **peakLoad**: Ejecuta la prueba de carga de pico.
- **stress**: Ejecuta la prueba de stress.
- **spike**: Ejecuta la prueba de pico rápido (spike).
- **soak**: Ejecuta la prueba de saturación prolongada (soak).
- **demoFront**: Ejecuta las pruebas de la interfaz de usuario frontend.

Ejemplo de ejecución de prueba:

```
npm run peakLoad
```

## Contacto y Colaboración

Para contribuir al proyecto o reportar problemas, por favor contacta al equipo de **Crowdar** o **Lippia** utilizando los canales oficiales.



